

object Ex8_3 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    println("foldLeft()")
    val n = o.foldLeft(0)({ (i, j) => println("i:" + i + ", j:" + j); i + j })

    println(n)

    println()
    println("foldRight()")
    val nn = o.foldRight(0)({ (i, j) => println("i:" + i + ", j:" + j); i + j })

    println(nn)
  }
}

//foldLeft()
//i:0, j:1
//i:1, j:2
//i:3, j:3
//i:6, j:4
//10
//
//foldRight()
//i:4, j:0
//i:3, j:4
//i:2, j:7
//i:1, j:9
//10

