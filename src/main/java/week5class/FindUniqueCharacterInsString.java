package week5class;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class FindUniqueCharacterInsString {
	
	/*
	 * 387. First Unique Character in a String
	 * https://leetcode.com/problems/first-unique-character-in-a-string/
	 * 
	 */
	@Test
	public void firstUniqChar1() {
		
		String s ="leetcode";
		Assert.assertEquals(0,firstUniqChar2(s));
	}
	
	

	@Test
	public void firstUniqChar2() {
		
		String s ="loveleetcode";
		Assert.assertEquals(2,firstUniqChar2(s));
	}
	
	@Test
	public void firstUniqChar3() {
		
		String s ="aabb";
		Assert.assertEquals(-1,firstUniqChar2(s));
		
	}
	
	/*
	 * check if the first index and last index matches
	 * return the current index
	 * if no match found return -1
	 * 
	 */
	public int firstUniqChar(String s) {

		for (char chars : s.toCharArray()) { //O(N)
			if(s.indexOf(chars)== s.lastIndexOf(chars)) { //O(N) for index of and O(N) for last index of
				return s.indexOf(chars);
			}
		}
		
		return -1;
		

	}
	
	/*
	 * Pseudocode:
	 * Create a Map and add each character and occurrence 
	 * iterate through the keyset
	 * get each key and check if value of key is 1
	 * store the minimum index in the min integer variable
	 * if no match found and the min is Integer.MAX_VALUE return -1
	 * 
	 */
	
	public int firstUniqChar2(String s) {
		
		HashMap<Character, Integer> cmap = new HashMap<>();
		
		
		int min =Integer.MAX_VALUE;
		for (char c : s.toCharArray())
			cmap.put(c, cmap.getOrDefault(c, 0)+1);
		
		for (Character c : cmap.keySet()) {
			if(cmap.get(c)==1) 
				min = Math.min(min, s.indexOf(c));
		}
			if(min == Integer.MAX_VALUE)
				return -1;
		
		return min;
	}
	


}
