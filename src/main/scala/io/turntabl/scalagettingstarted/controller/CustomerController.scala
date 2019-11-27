package io.turntabl.scalagettingstarted.controller

import org.json4s.native.Serialization
import org.json4s._
import io.turntabl.scalagettingstarted.dao.CustomerDao
import io.turntabl.scalagettingstarted.model.CustomerTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/customers"))
class CustomerController (@Autowired private val customerDao: CustomerDao) {
  implicit val format = Serialization.formats(NoTypeHints)

  @GetMapping(Array("/list"))
  def list= Serialization.write(customerDao.getAll)

  @RequestMapping(Array("/{id}"))
  def get(@PathVariable("id") id: Int)={
    Serialization.write( customerDao.getById(id))
  }


  @RequestMapping(Array("/search/{name}"))
  def getByName(@PathVariable("name") name:String)={
    Serialization.write( customerDao.getByName(name))
  }
}
