

object Ex7_2 {
  def main(args: Array[String]): Unit = {
    val arrayA = Array(13, "hi", 1.42) //자료형이 배열에서 자유롭다...
    for (x <- arrayA)
      println(x)
  }
}