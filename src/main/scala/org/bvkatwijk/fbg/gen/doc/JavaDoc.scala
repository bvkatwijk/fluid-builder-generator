package org.bvkatwijk.fbg.gen.doc

case class JavaDoc(content: String) {

  def get(): String = {
    "/** " + content + " */"
  }

}

object GeneratedFluidBuilder {

  def javaDoc(): String = {
    JavaDoc("2017-08-06 Generated Fluid Builder github.com/bvkatwijk/fluid-builder-generator").get
  }

}