package leetcode.week3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes {

	// TODO Auto-generated method stub

	// 283. Move Zeroes
	// https://leetcode.com/problems/move-zeroes/

	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining
	 * the relative order of the non-zero elements. Note that you must do this
	 * in-place without making a copy of the array. Input: nums = [0,1,0,3,12]
	 * Output: [1,3,12,0,0]
	 */

	/*
	 * Pseudocode: create a outer for loop to start from index i=0 to length of the
	 * array check if first index is zero, if it is swap with the i+1 loop until the
	 * length -1 of the array return the result
	 */

	/*
	 * Test Data: nums = {0,1,0,3,12}, output = {1,3,12,0,0} nums = {0,0,0,0,0},
	 * output ={0,0,0,0,0} nums = {0}, output ={0} nums = {-1,-1,0,0,0}, output
	 * ={-1,-1,0,0,0}
	 */

	@Test
	public void movezeroes1() {

		int nums[] = { 0, 1, 0, 3, 12 };
		Assert.assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, movezeroes(nums));
	}

	@Test
	public void movezeroes2() {

		int nums[] = { 0 };
		Assert.assertArrayEquals(new int[] { 0 }, movezeroes(nums));
	}

	@Test
	public void movezeroes3() {

		int nums[] = { 2, 1 };
		Assert.assertArrayEquals(new int[] { 2, 1 }, movezeroes(nums));
	}

	public int[] movezeroes(int[] nums) {
		int start = 0, end = 1;

		while (end < nums.length) { // 0 1 3 0 //1 0 3 0 // 1 3 0 1

			if (nums[start] == 0) {
				
				if(nums[end]!=0) {
					int temp =nums[start];
					nums[start]=nums[end];
					nums[end]=temp;
					start++;
					
					
				}
				
			}else
				start++;
			
			end++;
		}
		System.out.println(Arrays.toString(nums));
		return nums;
		}
		

}
