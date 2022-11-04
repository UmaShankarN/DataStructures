package leetcode.week4;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElement {

	/*
	 * 169. Majority Element
	 * https://leetcode.com/problems/majority-element/description/
	 */
	
	
	/*
	 * Pseudocode:
	 * Create a HashMap and store the each value given num array as value and its occurence as key
	 * Create temp=0 to store the highest value and majorityElement to store the highest key
	 * Iterate over the keyset of the HashMap
	 * check if the current value is greater than temp
	 * and store the highest key
	 * return the highest key
	 */
	
	@Test
	public void majorityElement1() {
		int nums[] = { 3, 2, 3 };
		
		Assert.assertEquals(3, majorityElement(nums));
	}

	
	@Test
	public void majorityElement2() {
		int nums[] = {2,2,1,1,1,2,2};
		
		Assert.assertEquals(2, majorityElement(nums));
	}
	
	@Test
	public void majorityElement3() {
		int nums[] = {3,3,4};
		
		Assert.assertEquals(3, majorityElement(nums));
	}
	
	public int majorityElement(int[] nums) {

		HashMap<Integer, Integer> countMap = new HashMap<>();
		int temp=0, majorElement=0;
		
		for (int i : nums) 
			countMap.put(i, countMap.getOrDefault(i, 0)+1);	
		
		for (Integer i : countMap.keySet()) {
			if(temp<countMap.get(i)) {
				temp=countMap.get(i);
				majorElement = i;
			}
		}
		return majorElement;

	}

}
