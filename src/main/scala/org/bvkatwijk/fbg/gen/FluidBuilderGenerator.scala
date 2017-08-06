package org.bvkatwijk.fbg.gen

import org.bvkatwijk.fbg.gen.inte.WithInterface
import org.bvkatwijk.fbg.gen.inte.BuildInterface

class FluidBuilderGenerator {

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
""" + new WithInterface("firstField", "String", "BuildSingleFieldSample").create() + "\n" +
    new BuildInterface("SingleFieldSample").create() + "\n" + """
}
"""

  def generate(singleFieldClassSource: String): String = {
    singleFieldClassTarget
  }

}