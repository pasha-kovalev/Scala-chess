package com.evolution.chess.service

import cats.ApplicativeThrow
import cats.effect.Sync

import java.util.UUID

trait UUIDGen[F[_]] {
  def create: F[UUID]

  def parse(str: String): F[UUID]
}

object UUIDGen {
  def apply[F[_] : Sync : UUIDGen]: UUIDGen[F] = new UUIDGen[F] {
    override def create: F[UUID] = Sync[F].delay(UUID.randomUUID())

    override def parse(str: String): F[UUID] = ApplicativeThrow[F].catchNonFatal(UUID.fromString(str))
  }
}