package leetcode.week9;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearch_FindIndex {

	@Test
	public void returnIndex1() {

		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		Assert.assertEquals(4, returnIndex(nums, target));

	}
//
//	@Test
//	public void returnIndex2() {
//
//		int[] nums = { -1, 0, 3, 5, 9, 12 };
//		int target = 2;
//		Assert.assertEquals(-1, returnIndex(nums, target));
//
//	}
//
	@Test
	public void returnIndex3() {

		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 3;
		Assert.assertEquals(2, returnIndex(nums, target));

	}

	private int returnIndex(int[] nums, int target) {

		int left = 0, right = nums.length-1, middle = 0;

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


		return -1;
	}

}
