

object Ex4_6 {
  def main(args: Array[String]): Unit = {
    val pig = new Animal
    pig.eat
    pig.run
  }

  class Animal extends Eating with Running{
    def eat = println("먹습니다. 쩝쩝 ~~")
    override def run = println("달려랏~~~") // 오버라이드 예약어를 통해 오버라이드 할 수 있고, 이 예약어가 없이 재정의하면 컴파일 에러가 난다.
  }

  trait Swimming {
    def swim = println("수영을 합니다. 촤아~~")
  }

  trait Flying {
    def fly = println("납니다. 휘리릭 ~~")
  }

  trait Running {
    def run = println("달립니다. 슈웅 ~~")
  }

  trait Eating {
    def eat
  }
}