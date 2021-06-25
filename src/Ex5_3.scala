

object Ex5_3 { // call by value 
  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(n: Int) = {
    println("탑승수속을 시작합니다.")
    n
  }

  def dropship(n: Int) = {
    println("드랍십 준비합니다.")
    println(n + "명 탑승 했습니다.")
  }

}

//탑승수속을 시작합니다.
//드랍십 준비합니다.
//5명 탑승 했습니다.
