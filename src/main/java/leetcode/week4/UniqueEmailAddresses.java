package leetcode.week4;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueEmailAddresses {

	@Test
	public void numUniqueEmails1() {

		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		Assert.assertEquals(2, numUniqueEmails(emails));
	}

	@Test
	public void numUniqueEmails2() {

		String[] emails = { "a@leetcode.com", "b@leetcode.com", "c@leetcode.com" };
		Assert.assertEquals(3, numUniqueEmails(emails));
	}

	public int numUniqueEmails(String[] emails) {

		HashSet<String> eSet = new HashSet<>();
		for (String eachin : emails) {

			String r = "";
			int afterat = eachin.indexOf('@');
			String l = eachin.substring(afterat, eachin.length());
			if (eachin.indexOf('+') != -1) {
				int index = eachin.indexOf('+');
				r = eachin.substring(0, index).replace(".", "");
			} else {
				int index = eachin.indexOf('@');
				r = eachin.substring(0, index).replace(".", "");
			}

			eSet.add(r + l);

		}

		return eSet.size();
	}

}
