package interviewQs;

import org.junit.Assert;
import org.junit.Test;

public class CheckBlackorWhite {

	@Test
	public void blackOrWhite1() {
		Assert.assertEquals(true, blackOrWhite("a1"));
	}

	@Test
	public void blackOrWhite2() {
		Assert.assertEquals(false, blackOrWhite("b1"));
	}

	@Test
	public void blackOrWhite3() {
		Assert.assertEquals(true, blackOrWhite("b2"));
	}

	@Test
	public void blackOrWhite4() {
		Assert.assertEquals(false, blackOrWhite("c2"));
	}
	
	@Test
	public void blackOrWhite5() {
		Assert.assertEquals(false, blackOrWhite("i2"));
	}
	
	@Test
	public void blackOrWhite6() {
		Assert.assertEquals(false, blackOrWhite("a9"));
	}

	public boolean blackOrWhite(String s) {
		
		if (Character.getNumericValue(s.charAt(1)) < 1 ||Character.getNumericValue(s.charAt(1)) > 8)
			return false;

		if ((int) s.charAt(0) < 97 ||  (int)s.charAt(0) > 104)
			return false;

		

		if (((int)s.charAt(0)) % 2 != 0 && Integer.valueOf(s.charAt(1)) % 2 != 0
				|| ((int) s.charAt(0)) % 2 == 0 && Integer.valueOf(s.charAt(1) % 2) == 0)
			return true;
		
		
		return false;
	}
}
