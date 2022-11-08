package leetcode.week5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;

public class BuddyStrings {

	
	/*
	 * 859. Buddy Strings
	 * https://leetcode.com/problems/buddy-strings/description/
	 * 
	 */
	@Test
	public void buddyStrings1() {

		String s = "ab", goal = "ba";
		Assert.assertEquals(true, buddyStrings(s, goal));
	}
	
	@Test
	public void buddyStrings2() {

		String s = "aa", goal = "aa";
		Assert.assertEquals(true, buddyStrings(s, goal));
	}
	
	@Test
	public void buddyStrings3() {

		String s = "abcd", goal = "bacd";
		Assert.assertEquals(true, buddyStrings(s, goal));
	}

	
	@Test
	public void buddyStrings4() {

		String s = "abcaa", goal = "abcbb";
		Assert.assertEquals(false, buddyStrings(s, goal));
	}
	

	@Test
	public void buddyStrings5() {

		String s = "abab", goal = "abab";
		Assert.assertEquals(true, buddyStrings(s, goal));
	}
	
	/*
	 * check if the s and goal length matches, return false if the length don't match
	 * check if the string s and goal are equal
	 * if equal add the characters of s to a set and return true if the set size is less than the length of s
	 * if the string and goal are not equal
	 * as there is one swap required to match the goal, add the character to two separate list
	 * if the character at the same index doesn't match and increment the counter
	 * once all the characters are checked and added
	 * check if the counter is 2 and the characters added to the list are matching in the opposite index
	 * return true if the above condition satisfies
	 * return false if none of the above conditions met 
	 */
	
	public boolean buddyStrings(String s, String goal) {
		// example: s=ab, goal = bac
		if (s.length() != goal.length())
			return false;

		// example: s=aa, b=aa
		// example: s=ab, b= ab
		if (s.equals(goal)) {
			HashSet<Character> unique = new HashSet<>();
			for (char schars : s.toCharArray())
				unique.add(schars);

			if (unique.size() < s.length())
				return true;
		}
		int counter = 0;
		List<Character> slist = new ArrayList<>();
		List<Character> goallist = new ArrayList<>();

		// if same length, example s= abcd, goal =bacd
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != goal.charAt(i)) {
				slist.add(s.charAt(i));
				goallist.add(goal.charAt(i));
				counter += 1;
			}
		}
		// a b c d
		// b a c d
		if ((counter == 2 && slist.get(0) == goallist.get(1) && slist.get(1) == goallist.get(0)))
			return true;

		return false;

	}
}
