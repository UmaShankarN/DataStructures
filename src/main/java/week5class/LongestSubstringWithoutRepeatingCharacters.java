package week5class;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {

	/*
	 * 3. Longest Substring Without Repeating Characters
	 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
	 * description/
	 * 
	 */
	@Test
	public void lengthOfLongestSubstring1() {

		String s = "abcabcbb";
		Assert.assertEquals(3, lengthOfLongestSubstring2(s));
	}

	@Test
	public void lengthOfLongestSubstring2() {

		String s = "pwwkew";
		Assert.assertEquals(3, lengthOfLongestSubstring2(s));
	}

	@Test
	public void lengthOfLongestSubstring3() {

		String s = "bbbbb";
		Assert.assertEquals(1, lengthOfLongestSubstring2(s));
	}

	@Test
	public void lengthOfLongestSubstring4() {

		String s = "abc.ABc";
		Assert.assertEquals(6, lengthOfLongestSubstring2(s));
	}

	@Test
	public void lengthOfLongestSubstring5() {

		String s = "";
		Assert.assertEquals(0, lengthOfLongestSubstring2(s));
	}

	@Test
	public void lengthOfLongestSubstring6() {

		String s = "aab";
		Assert.assertEquals(2, lengthOfLongestSubstring2(s));
	}

	
	@Test
	public void lengthOfLongestSubstring7() {

		String s = "dvdf";
		Assert.assertEquals(3, lengthOfLongestSubstring2(s));
	}
	
	/*
	 * Pseudocode: get all combinations of substring from the given string. by
	 * iterating through first index to length of the string and add it to a list.
	 * get each substring from the list and the each character of the substring from
	 * the current iteration, add it to a hashset. check if the set size and the
	 * substring length matches, if it is matches then the substring in the current
	 * iteration doesn't have duplicate values. store the length of the current
	 * substring to a size variable which takes only the maximum value of each
	 * iteration.
	 * 
	 */
	public int lengthOfLongestSubstring2(String s) {

		List<String> substrings = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			int end = i + 1;
			while (end <= s.length()) {
				substrings.add(s.substring(i, end));
				end++;
			}
		}
		System.out.println(substrings);

		int size = 0;
		for (String string : substrings) {
			HashSet<Character> schar = new HashSet<>();
			for (Character character : string.toCharArray())
				schar.add(character);
			if (schar.size() == string.length()) {
				size = Math.max(size, schar.size());
				System.out.println(size);}
		}
		// System.out.println(size);
		return size;

	}

	/*
	 * Optimised iterate from first to end if the character is in set clear the
	 * entries in the set and add the character from next iteration current
	 * iteration set size is stored in the maxSize variable after the iteration
	 * ends, the maximum value is returned
	 * 
	 */
	public int lengthOfLongestSubstring(String s) {
		
		HashSet<Character> newSet = new HashSet<>();
		int maxSize = 0, right=0,left=0;
		while(right < s.length() && left < s.length()){
            Character c = s.charAt(right);
            if (newSet.contains(c)){
            	newSet.remove(s.charAt(left));
                left++;
            }else {
            	newSet.add(c);
                int length = right - left + 1;
                right++;
                maxSize = Math.max(maxSize,length);
            }
        }
        return maxSize;
    }
}
