package com.evolution.chess.service

import cats.Functor
import com.evolution.chess.domain.auth.Password
import com.evolution.chess.domain.user.{User, UserName}
import dev.profunktor.auth.jwt.JwtToken
import pdi.jwt.JwtClaim

trait Auth[F[_]] {
  def login(username: UserName, password: Password): F[JwtToken]
}
trait UsersAuth[F[_], A] {
  def findUser(token: JwtToken)(claim: JwtClaim): F[Option[A]]
}

object UsersAuth {
  def user[F[_]: Functor]: UsersAuth[F, User] = new UsersAuth[F, User] {
    override def findUser(token: JwtToken)(claim: JwtClaim): F[Option[User]] = ???
  }
}


