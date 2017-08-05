package org.bvkatwijk.fbg.micro.service.def;

import org.bvkatwijk.fbg.micro.service.config.Configuration;
import org.bvkatwijk.fbg.micro.service.config.NoConfiguration;

public final class MicroServiceDefaults {

	public static final String SERVLETS_URL_PATH = "/api/*";
	public static final String HOME_PAGE_FOLDER = "web";
	public static final String HOME_PAGE_FILENAME = "index.html";
	public static final String APPLICATION_NAME = "Application";
	public static final String SERVLET_PACKAGE = "org.bvkatwijk.api";
	public static final int PORT_NUMBER = 8080;
	public static final Configuration CONFIGURATION = new NoConfiguration();

	private MicroServiceDefaults() {
		throw new AssertionError(this.getClass().getSimpleName() + " not to be instantiated.");
	}

}
