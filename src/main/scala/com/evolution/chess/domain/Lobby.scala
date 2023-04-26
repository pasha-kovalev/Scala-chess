package com.evolution.chess.domain

import java.util.UUID

case class Lobby(games: Map[UUID, ChessGame])
