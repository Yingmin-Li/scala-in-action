import sbt._

object Version {
  val scala     = "2.11.4"
  val scalaTest = "2.2.2"
}

object Library {
  val scalaTest = "org.scalatest" %% "scalatest" % Version.scalaTest
}
