package org.bvkatwijk.fbg.sample;

import lombok.Value;

@Value
public class SingleFieldSampleTarget {

	private final String firstField;

	public static WithFirstField builder() {
		return new SingleFieldSampleTargetBuilder();
	}

	/** 2017-08-06 Generated Fluid Builder github.com/bvkatwijk/fluid-builder-generator */
	public static class SingleFieldSampleTargetBuilder implements WithFirstField, BuildSingleFieldSampleTarget {

		private String firstField;
		
		@Override
		public BuildSingleFieldSampleTarget firstField(String firstField) {
			this.firstField = firstField;
			return this;
		}

		@Override
		public SingleFieldSampleTarget build() {
			return new SingleFieldSampleTarget(firstField);
		}

	}

	public static interface WithFirstField {

		public BuildSingleFieldSampleTarget firstField(String firstField);

	}

	public static interface BuildSingleFieldSampleTarget {

		public SingleFieldSampleTarget build();

	}

}
