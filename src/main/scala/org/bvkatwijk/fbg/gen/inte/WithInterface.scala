package org.bvkatwijk.fbg.gen.inte

class WithInterface(fieldName: String, typeName: String, nextInterface: String) {

  def create(): String = {
    "\n" + "public static interface With" + fieldName.capitalize + " {" +
      "\n" + "" +
      "\n" + "  public " + nextInterface + " " + fieldName + "(" + typeName + " " + fieldName + ");" +
      "\n" + "" +
      "\n" + "}"
  }

}