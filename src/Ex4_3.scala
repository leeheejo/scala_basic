

object Ex4_3 {
  def main(args: Array[String]): Unit = {
    val apple = Fruit2("사과")
    println(apple.name)
    println(apple.hashCode())
  }
  case class Fruit2(name: String)
}