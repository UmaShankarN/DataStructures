package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class MostCommonWord {

	/*
	 * 819. Most Common Word
	 * https://leetcode.com/problems/most-common-word/description/
	 */
	
	/*
	 * Psuedocode
	 * Split the given paragraph by space or one of the symbols: "!?',;.". and save as String array
	 * create a hash map and store the count of each word
	 * Remove the banned word from hashmap
	 * create a temp int variable and temp string
	 * Iterate through the map keyset
	 * Check if value > temp and store the value in temp int and the key in temp string
	 * exit the loop after iteration
	 * return the temp word
	 */
	@Test
	public void mostCommonWord1() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		Assert.assertArrayEquals(new String[] {"ball"}, mostCommonWord(paragraph, banned));
	}
	
	@Test
	public void mostCommonWord2() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit","ball"};
		Assert.assertArrayEquals(new String[] {"the"}, mostCommonWord(paragraph, banned));
	}
	
	@Test
	public void mostCommonWord3() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit","the"};
		Assert.assertArrayEquals(new String[] {"ball"}, mostCommonWord(paragraph, banned));
	}
	
	@Test
	public void mostCommonWord4() {
		String paragraph = "a.";
		String[] banned = {""};
		Assert.assertArrayEquals(new String[] {"a"}, mostCommonWord(paragraph, banned));
	}
	
	@Test
	public void mostCommonWord5() {
		String paragraph = ".";
		String[] banned = {""};
		Assert.assertArrayEquals(new String[] {null}, mostCommonWord(paragraph, banned));
	}
	
	 public String[] mostCommonWord(String paragraph, String[] banned) {
		 String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9\\s+]", "").split("\\ |\\s+|\\!|\\?|\\'|,|\\;|\\.");
		
		 Map<String, Integer> countMap = new HashMap<String,Integer>();
		 
		 for(String string:words)
			 countMap.put(string,countMap.getOrDefault(string, 0)+1);
		 
		 for (String string : banned) 
			 	countMap.remove(string);
		 
		 String currentword = null;
		 int temp =0;
		 for (String string : countMap.keySet()) {
			if(temp<countMap.get(string)) {
				temp = countMap.get(string);
				currentword = string;
			}
		}
		 return new String[] {currentword};   
	    }

}
