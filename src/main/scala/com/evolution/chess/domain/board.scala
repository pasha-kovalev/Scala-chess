package com.evolution.chess.domain

import com.evolution.chess.domain.piece.Piece
import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric._
import io.estatico.newtype.macros.newtype

object board {
  @newtype
  case class Row(value: Int Refined Interval.Closed[1, 8])

  @newtype
  case class Column(value: Int Refined Interval.Closed[1, 8])

  case class Position(row: Row, col: Column)

  @newtype
  final case class Board(pieces: Map[Position, Piece]) {
    def pieceAt(position: Position): Option[Piece] = {
      pieces.get(position)
    }

    def contains(position: Position): Boolean = {
      pieces.contains(position)
    }
  }
}