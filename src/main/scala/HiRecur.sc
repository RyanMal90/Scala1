def Hirecur(S: String, x: Int): Unit ={
  if (x!= 0){
    Hirecur(S, x -1)
    println(S)
  }

}

Hirecur("Hi",3)
