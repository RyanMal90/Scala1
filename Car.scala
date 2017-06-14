class Car(val col: String, val mod: String, val tyr: Int) extends Vehicle{
  var colour: String = col
  var model: String = mod
  var tyres: Int = tyr
  def spot: Unit ={
    println("Spotted a car: " + model + " with " + tyres + "wheels")
  }



}

