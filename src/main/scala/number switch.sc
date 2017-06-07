def numSwitch[T](container: T) : Unit = {
  container match {
    case numSwitch: List[Int] => println(numSwitch(1) + " " + numSwitch(0))
    case numSwitch: Array[Int] => println(numSwitch(1) + " " + numSwitch(0))
    case numSwitch: Tuple1[Int] => println(numSwitch(Tuple1._2) + " " + numSwitch(Tuple1._1))
    case _ => println("Couldn't match")
    }
}

numSwitch(List(1,2))
numSwitch(Array(1,2))
numSwitch(Tuple1(1,2))