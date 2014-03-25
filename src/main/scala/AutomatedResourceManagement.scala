import java.io.FileInputStream
import scala.io.Source

object AutomatedResourceManagement {

  def main(args: Array[String]): Unit = {
    val in = new FileInputStream("build.sbt")
    val buildSbt =
      try
        Source.fromInputStream(in).getLines().mkString(f"%n")
      finally
        in.close() // Don't forget to close!
    println(f"```%n$buildSbt%n```")

    //    try {
    //      in.read()
    //      sys.error("IOExcetion was expected!")
    //    } catch {
    //      case _: java.io.IOException => () // That's expected!
    //    }
  }
}
