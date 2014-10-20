lazy val scalaInAction = project.in(file("."))

name := "scala-in-action"

libraryDependencies ++= List(
  Library.scalaTest
)

fork in run := true
