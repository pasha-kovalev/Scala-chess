name := "Chess"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.8"

scalacOptions ++= List("-Ymacro-annotations", "-Yrangepos", "-Wconf:cat=unused:info")

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.9.0",
  "org.typelevel" %% "cats-effect" % "3.4.8",
  "eu.timepit" %% "refined" % "0.10.3",
  "io.estatico"   %% "newtype" % "0.4.4",
  "dev.profunktor" %% "http4s-jwt-auth" % "1.0.0",
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
)
