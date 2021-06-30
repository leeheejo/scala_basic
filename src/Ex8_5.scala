

object Ex8_5 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val oo = List(5, 6, 7, 8, 9)

    val n = o zip oo
    val nn = o ::: oo

    println(n)
    println(nn)
    
    
    val nnn = n.unzip
    println(nnn)
  }
}
//결과
//zip 첫번째 리스트와 두번째 리스트를 튜플형태로 묶어서 반환함. 안맞는 부분은 버림 (9) 
//List((1,5), (2,6), (3,7), (4,8)) 

// :::
//List(1, 2, 3, 4, 5, 6, 7, 8, 9)


//unzip
//(List(1, 2, 3, 4),List(5, 6, 7, 8))
