package org.bighoefaces.springboot.scalaboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootConfig

object SpringbootScalabootApplication {

  def main(args:Array[String]):Unit = {
    SpringApplication.run(classOf[SpringbootConfig],args:_*)
  }

}
