package com.evolution.chess.domain

sealed trait GameType

object GameType {
  case object ClassicGame extends GameType

  case object Game960 extends GameType
}
