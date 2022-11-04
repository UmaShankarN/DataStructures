package leetcode.week4;

import org.junit.Test;

import java.util.HashMap;

import org.junit.Assert;

public class ContainsDuplicateII {

	/*
	 * 219. Contains Duplicate II
	 * https://leetcode.com/problems/contains-duplicate-ii/ 
	 */
	
	/*
	 * Pseudocode: 1 for loop
	 * iterate through the integer array on each element until a nearby matching is found
	 * get the absolute difference of the respective index
	 * verify if the difference is <= given k
	 * if the difference the less stop iterating and print true
	 * if difference is high iterate until a next match is found 
	 * take difference and check if it is <=k
	 * return true if there is a match with <=k or return false
	 */
	
	/*
	 * Pseudocode: 2 HashMap
	 * Iterate through the input array and add each integer as key and value as index
	 * If the integer already exists get the index and subtract with correct index
	 * if the difference is <=k, return true
	 * if it is not true, the current index of the key replaces the old index(for nearby match)
	 * iteration continues until the condition meets or the index is replaced
	 * if no difference meets the condition, then false is returned
	 */
	
	@Test
	public void containsNearbyDuplicate1() {
		int[] nums = {1,2,3,1};
		int k = 3;
		Assert.assertEquals(true, containsNearbyDuplicate(nums,k));
	}
//	
	@Test
	public void containsNearbyDuplicate2() {
		int[] nums = {1,0,1,1};
		int k = 1;
		Assert.assertEquals(true, containsNearbyDuplicate(nums,k));
	}
//	
	@Test
	public void containsNearbyDuplicate3() {
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		Assert.assertEquals(false, containsNearbyDuplicate(nums,k));
	}
	
	
	@Test
	public void containsNearbyDuplicate4() {
		int[] nums = {0,1,2,3,4,0,0,7,8,9,10,11,12,0};
		int k = 1;
		Assert.assertEquals(true, containsNearbyDuplicate(nums,k));
	}
	
	
	  public boolean containsNearbyDuplicate(int[] nums, int k) {
		 HashMap<Integer, Integer> ivmap = new HashMap<>();
		 
		 for (int i =0;i<nums.length;i++) {
			 if(ivmap.containsKey(nums[i]) &&  Math.abs(ivmap.get(nums[i])-i)<=k)
				 return true;
			 ivmap.put(nums[i], i);
		}
		return false;
	    }
	  
	  
//	    public boolean containsNearbyDuplicate(int[] nums, int k) {
//	    			  for(int i=0;i<nums.length-1;i++) {
//	    				 for(int j=i+1;j<nums.length;j++) {
//	    					 
//	    					 if(nums[i]==nums[j]) 
//	    						if( Math.abs(i-j) <=k)
//	    							return true;
//	    					 }
//	    						 
//	    				 }
//	    				 
//	    			return false;
//	    		    }
	  
  }
