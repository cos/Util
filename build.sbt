// set the name of the project
name := "Util"

version := "1.0"

organization := "IBM"

javaSource in Compile <<= baseDirectory(_ / "src")

libraryDependencies += "junit" % "junit" % "4.+"
