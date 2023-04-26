package com.evolution.chess.domain

import java.util.UUID

case class User(id: UserId, name: UserName, rank: Rating)

case class UserId(value: UUID) extends AnyVal

case class UserName private(value: String) extends AnyVal

object UserName {
  def create(value: String): Option[UserName] =
    if (value.nonEmpty)
      Some(UserName(value))
    else None
}

case class Rating(value: Int) extends AnyVal