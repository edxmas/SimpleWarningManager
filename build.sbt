name := "LinuxDay2015"

version := "0.1"

organization := "Eduard Natale"

lazy val root = (project in file(".")).enablePlugins(PlayJava, com.typesafe.sbt.web.SbtWeb)

scalaVersion := "2.11.6"

javacOptions := Seq("-Xlint:deprecation")

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

libraryDependencies ++= Seq(
  javaCore,
  javaJdbc,
  javaJpa,
  javaWs,
  "org.postgresql" % "postgresql" % "9.4-1203-jdbc42",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final",
  "commons-io" % "commons-io" % "2.4",
  "com.sun.mail" % "javax.mail" % "1.5.3",
  "com.vividsolutions" % "jts" % "1.13",
  "com.typesafe.play" % "play-cache_2.11" % "2.4.0"
)

libraryDependencies += evolutions

routesGenerator := InjectedRoutesGenerator

resolvers += Resolver.sonatypeRepo("snapshots")

PlayKeys.externalizeResources := false