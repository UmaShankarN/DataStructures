package leetcode.week9;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearch_Sqrt {

//	
	@Test
	public void mySqrt() {
		
		Assert.assertEquals(2, mySqrt(4));
	
	}
	
	@Test
	public void mySqrt2() {
		
		Assert.assertEquals(2, mySqrt(8));
	
	}
	
	@Test
	public void mySqrt3() {
		
		Assert.assertEquals(3, mySqrt(9));
	
	}
	
	
	@Test
	public void mySqrt4() {
		
		Assert.assertEquals(4, mySqrt(16));
	
	}
	
	/*
	 * 
	 * Because if we use mid = (low + high)/2 then 
	 * it might lead to overflow, as (high + low) can exceed range
	 *  and will eventually lead to overflow. 
	 *  But if we use mid = low + (high - low)/2, then the 
	 *  possibility of overflow becomes none, as if high and 
	 *  low are in the range, then (high - low) will definitely 
	 *  be in range and will not overflow.
	 */
	
	//[1,2,3,4]
	//[1,2,3,4,5,6,7,8,9]
	  public int mySqrt(int x) {
		  
		  int[] nums = new int[x];	        
		  for(int i=0; i<x; i++)
			  nums[i] = i+1;
			  
		  System.out.println(Arrays.toString(nums));
		  
	        int left =0 , right = nums.length-1, middle =0;

	        while(left<=right) {
	        	
	        	middle = (left+right)/2;
	        	
	        	if(nums[middle]*nums[middle] == x)
	        		return nums[middle];
	        	
	        	if(nums[middle]*nums[middle] > x) {
	        		right = middle-1;
	        	}else {
	        		left = middle+1;
	        	}
	        	
	        	}

	        return nums[left-1];
	    }
}
