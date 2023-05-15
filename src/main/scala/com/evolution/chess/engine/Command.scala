package com.evolution.chess.engine

import com.evolution.chess.domain.game.{GameId, Player}
import com.evolution.chess.domain.move.Move
import com.evolution.chess.domain.user.UserId

sealed trait Command

//Game commands
case class CreateGame(creator: UserId) extends Command

case class JoinGame(gameId: GameId, joinedUser: UserId) extends Command

case object Resign extends Command

case object Abort extends Command

//Piece commands
case class MovePiece(move: Move) extends Command

//Players commands
case class OfferDraw(by: Player) extends Command

case class AcceptDraw(by: Player) extends Command

case class DeclineDraw(by: Player) extends Command
