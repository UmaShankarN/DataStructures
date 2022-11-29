package leetcode.week8;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class RecurringChar {

	@Test
	public void recurringChar1() {

		String s = "aba";
		Assert.assertEquals("a", recurringChar(s));

	}

	@Test
	public void recurringChar2() {

		String s = "zz";
		Assert.assertEquals("z", recurringChar(s));

	}

	@Test
	public void recurringChar3() {

		String s = "codility";
		Assert.assertEquals("i", recurringChar(s));

	}

	public String recurringChar1(String s) {

		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println(s.charAt(i));
					return String.valueOf(s.charAt(i));
				}
			}
		}

		return "";

	}
	
	public String recurringChar2(String s) {
		
		HashSet<Character> sSet = new HashSet<>();
		
		for(char eachin:s.toCharArray()) {
			
			if(sSet.contains(eachin))
				return String.valueOf(eachin);
			else
				sSet.add(eachin);
			
		}
		
		return "";
	}
	
	
	public String recurringChar(String s) {
		
		HashMap<Character, Integer> sCountMap = new HashMap<>();
		
		for(char eachin:s.toCharArray()) {
			
			if(!sCountMap.containsKey(eachin))
			 sCountMap.put(eachin, sCountMap.getOrDefault(eachin, 0)+1);
			else
				return String.valueOf(eachin);
			
		}
		
		return "";
	}

}


