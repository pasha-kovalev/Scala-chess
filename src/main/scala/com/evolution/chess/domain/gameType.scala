package com.evolution.chess.domain


object gameType {
  sealed trait GameType

  object GameType {
    case object ClassicGame extends GameType

    case object Game960 extends GameType
  }
}

