class Bike(val col: String, val mod: String, val tyr: Int) extends Vehicle{
  var colour: String = col
  var model: String = mod
  var tyres: Int = tyr

  def spot: Unit ={
    println("The colour is: " + colour + "Spotted a Vehicle : " + model + " with " + tyres + "wheels")
  }

  override def toString: String = "The colour is: " + colour + "Spotted a Vehicle: " + model + " with " + tyres + "wheels"


}

