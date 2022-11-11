package leetcode.week5;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class RomanToInteger {

	/*
	 * 13. Roman to Integer
	 * https://leetcode.com/problems/roman-to-integer/description/
	 * 
	 */
	@Test
	public void romanToInt1() {

		String s = "III";
		Assert.assertEquals(3, romanToInt(s));
	}

	@Test
	public void romanToInt2() {

		String s = "LVIII"; // 50+5+1+1+1
		Assert.assertEquals(58, romanToInt(s));
	}

	@Test
	public void romanToInt3() {

		String s = "MCMXCIV"; // 1000+100+1000+10+100+1+5
								// 1000+900+90+4
		Assert.assertEquals(1994, romanToInt(s));
	}

	/*
	 * Create a Map and pair the Roman letter with the equivalent number create two
	 * variables sum and temp iterate from last character to first check if the
	 * current letter value is greater than or equal to previous(temp) if condition
	 * meets add th value to sum or subtract the value from sum And put the current
	 * value to the temp After the iteration return the number
	 * 
	 */
	public int romanToInt(String s) {
		HashMap<Character, Integer> romanIntegerMap = new HashMap<>();
		romanIntegerMap.put('I', 1);
		romanIntegerMap.put('V', 5);
		romanIntegerMap.put('X', 10);
		romanIntegerMap.put('L', 50);
		romanIntegerMap.put('C', 100);
		romanIntegerMap.put('D', 500);
		romanIntegerMap.put('M', 1000);

		int sum = 0, temp = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			if (romanIntegerMap.get(s.charAt(i)) >= temp)
				sum += romanIntegerMap.get(s.charAt(i));
			else
				sum -= romanIntegerMap.get(s.charAt(i));
			temp = romanIntegerMap.get(s.charAt(i));
		}
		return sum;

	}
}
