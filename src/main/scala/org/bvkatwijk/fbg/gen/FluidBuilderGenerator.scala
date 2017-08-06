package org.bvkatwijk.fbg.gen

import org.bvkatwijk.fbg.gen.inte.WithInterface
import org.bvkatwijk.fbg.gen.inte.BuildInterface
import org.bvkatwijk.fbg.gen.meth.WithMethod
import org.bvkatwijk.fbg.gen.meth.BuildMethod

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
""" + new WithMethod("firstField", "String", "BuildSingleFieldSample").create() + "\n" +
    new BuildMethod("firstField", "SingleFieldSample").create() + """

	}
""" + new WithInterface("firstField", "String", "BuildSingleFieldSample").create() + "\n" +
    new BuildInterface("SingleFieldSample").create() + "\n" + """
}
"""

  def generate(singleFieldClassSource: String): String = {
    singleFieldClassTarget
  }

}