package org.bvkatwijk.fbg.gen.meth

import org.bvkatwijk.fbg.ScalaTest

class BuildMethodTest extends ScalaTest {

	"BuildMethod" should "generate for firstField targeting SingleFieldSample" in {
		new BuildMethod("firstField", "SingleFieldSample").create() should be("" +
				"\n" + "		@Override" +
				"\n" + "		public SingleFieldSample build() {" +
				"\n" + "			return new SingleFieldSample(firstField);" +
				"\n" + "		}")
	}
	
	it should "generate for number targeting SomeType" in {
		new BuildMethod("number", "SomeType").create() should be("" +
				"\n" + "		@Override" +
				"\n" + "		public SomeType build() {" +
				"\n" + "			return new SomeType(number);" +
				"\n" + "		}")
	}

}