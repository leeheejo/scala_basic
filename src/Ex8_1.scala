

object Ex8_1 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    println(o)

    //    val n = o.map(i => i * 10)
    val n = o.map(_ * 10)
    println(n)

    val nn = o.foreach(i => i * 10) // 반환값이 없음
    println(nn)
    println(o)
  }
}

//List(1, 2, 3, 4)
//List(10, 20, 30, 40)
//()
//List(1, 2, 3, 4)
