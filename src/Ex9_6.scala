

object Ex9_6 {
  object Object1 {
    private def ma = {}
    def mb = {}
  }
  object Object2 {
    // private컴파일에러
    //      val a = Object1.ma
    val b = Object1.mb
  }
  def main(args: Array[String]): Unit = {
    println(Object1.mb)
    println(Object2.b)
  }
}