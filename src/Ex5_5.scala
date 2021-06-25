

object Ex5_5 {
  def main(args: Array[String]): Unit = {
    val thisYear = 2016

    // 인수가 아직 존재하지는 않지만, _와일드카드를 통해 어떤 String 값이든 들어올 수 있다고 선언
    val fixedValueFunction = go(thisYear, _: String)

    fixedValueFunction("test1")
    fixedValueFunction("test2")
    fixedValueFunction("test3")

  }

  def go(thisYear: Int, string: String) = {
    println(string + " : " + thisYear)
  }
}