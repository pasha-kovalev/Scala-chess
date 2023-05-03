package com.evolution.chess.service

import com.evolution.chess.domain.Color.White
import com.evolution.chess.domain._
import com.evolution.chess.domain.board._
import eu.timepit.refined.auto._

//TODO Rewrite to GetAllPossibleMoves
// so when castle validate is king under check in all squares <- service of all possible moves with unique positions
//TODO Capture piece: if move valid -> if opponent piece on end position -> capture
//TODO? How to track previous move for  en passant
// check is piece on the board
class MoveValidationService {
/*  def validate(move: Move, board: Board): Boolean = {
    if (isOccupiedBySameColor(move, board)) false
    else if (!isPathClear(board, move.from, move.to)) false
    else
      move.piece match {
        case King(color, hasMoved) =>
          isKingMove(move.from, move.to) &&
            isPathClear(board, move.from, move.to)
        case Queen(color) => ???
        case Bishop(color) => ???
        case Knight(color) => ???
        case Rook(color, hasMoved) => ???
        case Pawn(color) => ???
      }
  }*/

 /* private def isOccupiedBySameColor(move: Move, board: Board): Boolean = {
    board.pieceAt(move.to.position) match {
      case Some(piece) if piece.color == move.player.color => true
      case _ => false
    }
  }

  def isKingMove(from: StartPosition, to: EndPosition): Boolean = {
    math.abs(to.position.col - from.position.col) <= 1 && math.abs(to.position.row - from.position.row) <= 1
  }

  def isPathClear(board: Board, from: StartPosition, to: EndPosition): Boolean = {
    if (isLinearMove(from, to)) {
      isStraightPathClear(board, from, to)
    } else {
      isDiagonalPathClear(board, from, to)
    }
  }

  private def isLinearMove(from: StartPosition, to: EndPosition): Boolean = {
    from.position.row == to.position.row || from.position.col == to.position.col
  }

  private def isStraightPathClear(board: Board, from: StartPosition, to: EndPosition): Boolean = {
    if (from.position.row == to.position.row) {
      val minCol = math.min(from.position.col, to.position.col) + 1
      val maxCol = math.max(from.position.col, to.position.col) - 1
      val path = (minCol until maxCol).map(col => Position(from.position.row, col))
      path.forall(pos => !board.contains(pos))
    } else {
      val minRow = math.min(from.position.row, to.position.row) + 1
      val maxRow = math.max(from.position.row, to.position.row) - 1
      val path = (minRow + 1 until maxRow - 1).map(row => Position(row, from.position.col))
      path.forall(pos => !board.contains(pos))
    }
  }

  def isDiagonalPathClear(board: Board, from: StartPosition, to: EndPosition): Boolean = {
    val rowDiff = to.position.row - from.position.row
    val colDiff = to.position.col - from.position.col
    val rowDir = if (rowDiff > 0) 1 else -1
    val colDir = if (colDiff > 0) 1 else -1
    val path = (1 until math.abs(rowDiff)).map(i => Position(from.position.row + i * rowDir, from.position.col + i * colDir))
    path.forall(pos => !board.contains(pos))
  }

  def isForwardMove(from: StartPosition, to: EndPosition, color: Color): Boolean = {
    if (color == White) {
      to.position.row.value == from.position.row + 1
    } else {
      to.position.row.value == from.position.row - 1
    }
  }

  def isDiagonalMove(from: StartPosition, to: EndPosition): Boolean = {
    math.abs(to.position.col - from.position.col) == math.abs(to.position.col - from.position.col)
  }

  def isLShapedMove(from: StartPosition, to: EndPosition): Boolean = {
    val rowDiff = math.abs(to.position.row - from.position.row)
    val colDiff = math.abs(to.position.col - from.position.col)
    (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)
  }
*/
}
