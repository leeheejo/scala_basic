

object Ex10_3 {
  def calcBallCount(ballList: Seq[Int], inputList: Seq[Int]): BallCount = {
    var strikes = 0
    var balls = 0
    var outs = 0

    for (i <- 0 until ballList.size) {
      if (ballList(i) == inputList(i)) strikes == strikes + 1
      else if (inputList.contains(ballList(i))) balls = balls + 1
    }
    BallCount(strikes, balls, outs)
  }
  case class BallCount(strikes: Int, balls: Int, outs: Int)
}