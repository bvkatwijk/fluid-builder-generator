package org.bvkatwijk.fbg.gen.inte

import org.bvkatwijk.fbg.ScalaTest

class WithInterfaceTest extends ScalaTest {

  "WithInterface" should "generate for firstField: String targeting BuildSingleFieldSample" in {
    new WithInterface("firstField", "String", "BuildSingleFieldSample").create() should be("" +
      "\n" + "	public static interface WithFirstField {" +
      "\n" + "" +
      "\n" + "		public BuildSingleFieldSample firstField(String firstField);" +
      "\n" + "" +
      "\n" + "	}")
  }

  it should "generate for number: int targeting NextInterface" in {
    new WithInterface("number", "int", "NextInterface").create() should be("" +
      "\n" + "	public static interface WithNumber {" +
      "\n" + "" +
      "\n" + "		public NextInterface number(int number);" +
      "\n" + "" +
      "\n" + "	}")
  }

}