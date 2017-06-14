/**
  * Created by Administrator on 13/06/2017.
  */
object main extends App {
var a = new Garage
  var b = new Bike("Denim Black", "Harley Davidson", 2)
  var c = new Customer(1, "Billy", "Baker" ,21 ,"Cheery blossom Hill" )
  var d = new Employee(20, "Jason", "Bourne" ,28,"Langley Virginia" )
  a.addV(b)
  println(a.VehicleArrayBuffer.size)
  println(b.toString)
  println(c.toString)
  println(d.toString)
}
