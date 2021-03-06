package org.bvkatwijk.fbg.gen

import org.bvkatwijk.fbg.ScalaTest

class FBGTest extends ScalaTest {

  val singleFieldClassSource = """
package org.bvkatwijk.fbg.sample;

import lombok.Value;

@Value
public class SingleFieldSample {
	
	private final String firstField;

}
"""
  
    val singleFieldClassTarget = """
package org.bvkatwijk.fbg.sample;

import lombok.Value;

@Value
public class SingleFieldSample {

	private final String firstField;

	public static WithFirstField builder() {
		return new SingleFieldSampleBuilder();
	}

	/** 2017-08-06 Generated Fluid Builder github.com/bvkatwijk/fluid-builder-generator */
	public static class SingleFieldSampleBuilder implements WithFirstField, BuildSingleFieldSample {

		private String firstField;

		@Override
		public BuildSingleFieldSample firstField(String firstField) {
			this.firstField = firstField;
			return this;
		}

		@Override
		public SingleFieldSample build() {
			return new SingleFieldSample(firstField);
		}

	}

	public static interface WithFirstField {

		public BuildSingleFieldSample firstField(String firstField);

	}

	public static interface BuildSingleFieldSample {

		public SingleFieldSample build();

	}

}
"""

  "Fluid Builder Generator" should "produce matching result on basic case" in {
    new FluidBuilderGenerator().generate(singleFieldClassSource) should be(singleFieldClassTarget)
  }

}