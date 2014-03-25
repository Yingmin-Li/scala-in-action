import java.io.FileInputStream
import scala.io.Source

object AutomatedResourceManagement {

  type Closable = {
    def close(): Unit
  }

  def withResource[A <: Closable, B](resource: A)(f: A => B): B =
    try f(resource) finally resource.close()

  def main(args: Array[String]): Unit = {
    val in = new FileInputStream("build.sbt")
    val buildSbt =
      withResource(in) { resource =>
        Source.fromInputStream(resource).getLines().mkString(f"%n")
      }
    println(f"```%n$buildSbt%n```")

    try {
      in.read() // This should throw an IOException for a closed resource!
      sys.error("IOExcetion was expected!")
    } catch {
      case _: java.io.IOException => () // That's expected!
    }
  }
}
