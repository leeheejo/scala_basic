

object Ex5_4 { // call by name
  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(n: Int) = {
    println("탑승수속을 시작합니다.")
    n
  }

  def dropship(n: => Int) = { // 이렇게 표현하면 바깥의 함수를 먼저 실행하고 매개변수가 필요할 때 그것을 사용할 수 있음. => 이런 방식이 call by name
    println("드랍십 준비합니다.")
    println(n + "명 탑승 했습니다.")
  }
}

// result
//드랍십 준비합니다.
//탑승수속을 시작합니다.
//5명 탑승 했습니다.
