package com.evolution.chess.domain

import com.evolution.chess.domain.board.Position

case class StartPosition(position: Position) extends AnyVal

case class EndPosition(position: Position) extends AnyVal

final case class Move(player: Player, piece: Piece, from: StartPosition, to: EndPosition)
