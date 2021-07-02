

object Ex9_4 {
  def main(args: Array[String]): Unit = {
    print("값을 입력하세요. ")
    val input = scala.io.StdIn.readLine()
    val result: Either[String, Int] = try {
      Right(input.toInt)
    } catch {
      case e: Exception => Left(input)
    }

    println(result.getClass)
  }
}