package com.evolution.chess.domain

sealed trait Color

object Color {
  case object White extends Color

  case object Black extends Color
}

sealed trait Piece {
  val color: Color
}

/*Can castle in two directions. King and corresponding rook must have empty space btw and have no moves b4
All squares btw rook and king must not be under attack
TODO or add CastlingMoveEvent, KingMoveEvent ...
*/
case class King(color: Color, hasMoved: Boolean = false) extends Piece

case class Queen(color: Color) extends Piece

case class Bishop(color: Color) extends Piece

case class Knight(color: Color) extends Piece

//hasMoved for king castle
case class Rook(color: Color, hasMoved: Boolean = false) extends Piece

case class Pawn(color: Color) extends Piece
