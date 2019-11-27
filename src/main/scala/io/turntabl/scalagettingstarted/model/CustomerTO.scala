package io.turntabl.scalagettingstarted.model

case class CustomerTO(val id: Option[Int], val name: String, val phone: String, val address: String, val email: String)
