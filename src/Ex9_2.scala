

object Ex9_2 {
  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 40, 55)
    val result = list.foldLeft(0)((i, j) => i + j)
    println(result)
  }
}