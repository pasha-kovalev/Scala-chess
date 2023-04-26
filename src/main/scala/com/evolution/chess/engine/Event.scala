package com.evolution.chess.engine

import com.evolution.chess.domain.{GameId, Move, Piece, Player}

sealed trait Event

//Game events
case class GameCreated(gameId: GameId, creator: Player) extends Event

case class PlayerJoined(gameId: GameId, joinedUser: Player) extends Event

//todo? or just id instead of Player
case class GameStarted(gameId: GameId, player1: Player, player2: Player) extends Event

case object Aborted extends Event

case class GameWon(winner: Player) extends Event

case object GameDrawn extends Event

//Piece events
case class PieceMoved(move: Move) extends Event

case class PieceCaptured(move: Move, capturedPiece: Piece) extends Event

case class KingChecked(move: Move) extends Event

case class KingCheckmated(move: Move) extends Event

//Player events
case class DrawOffered(by: Player) extends Event

case class DrawAccepted(by: Player) extends Event

case class DrawDeclined(by: Player) extends Event

case class Resigned(by: Player) extends Event
