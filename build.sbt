name := """hollow-consumer"""
organization := "pl.pracuj"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

resolvers += Resolver.mavenLocal


libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.netflix.hollow" % "hollow" % "2.6.8"
libraryDependencies += "poc.bigdata" % "hollow-simple-producer" % "1.0-SNAPSHOT"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "pl.pracuj.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "pl.pracuj.binders._"
