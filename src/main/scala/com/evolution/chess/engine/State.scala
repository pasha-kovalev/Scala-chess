package com.evolution.chess.engine

import com.evolution.chess.domain.ChessGame

//TODO? what to store here: Game, Board OR move game parameters to state and store state in Game
case class State(game: ChessGame) {
  def withEvent(event: Event): State = event match {
    case GameCreated(gameId, creator) => ???
    case PlayerJoined(gameId, joinedUser) => ???
    case GameStarted(gameId, player1, player2) => ???
    case Aborted => ???
    case GameWon(winner) => ???
    case GameDrawn => ???
    case PieceMoved(move) => ???
    case PieceCaptured(move, capturedPiece) => ???
    case KingChecked(move) => ???
    case KingCheckmated(move) => ???
    case DrawOffered(by) => ???
    case DrawAccepted(by) => ???
    case DrawDeclined(by) => ???
    case Resigned(by) => ???
  }
}
