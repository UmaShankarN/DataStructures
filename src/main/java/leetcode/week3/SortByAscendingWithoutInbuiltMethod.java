package leetcode.week3;
import org.junit.Assert;
import org.junit.Test;

public class SortByAscendingWithoutInbuiltMethod {

	@Test
	public void sortArrayByAscendingPositive() {
		int nums[] = { 10, 3, -1, 0, 8 };
		Assert.assertArrayEquals(new int[] { -1, 0, 3, 8, 10 }, sortArrayByAscending(nums));
	}

	@Test
	public void sortArrayByAscendingNegative() {
		int nums[] = {};
		Assert.assertArrayEquals(new int[] {}, sortArrayByAscending(nums));
	}

	@Test
	public void sortArrayByAscendingEdge1() {
		int nums[] = { -1, -3, -4, -2, -7 };
		Assert.assertArrayEquals(new int[] { -7, -4, -3, -2, -1 }, sortArrayByAscending(nums));
	}

	@Test
	public void sortArrayByAscendingEdge2() {
		int nums[] = { 1, 1, 1, 1, 1 };
		Assert.assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, sortArrayByAscending(nums));
	}

	/*
	 * Pseudocode: Create a temp variable = 0 Iterate through the given input array
	 * from 0 to length Iterate through the given input array from 1 to length
	 * Compare if the first element is greater than second element Swap the values
	 * if the first is greater than second Return the sorted array
	 */
	public int[] sortArrayByAscending(int[] nums) {
		int temp = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++)
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
		}
		return nums;

	}
	

}