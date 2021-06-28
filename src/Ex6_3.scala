

object Ex6_3 {
  def main(args: Array[String]): Unit = {
    val num1 = "010-222-2222"
    val num2 = "119"
    val num3 = "포도먹은돼지"
    val numList = List(num1, num2, num3)

    for (number <- numList) {
      number match {
        case Emergency() => println("긴급연락처")
        case Normal(number) => println("일반전화 - " + number)
        case _ => println("판단불가")
      }
    }
  }

}

object Emergency {
  def unapply(number: String): Boolean = {
    if (number.length == 3 && number.forall(_.isDigit)) true
    else false
  }
}

object Normal {
  def unapply(number: String): Option[Int] = {
    try {
      var o = number.replaceAll("-", "")
      Some(number.replaceAll("-", "").toInt)
    } catch {
      case _: Throwable => None
    }
  }
}