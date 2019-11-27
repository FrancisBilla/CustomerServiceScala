package io.turntabl.scalagettingstarted

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import io.turntabl.scalagettingstarted.dao.CustomerDao
@SpringBootApplication
class Config



//
//import org.springframework.context.annotation.{Bean, Configuration, ComponentScan}
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration
////import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
//import org.springframework.http.converter.HttpMessageConverter
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
//import com.fasterxml.jackson.databind.ObjectMapper
////import com.fasterxml.jackson.module.scala.DefaultScalaModule
//
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//class Config {
//  override def configureMessageConverters(converters: java.util.List[HttpMessageConverter[_]]) {
//    def mapper: ObjectMapper = createObjectMapper
//
//    mapper.registerModule(new DefaultScalaModule)
//
//    def converter = createJacksonHttpMessageConverter
//
//    converter.setObjectMapper(mapper)
//
//    converters.add(converter)
//  }
//
//  @Bean
//  def createJacksonHttpMessageConverter = new MappingJackson2HttpMessageConverter
//
//  @Bean
//  def createObjectMapper = new ObjectMapper
//}