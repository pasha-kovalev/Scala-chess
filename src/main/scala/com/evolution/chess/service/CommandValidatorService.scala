package com.evolution.chess.service

import cats.data.{NonEmptyChain, NonEmptyList, Validated}
import com.evolution.chess.domain.gameStatus.GameStatus.InProgress
import com.evolution.chess.engine._
import com.evolution.chess.service.error._

trait CommandValidatorService[F[_]] {
  def validate(cmd: Command, state: State): AllErrorsOr[NonEmptyList[Event]]
}

object CommandValidatorService {
  def make[F[_]](): CommandValidatorService[F] = new CommandValidatorService[F] {
    override def validate(cmd: Command, state: State): AllErrorsOr[NonEmptyList[Event]] = cmd match {
      case CreateGame(creator) => ???
      case JoinGame(gameId, joinedUser) => ???
      case Resign => ???
      case Abort => ???
      case MovePiece(move) =>
        if (state.game.status != InProgress)
          Validated.Invalid(NonEmptyChain.one(GameNotInProgressError))
        //TODO move to Move validation service
        else if (move.piece.color != move.player.color)
          Validated.Invalid(NonEmptyChain.one(InvalidMoveError))
        else
          Validated.Valid(NonEmptyList.one(PieceMoved(move)))
      case OfferDraw(by) => ???
      case AcceptDraw(by) => ???
      case DeclineDraw(by) => ???
    }
  }
}
