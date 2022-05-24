
class ScalaClass extends A

object Test {
  def main(args: Array[String]): Unit =
//    val obj = new JavaClass_2
//    assert(obj.a == 1)

    assert((new ScalaClass).a == 1)
}
