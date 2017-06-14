abstract class Vehicle {
  var colour: String
  var model: String
  var tyres: Int
  def spot: Unit
  def showModel(): Unit = { println("Model" + model) }
  def showTyres(): Unit = {println("Number of tyres: " + tyres)}

  def carDetails: Unit ={
    println("Model:" + model + "Tyres:" + tyres)
  }
}
