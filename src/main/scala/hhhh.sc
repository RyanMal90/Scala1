def Hirecur(S: String, x: Int, y: Int): Unit ={
 var h = S*x
  println(h)

  if (y!= 0){
    Hirecur(S, x,y-1)
    //println(S)
  }

}

Hirecur("H",4,4)