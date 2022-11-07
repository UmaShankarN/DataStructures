package week5class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindAllAnagramsOfString {

	/*
	 * 
	 * 
	 */
	@Test
	public void findAnagrams1() {

		String s = "cbaebabacd", p = "abc";
		Assert.assertEquals(Arrays.asList(0, 6), findAnagrams2(s, p));
		System.out.println(findAnagrams2(s, p));

	}

	@Test
	public void findAnagrams2() {

		String s = "abab", p = "ab";
		Assert.assertEquals(Arrays.asList(0, 1, 2), findAnagrams2(s, p));

	}

	
	@Test
	public void findAnagrams3() {

		String s = "a", p = "ab";
		Assert.assertEquals(Arrays.asList(), findAnagrams2(s, p));

	}
	/*
	 * Pseudocode Get the length of the string p add each chars of p to a Map
	 * iterate through s and get the substring of same length as p staring from 0 to
	 * s.length-p.length. Add each chars to a temp Map in each iteration
	 * compare two maps. if matches return the starting index of the first character in current iteration to a list
	 */

	public List<Integer> findAnagrams(String s, String p) {

		HashMap<Character, Integer> pMap = new HashMap<>();
		List<Integer> result = new ArrayList<>();

		for (char chars : p.toCharArray())
			pMap.put(chars, pMap.getOrDefault(chars, 0) + 1);

		for (int i = 0; i <= s.length() - p.length(); i++) {
			HashMap<Character, Integer> sMap = new HashMap<>();
			String n = s.substring(i, i + p.length());

			for (char chars : n.toCharArray())
				sMap.put(chars, sMap.getOrDefault(chars, 0) + 1);

			if (sMap.equals(pMap))
				result.add(i);

		}
		return result;
	}

	/*
	 * Optimised 
	 * sliding window goes from start to last
	 * in current iteration one value is removed and next value is added
	 * Check if the s string length is greater than or equal to p string length
	 * if it is less then return the empty list
	 * add each character and its count to a HashMap pMap
	 * get the first window of length p from the string s and it to sMap
	 * check if pMap and sMap matches, if matches add the index of first character to a list
	 * iterate from character at p length from string s to length of s
	 * reduce the value count of character at first index of s from sMap if it is >1 or remove the character
	 * And add the current character to the map
	 * if the pMap and sMap are equals, add the second index(start-p.length()+1) (as it is first index in the current iteration)
	 * to the list
	 * iterate until the last character is added to the sMap
	 * return the list of indexes
	 */

//String s = "cbaebabacd", p = "abc";
	public List<Integer> findAnagrams2(String s, String p) {
		
		List<Integer> result = new ArrayList<>();
		if(s.length()>=p.length()) {
		HashMap<Character, Integer> pMap = new HashMap<>();
		HashMap<Character, Integer> sMap = new HashMap<>();
		for (Character chars : p.toCharArray())
			pMap.put(chars, pMap.getOrDefault(chars, 0) + 1);

		System.out.println(pMap);
				
		for(int start =0;start<p.length();start++)
			sMap.put(s.charAt(start), sMap.getOrDefault(s.charAt(start), 0) + 1);
			
		if(sMap.equals(pMap)) 
				result.add(0);
			
		for(int start =p.length();start<s.length();start++) {
			
			if(sMap.get(s.charAt(start-p.length())) == 1) // remove first character
				sMap.remove(s.charAt(start-p.length()));
			else
				sMap.put(s.charAt(start-p.length()), sMap.get(s.charAt(start-p.length()))-1); //reduce the current character
			
			sMap.put(s.charAt(start), sMap.getOrDefault(s.charAt(start), 0) + 1);
			
			if(sMap.equals(pMap)) 
				result.add(start-p.length()+1);
			
		}
		
		} else
			return Arrays.asList();
		
		return result;
	}

}
