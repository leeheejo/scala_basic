

object Ex7_1 {
  def main(args: Array[String]): Unit = {
    val arrayA = Array(1, 2, 3, 4, 5) // 초기 값을 지정해서 선언하는 경우에는 굳이 자료형을 명시하지 않아도 알아서 자료형을 할당한다.
    for (x <- arrayA)
      println(x)

    val arrayB = Array("a", "b", "c", "d")
    for (x <- arrayB)
      println(x)
  }
}