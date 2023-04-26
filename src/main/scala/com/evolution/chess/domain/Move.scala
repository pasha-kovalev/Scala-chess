package com.evolution.chess.domain

case class StartPosition(position: Position) extends AnyVal

case class EndPosition(position: Position) extends AnyVal

final case class Move(player: Player, piece: Piece, from: StartPosition, to: EndPosition)
