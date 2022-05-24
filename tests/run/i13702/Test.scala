import scala.util.Try

object Test extends JavaAbstractClass {
  override def foo1: String = "implemented foo in scala 1"
  override val val1: String = "implemented val in scala 1"

  def main(args: Array[String]): Unit = {
    println(Try(javaFoo1()))
    println(Try(javaFoo2()))

    println(Try(javaVal1()))
    println(Try(javaVal2()))
  }
}