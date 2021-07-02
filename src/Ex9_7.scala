

object Ex9_7 {
  object Companion {
    private def ma = {}
    def mb = {}
  }
  class Companion {

    val a = Companion.ma
    val b = Companion.mb
  }
  
  def main(args: Array[String]): Unit = {
    println(Companion.mb)
  }
}