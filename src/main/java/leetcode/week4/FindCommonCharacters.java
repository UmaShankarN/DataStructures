package leetcode.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class FindCommonCharacters{
	
	/*
	 * 1002. Find Common Characters
	 * https://leetcode.com/problems/find-common-characters/submissions/834768247/ 
	 */

	/*
	 * Pseudocode:
	 * Create a HashMap and insert characters and count of first word
	 * Iterate through each word in the input list using for loop
	 * Create a new HashMap to store the updated Map
	 * check if each characters of first map is in the second word
	 * add the matching character and its count in the updated Map
	 * copy the update map to first Map and iterate until the end of word list
	 * after all iterations, exit the loop and add each characters to list based on the value
	 * 
	 */
	
	@Test
	public void commonChars1() {

		String[] words = { "bellla", "label", "roller" };
		commonChars(words);
		Assert.assertEquals(Arrays.asList("e", "l", "l"), commonChars(words));
	}

	@Test
	public void commonChars2() {

		String[] words = { "cool", "lock", "cook" };
		Assert.assertEquals(Arrays.asList("c", "o"), commonChars(words));
	}

	@Test
	public void commonChars3() {

		String[] words = { "acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab",
				"addcaccd" };
		Assert.assertEquals(Arrays.asList(), commonChars(words));
	}

	public List<String> commonChars(String[] words) {

		List<String> matchList = new ArrayList<>();
		HashMap<Character, Integer> ncount = new HashMap<Character, Integer>();
		for (int i = 0; i < words[0].length(); i++) {
			ncount.put(words[0].charAt(i), ncount.getOrDefault(words[0].charAt(i), 0) + 1);
		}

		for (int i = 1; i < words.length; i++) {
			HashMap<Character, Integer> updcount = new HashMap<Character, Integer>();
			for (int j = 0; j < words[i].length(); j++) {
				if (ncount.containsKey(words[i].charAt(j))) {
					updcount.put(words[i].charAt(j),
							// because previous word may contain min character("lock","cook")
							Math.min(ncount.get(words[i].charAt(j)), updcount.getOrDefault(words[i].charAt(j), 0) + 1));
				}

			}
			ncount = updcount;
		}

		for (Entry<Character, Integer> entry : ncount.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++)
				matchList.add(String.valueOf(entry.getKey()));
		}

		return matchList;

	}
}
