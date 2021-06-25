

object Ex5_1 {
  def main(args: Array[String]): Unit = {
    println("반환 받은 값 :" + name())

  }

//  def name() = { // 반환값이 있을 때에도 반환 자료형과 return 을 생략할 수 있다.
//    val a = 10
//    a
//  }
  
  def name(): Int  = {
    val a = 10 
    return a
  }
}