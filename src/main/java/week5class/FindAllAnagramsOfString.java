package week5class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindAllAnagramsOfString {
	
	@Test
	public void findAnagrams1() {
		
		String s = "cbaebabacd", p = "abc";
		Assert.assertEquals(Arrays.asList(0,6), findAnagrams2(s,p));
		
	}
	
	@Test
	public void findAnagrams2() {
		
		String s = "abab", p = "ab";
		Assert.assertEquals(Arrays.asList(0,1,2), findAnagrams2(s,p));
		
	}
	
	
	/*
	 * Pseudocode
	 * Get the length of the string p
	 * add each chars of p to a Map
	 * iterate through s and get the substring of same length as p staring from 0 to s.length-p.length
	 * Add each chars to a temp Map
	 * for each iteration compare two maps
	 * if matches return the starting index of the first character in a list
	 */
	
	

	   public List<Integer> findAnagrams(String s, String p) {
		   
		   HashMap<Character, Integer> pMap = new HashMap<>();
		   List<Integer> result =new ArrayList<>();
		   
		   for (char chars : p.toCharArray())
			   pMap.put(chars, pMap.getOrDefault(chars, 0)+1);
		   
		   for(int i=0; i<=s.length()-p.length();i++) {
			   HashMap<Character, Integer> sMap = new HashMap<>();
			   String n = s.substring(i,i+p.length());
			   
			   for (char chars : n.toCharArray())
				   sMap.put(chars, sMap.getOrDefault(chars, 0)+1);
			  
			   if(sMap.equals(pMap)) 
				   result.add(i);
			   
		   }
		return result;
	    }
	   
	   

		/*
		 * begin =0
		 * end <s.length
		 * decrease the p map count if the current char is found
		 * Not working
		 */
		

	   public List<Integer> findAnagrams2(String s, String p) {
		   
		   HashMap<Character, Integer> pMap = new HashMap<>();
		   for (Character chars : p.toCharArray())
			   pMap.put(chars, pMap.getOrDefault(chars, 0)+1);
			   
			System.out.println(pMap);
		   List<Integer> result =new ArrayList<>();
		   int start=0,end =0;
		   
		   while(end<s.length()) {
			   
			   if(pMap.containsKey(s.charAt(end))) {
				   pMap.put(s.charAt(end), pMap.get(s.charAt(end))-1);
				   
			   }
			  
			   
		   }
		   
		   
		
		return result;
	    }
	
	
}
