package com.evolution.chess.domain

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric._


type Row = Int Refined Interval.Closed[1, 8]
type Column = Int Refined Interval.Closed[1, 8]

case class Position(row: Row, col: Column)

final case class Board(pieces: Map[Position, Piece]) {
  def pieceAt(position: Position): Option[Piece] = {
    pieces.get(position)
  }

  def contains(position: Position): Boolean = {
    pieces.contains(position)
  }
}