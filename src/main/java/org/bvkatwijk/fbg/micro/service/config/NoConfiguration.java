package org.bvkatwijk.fbg.micro.service.config;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class NoConfiguration implements Configuration {

	@Override
	public void configure(AbstractBinder binder) {
		// No configuration
	}

}
