package leetcode.week9;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearch_FindorInsertIndex {

	@Test
	public void returnIndex1() {

		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		Assert.assertEquals(4, returnIndex(nums, target));

	}

	@Test
	public void returnIndex2() {

		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		Assert.assertEquals(1, returnIndex(nums, target));

	}

	@Test
	public void returnIndex3() {

		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		Assert.assertEquals(2, returnIndex(nums, target));

	}
	
	@Test
	public void returnIndex4() {

		int[] nums = { 1, 3, 5, 6 };
		int target = 4;
		Assert.assertEquals(2, returnIndex(nums, target));

	}

	
	@Test
	public void returnIndex5() {

		int[] nums = { 1, 3 };
		int target = 2;
		Assert.assertEquals(1, returnIndex(nums, target));

	}
	
	
	private int returnIndex1(int[] nums, int target) {

		int left = 0, right = nums.length - 1, middle = 0;

		while (left <= right) {
			middle = (left + right) / 2;

			if (nums[middle] == target) 
				return middle;
				

			if (nums[middle] > target) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}

		}
		

		return left;
	}
	
	//Binary search
	private int returnIndex(int[] nums, int target) {

		int k = Arrays.binarySearch(nums, target);
		
		if(k<0)
			return (-1*k)-1;
		
		return k;
					
	}

}
