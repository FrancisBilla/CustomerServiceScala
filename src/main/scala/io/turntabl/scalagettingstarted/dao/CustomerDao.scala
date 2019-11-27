package io.turntabl.scalagettingstarted.dao

import java.sql.ResultSet

import io.turntabl.scalagettingstarted.model.CustomerTO
import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.jdbc.core.{JdbcTemplate, RowMapper}
import org.springframework.stereotype.{Component, Service}

@Service
class CustomerDao @Autowired()(val dataSource: DataSource) {

  private val jdbcTemplate = new JdbcTemplate(dataSource)

  def getAll = jdbcTemplate.query("select * from customers",
    CustomerMapper)

  def getById(id: Int): CustomerTO = jdbcTemplate.queryForObject("select * from customers where id = ?", CustomerMapper, java.lang.Integer.valueOf(id))

  def getByName(name:String): CustomerTO = jdbcTemplate.queryForObject("select * from customers where name like ?", CustomerMapper, java.lang.String.valueOf(name))
}
@Bean
object CustomerMapper extends RowMapper[CustomerTO] {
  def mapRow(rs: ResultSet, rowNum: Int): CustomerTO = {
    val id =rs.getInt("id")
    val name = rs.getString("name")
    val phone = rs.getString("phone")
    val address = rs.getString("address")
    val email = rs.getString("email")
    CustomerTO(id,name,phone,address, email)

  }
}

