package org.bvkatwijk.fbg.gen.inte

class BuildInterface(nextInterface: String) {
  
  def create(): String = {
    "\n" + "	public static interface Build" + nextInterface.capitalize + " {" +
      "\n" + "" +
      "\n" + "		public " + nextInterface + " build();" +
      "\n" + "" +
      "\n" + "	}"
  }

}