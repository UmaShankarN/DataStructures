package leetcode;

public class MaxProdSubArray {

	public static void main(String[] args) {
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
		 * Assign temp variable with nums[0]
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
		int nums[] = {0,2};
		int temp=nums[0],var=1;
		
		System.out.println(temp);
		
		for(int i=0; i<nums.length-1;i++)
		{
			var = nums[i];
			for(int j=i+1; j<nums.length;j++) {
				var = var*nums[j];
				if(temp<var) {
					temp=var;
				}
			}
		}
		System.out.println(temp);
		
		
	}

}
