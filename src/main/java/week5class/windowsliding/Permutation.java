package week5class.windowsliding;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Permutation {

	/*
	 * 567. Permutation in String
	 * https://leetcode.com/problems/permutation-in-string/description/
	 * 
	 */

	@Test
	public void checkInclusion1() {

		String s1 = "ab", s2 = "eidbaooo";
		Assert.assertEquals(true, checkInclusion(s1,s2));
	}
	
	@Test
	public void checkInclusion2() {

		String s1 = "ab", s2 = "eidboaoo";
		Assert.assertEquals(false, checkInclusion(s1,s2));
	}

	/*
	 * Pseudocode: Given the target length s1.length to determine the window size
	 * Check if the s1 string length is greater than or equal to s2 string length if
	 * it is less then return false add each character of s1 and its count to a
	 * HashMap s1map get the first window of length s1 from the string s2 and add it
	 * to s2map check if s1map and s2map matches, if matches return true iterate
	 * from character at s1 length from string s2 to length of s2 reduce the value
	 * count of character at first index of s2 from s2map if it is >1 or remove the
	 * character And add the current character to the s2map if the s1map and s2map
	 * are equals, return true and exit else iterate until the last character is
	 * added to the s2map return false after the last iteration
	 */

	public boolean checkInclusion(String s1, String s2) {

		if (s2.length() < s1.length()) {
			return false;
		}
		Map<Character, Integer> s1map = new HashMap<>();
		Map<Character, Integer> s2map = new HashMap<>();

		for (char c : s1.toCharArray())
			s1map.put(c, s1map.getOrDefault(c, 0) + 1);

		for (int i = 0; i < s1.length(); i++)
			s2map.put(s2.charAt(i), s2map.getOrDefault(s2.charAt(i), 0) + 1);

		if (s1map.equals(s2map))
			return true;
		//System.out.println(s2map);
		for (int i = s1.length(); i < s2.length(); i++) {

			if (s2map.get(s2.charAt(i - s1.length())) == 1)
				s2map.remove(s2.charAt(i - s1.length()));
			else
				s2map.put(s2.charAt(i - s1.length()), s2map.get(s2.charAt(i - s1.length())) - 1);

			s2map.put(s2.charAt(i), s2map.getOrDefault(s2.charAt(i), 0) + 1);

			//System.out.println(s2map);
			if (s2map.equals(s1map))
				return true;

		}

		return false;

	}
}