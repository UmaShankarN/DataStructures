package leetcode;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairs {
	
	/*
	 * 1512. Number of Good Pairs
	 * https://leetcode.com/problems/number-of-good-pairs/description/
	 */
	
	/*
	 * Psuedocode
	 * Initialise a counter variable
	 * outer for loop to iterate from i=0 to length-1
	 * inner for loop to iterate from i+1 to length
	 * check if i=j and increase the counter
	 * exit the loop and return the counter
	 */
	
	@Test
	public void numIdenticalPairs1() {
		int[] nums = {1,2,3,1,1,3};
		Assert.assertEquals(4, numIdenticalPairs(nums));
	}
	

	@Test
	public void numIdenticalPairs2() {
		int[] nums = {1,1,1,1};
		Assert.assertEquals(6, numIdenticalPairs(nums));
	}
	
	
	@Test
	public void numIdenticalPairs3() {
		int[] nums = {1,2,3,4};
		Assert.assertEquals(0, numIdenticalPairs(nums));
	}
	//BruteForce
    public int numIdenticalPairs(int[] nums) {
    	
    	int counter =0;
    	for (int i =0; i<nums.length-1;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if(nums[i]==nums[j])
    				counter+=1;
    		}
		}
        return counter;
    }

    // Optimised
public int numIdenticalPairs2(int[] nums) {
    	
    	int counter =0;
        HashMap<Integer, Integer> ncount = new HashMap<Integer, Integer>();
        for(int n:nums){
            ncount.put(n,ncount.getOrDefault(n,0)+1);
        }
        // 1=3, 2=1,3=2
        for(int n:ncount.values()){
           if(n!=1){
               for(int i=1;i<n;i++)
                counter=counter+i;
           }
        }
        return counter;
    }

}
