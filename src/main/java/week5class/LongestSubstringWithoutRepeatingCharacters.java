package week5class;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {
	
	@Test
	public void lengthOfLongestSubstring1() {
		
		String s = "abcabcbb";
		Assert.assertEquals(3, lengthOfLongestSubstring(s));
	}

	@Test
	public void lengthOfLongestSubstring2() {
		
		String s = "pwwkew";
		Assert.assertEquals(3, lengthOfLongestSubstring(s));
	}
	
	@Test
	public void lengthOfLongestSubstring3() {
		
		String s = "bbbbb";
		Assert.assertEquals(1, lengthOfLongestSubstring(s));
	}
	
	@Test
	public void lengthOfLongestSubstring4() {
		
		String s = "abc.ABc";
		Assert.assertEquals(6, lengthOfLongestSubstring(s));
	}
	
	
	public int lengthOfLongestSubstring(String s) {
		
		List<String> substrings = new ArrayList<>();
		
		
		for(int i=0; i< s.length();i++) {
			int end =i+1;
			   while(end<=s.length()) {
				   substrings.add(s.substring(i,end));
				   end++;
			   }
		}
		  // System.out.println(substrings);
		   
		   int size=0;
		   for (String string : substrings) {
			   HashSet<Character> schar =new HashSet<>();
			   for (Character character : string.toCharArray()) 
				   schar.add(character);
			   if(schar.size() == string.length())
				  size =Math.max(size, schar.size());
		}
		//System.out.println(size);
		return size;
	        
	    }

	
}
