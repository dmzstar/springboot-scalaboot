package org.bighoefaces.springboot.scalaboot.controllers

import org.bighoefaces.springboot.scalaboot.User
import org.bighoefaces.springboot.scalaboot.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, ResponseBody}


@Controller
@RequestMapping(value = Array("/users"))
class UserController {

  @Autowired
  var userRepository:UserRepository = _

  @GetMapping(value = Array("/index",""))
  def index = "users/index"

  @GetMapping(value = Array("/list"))
  def list = {
    val user = new User()
    val list = userRepository.findByUsername("user0")
    "users/list"
  }

  @GetMapping(value = Array("/create"))
  def create:String = "users/create"

  @GetMapping(value = Array("/edit"))
  def edit:String = "users/edit"

}


@Controller
@RequestMapping(value = Array("/api/users"))
class UserApiController {

  @Autowired
  var userRepository:UserRepository = _

  @GetMapping(value = Array(""))
  @ResponseBody
  def list:Any = userRepository.findAll()

}