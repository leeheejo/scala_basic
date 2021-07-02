import scala.io.StdIn.readLine
import java.io.PrintWriter
import java.io.File

object Ex9_5 {
  def main(args: Array[String]): Unit = {
    val fileName = "Ex9_5 result.txt"
    var input = readLine("파일에 쓸내용을 입력하세용 :")

    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close

    println("입력하신 " + input + "텍스트를" + fileName + " 에 저장했습니당/ ")
  }
}