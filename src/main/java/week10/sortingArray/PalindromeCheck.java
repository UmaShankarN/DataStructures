package week10.sortingArray;

import org.junit.Test;

import java.util.HashMap;

import org.junit.Assert;

public class PalindromeCheck {
	
	
	@Test
	public void palindromeCheck1() {
		
		String input = "aab";
		Assert.assertEquals(true, palidromeCheckfunc(input));
	}
	
	@Test
	public void palindromeCheck2() {
		
		String input = "aaa";
		Assert.assertEquals(true, palidromeCheckfunc(input));
	}
	
	@Test
	public void palindromeCheck3() {
		
		String input = "aabb";
		Assert.assertEquals(false, palidromeCheckfunc(input));
	}
	
	@Test
	public void palindromeCheck4() {
		
		String input = "aabba";
		Assert.assertEquals(true, palidromeCheckfunc(input));
	}

	private boolean palidromeCheckfunc(String input) {

		HashMap<Character,Integer> hmap = new HashMap<>();
		
		for(Character each:input.toCharArray())
			hmap.put(each, hmap.getOrDefault(each, 0)+1);
		
		int count=0;
		for(Character each:hmap.keySet()) {
			
			if(hmap.get(each)%2!=0)
				count++;
			
		}
		
		if(count==0 || count>1)
			return false;
		
		return true;
	}

}
