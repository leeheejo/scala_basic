

object Ex7_4 {
  def main(args: Array[String]): Unit = {
    val list1 = "a" :: "b" :: "c" :: Nil
    val list2 = "d" :: "e" :: "f" :: Nil
    val list0 = list1 ::: list2

    for (x <- 0 until list0.size)
      println(list0(x))
  }
}
// 결과 값 
//a
//b
//c
//d
//e
//f


//    val list0 = list1 :: list2 
//
//    for (x <- 0 until list0.size)
//      println(list0(x))
// => :: 두개로 이어붙인 경우 결과 값 
// List(a, b, c)
//d
//e
//f
