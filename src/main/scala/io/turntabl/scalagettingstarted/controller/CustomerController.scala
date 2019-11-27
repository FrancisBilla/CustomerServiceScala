package io.turntabl.scalagettingstarted.controller

import io.turntabl.scalagettingstarted.dao.CustomerDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/customers"))
class CustomerController (@Autowired private val customerDao: CustomerDao) {
  @GetMapping(Array("/list"))
  def list= customerDao.getAll
  println(list)

}
