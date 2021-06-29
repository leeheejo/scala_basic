

object Ex7_10 {
  def main(args: Array[String]): Unit = {
    val list = List("a", "b", "c")
    val i = list.iterator
    while (i.hasNext)
      println(i.next())
  }
}