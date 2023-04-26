package com.evolution.chess.engine

import cats.data.NonEmptyList
import com.evolution.chess.engine.GameEngine._

//TODO append-only storage of events, snapshots
//todo? 1) Events don't directly update a data store. They're simply recorded for handling at the appropriate time
// 2)The current state of the entity can be obtained from the snapshot and by replaying any events that occurred after that point in time
trait GameEngine[F[_]] {
  // Accepts command and stale state for data load
  // returns function that accepts actual state
  // and either directive with list of events or an error
  def load(cmd: Command, stale: State): F[State => F[Either[Throwable, Directive[F]]]]
}

object GameEngine {
  //new state after applied events
  final case class Change(state: State, event: NonEmptyList[Event])

  //Holding Change with new state and event caused it and effect that must be executed after events are persisted
  final case class Directive[F[_]](change: Change, effect: F[Unit])
}

//To append events to journal
trait Append[F[_]] {
  def apply(events: NonEmptyList[Event]): F[Unit]
}





