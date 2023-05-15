package com.evolution.chess.domain

import com.evolution.chess.domain.game.ChessGame
import io.estatico.newtype.macros.newtype

import java.util.UUID

object lobby {
  @newtype
  case class Lobby(games: Map[UUID, ChessGame])

}
