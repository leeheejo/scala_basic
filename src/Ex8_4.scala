

object Ex8_4 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.partition(i => i < 3)
    println(n)

    val (result1, result2) = o.partition(x => { x % 3 == 0 })
    //print result
    println(result1)
    println(result2)
  }
}

//(List(1, 2),List(3, 4))
//List(3)
//List(1, 2, 4)
