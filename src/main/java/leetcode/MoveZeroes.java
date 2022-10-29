package leetcode;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//283. Move Zeroes
		//https://leetcode.com/problems/move-zeroes/
		
		/* Given an integer array nums, move all 0's to the end of it while maintaining 
		 * the relative order of the non-zero elements.
		 * Note that you must do this in-place without making a copy of the array.
		 * Input: nums = [0,1,0,3,12]
		 * Output: [1,3,12,0,0]
		 */
		
		/*Pseudocode:
		 * create a outer for loop to start from index i=0 to length of the array
		 * check if first index is zero, if it is swap with the i+1
		 * loop until the length -1 of the array
		 * return the result
		 */
		
		/* Test Data:
		 * nums = {0,1,0,3,12}, output = {1,3,12,0,0}
		 * nums = {0,0,0,0,0}, output ={0,0,0,0,0}
		 * nums = {0}, output ={0}
		 * nums = {-1,-1,0,0,0}, output ={-1,-1,0,0,0}
		 */
		
		
		
		int[] nums = {0,1,0,3,12};
		
		for(int i=0; i<nums.length-1;i++) {
			
		}
		
	}

}
