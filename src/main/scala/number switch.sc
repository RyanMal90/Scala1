def numSwitch(container: Any ) : Any = container match {
  case List(x,y, num @ _*) => List(y,x) :+ num
  //case numSwitch: Any => List(numSwitch(1),numSwitch(0))
  case numSwitch: Array[Int] => Array(numSwitch(1),numSwitch(0))
  case numSwitch: (Int, Int) => Tuple2(numSwitch ._2 , numSwitch ._1)
  case numSwitch: (Int, Int, Int, Int) => (numSwitch ._2 , numSwitch ._1)
  case _ => println("Couldn't match")
  }

numSwitch(List(1,2))
numSwitch(Array(1,2))
numSwitch(Tuple2(1,2))
numSwitch(Tuple4(1, 2, 3, 4))

numSwitch(List(1,2,3,4,5,6,7,8))