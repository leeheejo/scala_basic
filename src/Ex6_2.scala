

object Ex6_2 {
  case class Person(name: String, age: Int, rank: String)

  def main(args: Array[String]): Unit = {
    val person1 = Person("이멋남", 47, "부회장") //case class는 new 생략이 가능
    val person2 = Person("김쾌남", 73, "회장")
    val person3 = Person("김솔로", 27, "사원")
    val person4 = Person("김솔로", 27, "대리")

    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
    matchAndHi(person4)
  }

  def matchAndHi(person: Person): Unit = person match {
    case Person("이멋남", 47, "부회장") => println("부회장님 오셨습니다.")
    case Person("김쾌남", 73, "회장") => println("회장님 오셨습니다.")
    case Person(name, age, "사원") => if (age > 25) println(name + " " + age + "살이구나.")
    case _ => println("매치되는 결과가 없습니다.")
    //    case Person("김솔로", 27, _) => println("어 솔로 왔니?")
    //    case Person("김솔로", 27, r) => println(r + "님이 입장하셨습니다. ")
  }
}