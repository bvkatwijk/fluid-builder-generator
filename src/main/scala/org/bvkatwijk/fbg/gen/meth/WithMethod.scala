package org.bvkatwijk.fbg.gen.meth

class WithMethod(fieldName: String, typeName: String, nextInterface: String) {

	def create(): String = {
			"\n" + "		@Override" +
					"\n" + "		public " + nextInterface + " " + fieldName + "(" + typeName + " " + fieldName + ") {" +
					"\n" + "			this." + fieldName + " = " + fieldName + ";" +
					"\n" + "			return this;" +
					"\n" + "		}"
	}

}