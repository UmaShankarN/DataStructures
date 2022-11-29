package leetcode.week8;

import java.util.ArrayDeque;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNumber {

	@Test
	public void reverseNumber1() {

		int N = 54321;
		Assert.assertEquals(12345, reverseNumber(N));
	}

	@Test
	public void reverseNumber2() {

		int N = 10011;
		Assert.assertEquals(11001, reverseNumber(N));
	}

	@Test
	public void reverseNumber3() {

		int N = 1;
		Assert.assertEquals(1, reverseNumber(N));
	}

	// BruteForce
	public int reverseNumber(int N) {
		String s = "";
		while (N > 0) {
			s += String.valueOf(N % 10);
			N = N / 10;
		}

		return Integer.valueOf(s);

	
	}
	


}
