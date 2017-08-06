package org.bvkatwijk.fbg.gen.inte

import org.bvkatwijk.fbg.ScalaTest

class BuildInterfaceTest extends ScalaTest {
  
  "BuildInterface" should "generate for firstField: String targeting BuildSingleFieldSample" in {
    new BuildInterface("SingleFieldSample").create() should be("" +
      "\n" + "	public static interface BuildSingleFieldSample {" +
      "\n" + "" +
      "\n" + "		public SingleFieldSample build();" +
      "\n" + "" +
      "\n" + "	}")
  }
  
  it should "generate targeting SomeType" in {
    new BuildInterface("SomeType").create() should be("" +
      "\n" + "	public static interface BuildSomeType {" +
      "\n" + "" +
      "\n" + "		public SomeType build();" +
      "\n" + "" +
      "\n" + "	}")
  }

}