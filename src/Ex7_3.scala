

object Ex7_3 {
  def main(args: Array[String]): Unit = {
    val list = "a" :: "b" :: "c" :: Nil
    for (x <- 0 until list.size)
      println(list(x))
  }
}