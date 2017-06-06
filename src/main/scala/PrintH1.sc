def printHi(str: String, int: Int): Unit ={
  var a = 0
  for (a <- 1 to int) {
    println(str)
  }


}
printHi("Hi", 3)