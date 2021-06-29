

object Ex7_6 {
  def main(args: Array[String]): Unit = {
    var map = Map(
      "number1" -> "aa",
      "number2" -> "bb",
      "number3" -> "3")

    map += ("number5" -> "this is the fifth value")

    println(map.isEmpty)
    println("whole map : " + map)
    println("keys : " + map.keys)
    println("values : " + map.values)

    println(map("number1"))
  }
}