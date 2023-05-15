package com.evolution.chess.domain

import io.estatico.newtype.macros.newtype

import java.util.UUID

object user {
  @newtype
  case class Rating(value: Int)

  @newtype
  case class UserId(value: UUID)

  @newtype
  case class UserName private(value: String)

  case class User(id: UserId, name: UserName, rank: Rating)

  object UserName {
    def create(value: String): Option[UserName] =
      if (value.nonEmpty)
        Some(UserName(value))
      else None
  }

}
