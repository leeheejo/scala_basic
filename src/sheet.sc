object sheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val a = 10                                      //> a  : Int = 10
  10+20                                           //> res0: Int(30) = 30
  
  val list = List(1,2,3,4,5)                      //> list  : List[Int] = List(1, 2, 3, 4, 5)
  val set = Set("hey!", "banga~")                 //> set  : scala.collection.immutable.Set[String] = Set(hey!, banga~)
  
  list.foldRight(5)((result,i)=>result+i)         //> res1: Int = 20
  set.foldRight("hi")((result,i)=>result+i)       //> res2: String = hey!banga~hi
}