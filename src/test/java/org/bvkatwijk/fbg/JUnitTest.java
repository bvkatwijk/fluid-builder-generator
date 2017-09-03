package org.bvkatwijk.fbg;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

	@Test
	public void eclipseCanRunJunitNow() {
		Assert.assertEquals("Eclipse won't run my Scala Test unless it recognises this one", 2, 1 + 1);
	}

}
