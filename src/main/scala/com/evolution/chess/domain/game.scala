package com.evolution.chess.domain

import com.evolution.chess.domain.board.Board
import com.evolution.chess.domain.gameStatus.GameStatus
import com.evolution.chess.domain.gameType.GameType
import com.evolution.chess.domain.piece.Color
import com.evolution.chess.domain.user.{User, UserId}
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.string.Uuid
import io.estatico.newtype.macros.newtype

import java.util.UUID

object game {
  @newtype
  case class GameId(value: UUID)

  case class Player(user: User, color: Color)

  case class ChessGame(id: GameId,
                       gameType: GameType,
                       status: GameStatus,
                       player1: Player,
                       player2: Option[Player],
                       board: Board,
                       isPrivate: Boolean)


  @newtype
  case class PlayerIdParam(value: String Refined Uuid)

  case class CreateGameDto(
                            gameType: GameType,
                            playerId: PlayerIdParam,
                            isPrivate: Boolean
                          ) {
    def mapToDomain: CreateGame =
      CreateGame(
        gameType,
        UserId(UUID.fromString(playerId.value)),
        isPrivate
      )
  }

  case class CreateGame(
                         gameType: GameType,
                         playerId: UserId,
                         isPrivate: Boolean
                       )
}






