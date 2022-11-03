package leetcode;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class SubstringsThreeDistinctCharacters {

	/*
	 * 1876. Substrings of Size Three with Distinct Characters
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/submissions/835114859/
	 */
	
	/*
	 * Pseudocode:
	 * Check if length of string is > 2 else return 0
	 * get the contiguous substring of length 3 and store it in String array
	 * declare a counter variable
	 * iterate through the string array
	 * declare a dynamic Character hashset that stores each string characters
	 * convert each string to character array and store it in set
	 * Check if the length of string matches the size of the set
	 * increment the counter if length matches
	 * return the counter value after the iteration
	 */
	
	@Test
	public void countGoodSubstrings1() {
		String s = "xyzzaz";
		Assert.assertEquals(1, countGoodSubstrings(s));
	}
	
	@Test
	public void countGoodSubstrings2() {
		String s = "aababcabc";
		Assert.assertEquals(4, countGoodSubstrings(s));
	}
	
	@Test
	public void countGoodSubstrings3() {
		String s = "x";
		Assert.assertEquals(0, countGoodSubstrings(s));
	}
	

	@Test
	public void countGoodSubstrings4() {
		String s = "xy";
		Assert.assertEquals(0, countGoodSubstrings(s));
	}
	
	   public int countGoodSubstrings(String s) {
		   
		   if(s.length()>2) {
		   String[] sarr = new String[s.length()-2];
		   
		   for(int i=0; i< s.length()-2;i++) 
			   sarr[i]=s.substring(i, i+3);
		   
		   int counter =0;
		   
		   for (String string : sarr) {
			   HashSet<Character> schar =new HashSet<>();
			   for (Character character : string.toCharArray()) 
				   schar.add(character);
			   if(schar.size() == string.length())
				   counter+=1;
		}
		   
		return counter;
	    }else 
	    	return 0;
	    
}
	   
//	   
//	   int count = 0;
//       int start=0;
//       if(s.length()<3) return 0;
//      HashMap<Character,Integer> hs =new HashMap();
//       for(int i=0;i<3;i++)
//       {
//           hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
//           
//       }
//      if(hs.size()==3) count++;
//       
//       for(int j=3;j<s.length();j++)
//       {
//           
//           hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j),0)+1);
//          if(hs.get(s.charAt(start))>1) hs.put(s.charAt(start),hs.get(s.charAt(start))-1);
//          else
//             hs.remove(s.charAt(start));
//          if(hs.size()==3) count++;
//          start++;
//      }
//   return count;
	   
}
