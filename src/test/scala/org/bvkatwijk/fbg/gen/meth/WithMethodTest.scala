package org.bvkatwijk.fbg.gen.meth

import org.bvkatwijk.fbg.ScalaTest
import org.bvkatwijk.fbg.gen.inte.WithInterface

class WithMethodTest extends ScalaTest {

	"WithMethod" should "generate for firstField: String targeting BuildSingleFieldSample" in {
		new WithMethod("firstField", "String", "BuildSingleFieldSample").create() should be("" +
				"\n" + "		@Override" +
				"\n" + "		public BuildSingleFieldSample firstField(String firstField) {" +
				"\n" + "			this.firstField = firstField;" +
				"\n" + "			return this;" +
				"\n" + "		}")
	}
	
	it should "generate for number: int targeting SomeType" in {
		new WithMethod("number", "int", "SomeType").create() should be("" +
				"\n" + "		@Override" +
				"\n" + "		public SomeType number(int number) {" +
				"\n" + "			this.number = number;" +
				"\n" + "			return this;" +
				"\n" + "		}")
	}

}