

object Ex7_5 {
  def main(args: Array[String]): Unit = {
    val list3 = "a" :: "b" :: "c" :: Nil
    val list4 = 1 :: 2 :: 3 :: Nil
    val list5 = 2 :: 2 :: 4 :: Nil

    println(list3 ++ list4)
    println(list3.apply(0))
    println(list4.max)
    println(list4.min)
    println(list4.sum)
    println(list4.mkString(","))
    println(list4.exists(a => a > 3))
    println(list4.exists(_ > 3))
    println(list4.contains(1))
    println(list4.isEmpty)
    println(list5.distinct) // 중복없이 반환

  }
}

// 결과    
//List(a, b, c, 1, 2, 3)
//a
//3
//1
//6
//1,2,3
//false
//false
//true
//false
//List(2, 4)