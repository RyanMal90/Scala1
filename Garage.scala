/**
  * Created by Administrator on 12/06/2017.
  */
class Garage {
  val VehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
  val EmployeeBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]

  def addV(inV: Vehicle )=
  {
    VehicleArrayBuffer += inV
  }
  def remV(remV: Vehicle) = {

}
