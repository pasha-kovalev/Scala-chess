package com.evolution.chess.domain

import java.util.UUID

case class GameId(value: UUID) extends AnyVal

case class Player(user: User, color: Color)

//TODO use @newtype and @derive, Validate that players have different color
case class ChessGame(id: GameId,
                     gameType: GameType,
                     status: GameStatus,
                     player1: Player,
                     player2: Option[Player],
                     board: Board,
                     isPrivate: Boolean)





