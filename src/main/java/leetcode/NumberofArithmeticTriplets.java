package leetcode;

import org.junit.Test;

import org.junit.Assert;

public class NumberofArithmeticTriplets {
	
	
	
	/*
	 * 2367. Number of Arithmetic Triplets
	 * https://leetcode.com/problems/number-of-arithmetic-triplets/description/
	 */
	
	/*
	 * initialise a counter variable to get the count
	 * Iterate through the outer for loop from 0 to length-2
	 * inner for loop from 0 to length-1
	 * innermost for loop from 0 to length
	 * check if difference of numbers in index j-i = diff and k-j =diff
	 * increment the counter if the condition satisifeis
	 * 
	 */
	@Test
	public void arithmeticTriplets1() {
		
		int[] nums = {0,1,4,6,7,10};
		int diff = 3;
		Assert.assertEquals(2, arithmeticTriplets(nums,diff));
	}
	
	@Test
	public void arithmeticTriplets2() {
		
		int[] nums = {4,5,6,7,8,9};
		int diff = 2;
		Assert.assertEquals(2, arithmeticTriplets(nums,diff));
	}
	
	
    public int arithmeticTriplets(int[] nums, int diff) {
    	
    	int counter =0;
    	for(int i=0;i<nums.length-2;i++) {
    		for(int j=0; j<nums.length-1;j++) {
    			for(int k=0;k<nums.length;k++) {
    				if((nums[j]-nums[i] == diff) && (nums[k]-nums[j] == diff))
    					counter+=1;
    			}
    			
    		}
    	}
    	
		return counter;
        
    }

}
