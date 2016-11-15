name := """Coupon"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)