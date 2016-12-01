name := """Coupon"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
libraryDependencies += "com.adrianhurt" %% "play-bootstrap" % "1.0-P25-B3"
lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)