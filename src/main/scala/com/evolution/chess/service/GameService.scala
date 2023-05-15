package com.evolution.chess.service

import com.evolution.chess.domain.game.GameId
import com.evolution.chess.engine.CreateGame

trait GameService[F[_]] {
  def create(game: CreateGame): F[GameId]
}
