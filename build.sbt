name := "antlr4_case"

version := "0.1"

scalaVersion := "2.13.1"

// https://mvnrepository.com/artifact/org.antlr/antlr4
//libraryDependencies += "org.antlr" % "antlr4" % "4.8.1"

//Compile / javaSource := baseDirectory.value / "java"

//// sbt 0.13.x
antlr4Settings
//

antlr4Version in Antlr4 := "4.8" // default: 4.7.2

antlr4GenListener in Antlr4 := false // default: true

antlr4GenVisitor in Antlr4 := true // default: false
