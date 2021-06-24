

object Ex4_1 {
  def main(args: Array[String]): Unit = {
    var car = new Vehicle()
    println(car)
    println(car.hood)
  }
}

class Vehicle() {
  var price: Int = 100000
  var hood: String = "expensive hood"
}