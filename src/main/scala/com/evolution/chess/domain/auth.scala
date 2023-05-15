package com.evolution.chess.domain

import com.evolution.chess.domain.user.UserName
import eu.timepit.refined.auto._
import eu.timepit.refined.types.all.NonEmptyString
import io.estatico.newtype.macros.newtype

object auth {
  @newtype
  case class Password(value: String)

  @newtype
  case class EncryptedPassword(value: String)

  @newtype
  case class PasswordParam(value: NonEmptyString) {
    def toDomain: Password = Password(value)
  }

  @newtype
  case class UserNameParam(value: NonEmptyString) {
    def toDomain: UserName = UserName(value.toLowerCase)
  }

  case class LoginUser(
                        username: UserNameParam,
                        password: PasswordParam
                      )


}
