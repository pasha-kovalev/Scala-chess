package com.evolution.chess.domain

//todo? do we need statuses if there are corresponding events like GameFinished...
sealed trait GameStatus

object GameStatus {
  case object WaitingForPlayers extends GameStatus

  case object InProgress extends GameStatus

  case object Finished extends GameStatus
}
