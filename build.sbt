name := "beeswax_protobuf_scala"

version := "1.0-SNAPSHOT"

organization in ThisBuild := "co.adamatic.site"

scalaVersion := "2.11.8"

crossPaths := false

libraryDependencies ++= Seq(
  "com.trueaccord.scalapb" %% "compilerplugin" % "0.4.20"
)

import com.trueaccord.scalapb.{ScalaPbPlugin => PB}

PB.scalapbVersion := "0.4.20"

PB.protobufSettings

PB.flatPackage in PB.protobufConfig := true

PB.runProtoc in PB.protobufConfig := (args =>
  com.github.os72.protocjar.Protoc.runProtoc("-v300" +: args.toArray))

