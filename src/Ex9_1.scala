

object Ex9_1 {
  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 40, 55)

    def foreach(list: List[Int]) = {
      def add(list: List[Int], total: Int): Int = {
        list match {

          case List() => total
          case List(item) => total + item
          case head :: tail => { println(tail + " " + head); add(tail, total + head) }
        }
      }
      add(list, 0)
    }
    println(foreach(list))
  }
}
//head는 맨 최근의 하나의 데이터 
//tail은 나머지 List 
//List(20, 40, 55) 10
//List(40, 55) 20
//List(55) 40
//125
