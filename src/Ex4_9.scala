

object Ex4_9 {
  def main(args: Array[String]): Unit = {
    val robot = new Mazinga
    println(robot.shoot)
  }

  class Mazinga extends Robot with M16 with Bazooka with Daepodong

  abstract class Robot {
    def shoot = "뿅"
  }

  trait M16 extends Robot {
    override def shoot = super.shoot + "빵야"
  }

  trait Bazooka extends Robot {
    override def shoot = super.shoot + "뿌왕"
  }

  trait Daepodong extends Robot {
    override def shoot = super.shoot + "콰르릉"
  }
}