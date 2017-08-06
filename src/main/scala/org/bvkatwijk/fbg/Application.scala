package org.bvkatwijk.fbg

import org.bvkatwijk.micro.service.MicroService

object Application {

  def main(args: Array[String]): Unit = {
    MicroService.builder(getClass)
      .applicationName("Fluid Builder Generator")
      .homePageFolder("src/main/resources")
      .homePageFileName("index.html")
      .build()
      .start();
  }

}