package io.turntabl.scalagettingstarted.model

import org.json4s.native.Serialization
import org.json4s._
case class CustomerTO( val id:Int,
                       val name: String,
                       val phone: String,
                       val address: String,
                       val email: String) {
  def this() = this(0, "", "", "","")
}

case class Speaker(name:String, age:Int)
object liftJson extends App {
  val customer = CustomerTO(1, "Bill", "028", "Accra", "okay")
  val sp = Speaker("Ann", 4)
  implicit val format = Serialization.formats(NoTypeHints)
//  val jsonString= write(customer)
  val jsonString= Serialization.write(customer)

  println(jsonString)
}