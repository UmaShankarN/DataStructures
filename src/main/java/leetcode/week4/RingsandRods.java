package leetcode.week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class RingsandRods {

	
	/*
	 * 2103. Rings and Rods
	 * https://leetcode.com/problems/rings-and-rods/description/
	 */
	@Test
	 public void countPoints1() {
		 String rings = "B0B6G0R6R0R6G9";
		 Assert.assertEquals(1, countPoints(rings));
	 }
	 
	
	@Test
	 public void countPoints2() {
		 String rings = "B0R0G0R9R0B0G0";
		 Assert.assertEquals(1, countPoints(rings));
	 }
	
	@Test
	 public void countPoints3() {
		 String rings = "G4";
		 Assert.assertEquals(0, countPoints(rings));
	 }
	
	/*
	 * Pseudocode
	 * Create a HashMap to store rod labels in key and colored rings in value
	 * Iterate through the given string and add the rod labels and rings
	 * intialise a counter variable
	 * iterate through the values of the map
	 * intialise a set and add each character of values to the set
	 * check if the set contains B,R,G using containsAll
	 * increment the counter if the above condition meets
	 * iterate until all the values are verified
	 * exit and return the counter
	 */
	 
    public int countPoints(String rings) {
    	
    	HashMap<Character, String> rodrings = new HashMap<>();
    	for(int i=0;i<rings.length();i+=2)
    		rodrings.put(rings.charAt(i+1), rodrings.getOrDefault(rings.charAt(i+1), "")+rings.charAt(i));
    	
    	int counter =0;
    	for (String rings1 : rodrings.values()) {
    		HashSet<Character> rset = new HashSet<>();
    		for (Character color : rings1.toCharArray())
				rset.add(color);
    		if(rset.containsAll(Arrays.asList('B','R','G')))
    				counter+=1;
		}
    	
		return counter;
        
    }
}
