package com.evolution.chess.service

import cats.data.{NonEmptyChain, Validated}

object error {
  type AllErrorsOr[A] = Validated[NonEmptyChain[ValidationError], A]

  sealed trait ValidationError

  case object GameNotInProgressError extends ValidationError

  case object InvalidMoveError extends ValidationError

}


