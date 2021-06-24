

object Ex4_2 {
  def main(args: Array[String]): Unit = {
    val apple = new Fruit("사과")
    println(apple.name)
  }
}

class Fruit(input: String) {
  var name = input
}