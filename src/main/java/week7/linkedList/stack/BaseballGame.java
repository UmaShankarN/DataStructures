package week7.linkedList.stack;

import java.util.Stack;

import org.junit.Test;

import org.junit.Assert;

public class BaseballGame {

	/*
	 * https://leetcode.com/problems/baseball-game/description/
	 */
	@Test
	public void calPoints1() {
	
		String[] ops = {"5","2","C","D","+"};
		Assert.assertEquals(30, calPoints(ops));
	}
	
	@Test
	public void calPoints2() {
	
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		Assert.assertEquals(27, calPoints(ops));
	}
	
	@Test
	public void calPoints3() {
	
		String[] ops = {"1", "C"};
		Assert.assertEquals(0, calPoints(ops));
	}
	
	
	public int calPoints(String[] operations) {
		Stack<Integer> outStack = new Stack<>();

		for (String eachin:operations) {
			if (eachin.equals("C")) {
				outStack.pop();
			} else if (eachin.equals("D")) {
				outStack.push(2 * Integer.valueOf(outStack.peek()));
			} else if (eachin.equals("+")) {
				int a = Integer.valueOf(outStack.pop());
				int b = Integer.valueOf(outStack.pop());
				outStack.push(b);
				outStack.push(a);
				outStack.push(a + b);
			} else
				outStack.push(Integer.valueOf(eachin));

		}
		int temp = 0;
		for (int eachin : outStack) {
			temp += eachin;
		}

		return temp;

	}

}
