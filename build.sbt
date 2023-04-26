name := "Chess"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.9.0",
  "org.typelevel" %% "cats-effect" % "3.4.8",
  "eu.timepit" %% "refined" % "0.10.3",
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
)
