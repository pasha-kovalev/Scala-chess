package com.evolution.chess.domain


object gameStatus {
  sealed trait GameStatus

  object GameStatus {
    case object WaitingForPlayers extends GameStatus

    case object InProgress extends GameStatus

    case object Finished extends GameStatus
  }
}

