package com.evolution.chess.domain

import com.evolution.chess.domain.board.Position
import com.evolution.chess.domain.game.Player
import com.evolution.chess.domain.piece.Piece
import io.estatico.newtype.macros.newtype

object move {
  @newtype
  final case class StartPosition(position: Position)

  @newtype
  final case class EndPosition(position: Position)

  final case class Move(player: Player, piece: Piece, from: StartPosition, to: EndPosition)

}
