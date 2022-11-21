package week7.linkedList.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

import org.junit.Assert;

public class ValidParentheses {

	/*
	 * https://leetcode.com/problems/valid-parentheses/
	 */
	@Test
	public void validParantheses1() {

		Assert.assertEquals(true, validParantheses("()"));
	}

	@Test
	public void validParantheses2() {

		Assert.assertEquals(true, validParantheses("()[]{}"));
	}

	@Test
	public void validParantheses3() {

		Assert.assertEquals(false, validParantheses("(]"));
	}

	@Test
	public void validParantheses4() {

		Assert.assertEquals(false, validParantheses("]"));
	}

	@Test
	public void validParantheses5() {

		Assert.assertEquals(false, validParantheses("({])}"));
	}

	public boolean validParantheses(String s) {
		Map<Character, Character> inputMap = new HashMap<>();
		inputMap.put('{', '}');
		inputMap.put('(', ')');
		inputMap.put('[', ']');

		Stack<Character> inStack = new Stack<>();

		for (char c : s.toCharArray()) {

			if (inputMap.containsKey(c))
				inStack.push(c);

			else if (inStack.empty()) // "]"
				return false;

			else if ((c == '}' && inStack.peek() == '{') || (c == ')' && inStack.peek() == '(')
					|| (c == ']' && inStack.peek() == '['))
				inStack.pop();

			else
				return false;

		}

		if (inStack.empty())
			return true;

		return false;

	}

}
