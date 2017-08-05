package org.bvkatwijk.fbg.micro.service.config;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

@FunctionalInterface
public interface Configuration {
	
	void configure(AbstractBinder binder);

}
