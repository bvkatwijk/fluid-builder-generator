package org.bvkatwijk.fbg.gen.meth

class BuildMethod(fieldName: String, nextInterface: String) {

	def create(): String = {
			"\n" + "		@Override" +
					"\n" + "		public " + nextInterface + " build() {" +
					"\n" + "			return new " + nextInterface + "(" + fieldName + ");" +
					"\n" + "		}"
	}

}