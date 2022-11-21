package week7.linkedList.stack;

import org.junit.Assert;
import org.junit.Test;

public class BackspaceStringCompare {
	
	/*
	 * https://leetcode.com/problems/backspace-string-compare/description/
	 */
	
	@Test
	public void backspaceStringCompare() {
		
		Assert.assertEquals(true, backspaceStringCompare("ab#c", "ad#c"));
	}
	
	
	public boolean backspaceStringCompare(String s, String t) {
        
	       StringBuilder sinput = new StringBuilder();
	       StringBuilder tinput = new StringBuilder();

	        for(char c : s.toCharArray()){

	            if(c == '#' &&  sinput.length() != 0)
	                sinput.deleteCharAt(sinput.length()-1);
	            else
	                sinput.append(c);
	        }

	        for(char c : t.toCharArray()){

	            if(c == '#' &&  tinput.length() != 0)
	                tinput.deleteCharAt(tinput.length()-1);
	            else
	                tinput.append(c);
	        }

	        System.out.println(sinput);
	        System.out.println(tinput);
        	System.out.println(tinput.equals(sinput));

	        if(tinput.equals(sinput)) {
	        	System.out.println("WWWWWWWWW");
	            return true;
	        }

	    return false;
	    }

}
