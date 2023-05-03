package com.evolution.chess

import cats.data.Writer
import cats.instances.all._
import cats.syntax.all._

object ToDelete {
  type Logged[A] = Writer[Vector[String], A]

  def main(args: Array[String]): Unit = {
    123.pure[Logged]
  }


}
