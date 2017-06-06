def FizzBuzz(num: Int): Unit ={
  if (num <= 15){
    (num%3, num%5) match {
      case (0,0) => println("fizzbuzz")
      case (0,_) => println("fizz")
      case (_,0) => println("buzz")
      case _ => println(num)
    }
      FizzBuzz(num+1)
  }
}
FizzBuzz(1)