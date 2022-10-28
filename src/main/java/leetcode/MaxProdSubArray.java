package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MaxProdSubArray {


		// TODO Auto-generated method stub
		
		/*
		 * Given an integer array nums, find a contiguous non-empty subarray within the array 
		 * that has the largest product, and return the product.
		 * The test cases are generated so that the answer will fit in a 32-bit integer.
		 * A subarray is a contiguous subsequence of the array.
		 */
		
		/*
		 * Example 1: Input: nums = [2,3,-2,4] 
		 * Output: 6
		 * Explanation: [2,3] has the largest product 6.
		 * Example 2:
		 * Input: nums = [-2,0,-1]
		 * Output: 0
		 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
		 */
		
		/*
		 * Pseudocode:
		 * [2],[3],[-2],[4],[2,3],[3,-2],[-2,4],[2,3,-2],[3,-2,4],[2,3,-2,4]
		 * 
		 * [2],[2,3],[2,3,-2],[2,3,-2,4]
		 * [3],[3,-2],[3,-2,4]
		 * [-2],[-2,4]
		 * [4]
		 * Assign temp variable with nums[0], var as 1
		 * Outer for loop to iterate from i=0 to length of array-1
		 * var=a[i]
		 * inner for loop to iterate from j =i+1 to length of array
		 * var=var*a[j]
		 * check if the temp < var then temp =var
		 * exit the loop
		 * return temp
		 * [0,2]
		 */

		
		//int nums[] = {2,3,-2,4};
		//int nums[] = {-2,0,-1};
		
		
		
		@Test
		public void maxProdSubArray1() {
			int nums[] = {2, 3, -2, 4};
			Assert.assertEquals(6, maxProdSubArray(nums));
		}

		@Test
		public void maxProdSubArray2() {
			int nums[] = {-2,0,1};
			Assert.assertEquals(1, maxProdSubArray(nums));
		}

		@Test
		public void maxProdSubArray3() {
			int nums[] = {0, 2};
			Assert.assertEquals(2, maxProdSubArray(nums));
		}

		@Test
		public void maxProdSubArray4() {
			int nums[] = {1};
			Assert.assertEquals(1, maxProdSubArray(nums));
		}

		
		public int maxProdSubArray(int[] nums) {
		
		int var=1, max =Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length;i++)
		{
			var = 1;
			for(int j=i; j<nums.length;j++) {
				var = var*nums[j];
				max = Math.max(max, var);
				
			}
		}
		return max;
		
		}
		
		
		
}