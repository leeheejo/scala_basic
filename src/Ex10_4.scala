import scala.util.Random
import Ex10_1.convertInputs
import Ex10_3.BallCount
import Ex10_3.calcBallCount
import scala.io.StdIn.readLine

object Ex10_4 {
  def main(args: Array[String]): Unit = {
    println("야구 게임을 시작합니다.")
    val ballList = Random.shuffle(0 to 9).drop(7)

    while (true) {
      print("숫자를 입력하세요 : ")
      val inputList = convertInputs(readLine)
      if (inputList != None) {
        val ballCount = calcBallCount(ballList, inputList.get)

        ballCount match {
          case BallCount(0, 0, 0) =>
            println("아웃입니다 ")
          case BallCount(3, 0, 0) =>
            println("3 스트라이크입니다. 프로그램을 종료합니다."); System.exit(0)
          case BallCount(strike, 0, 0) =>
            println(s"$strike 스트라이크!")
          case BallCount(0, ball, 0) =>
            println(s"$ball 볼!")
          case BallCount(strike, ball, 0) =>
            println(s"$strike 스트라이크! $ball 볼!")
          case _ =>
            println("처리불가")
        }
      } else {
        println("제대된 값을 입력하세요.")
      }
    }
  }
}