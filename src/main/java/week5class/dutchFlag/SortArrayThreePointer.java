package week5class.dutchFlag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayThreePointer {

	/*
	 * Class problem not in leet code
	 * 
	 */
	@Test
	public void sortArray() {

		int nums[] = { 5, 7, 2, 9, 1, 14, 12, 10, 5, 3 };
		Assert.assertArrayEquals(new int[] { 2, 1, 3, 9, 7, 5, 5, 10, 12, 14 }, sortArray(nums));
	}

	/*
	 * Pseudocode: Three pointer approach group the numbers in low, middle, high
	 * 
	 */
	public int[] sortArray(int nums[]) {

		int low = 0, middle = 0, high = nums.length - 1, temp = 0;

		while (middle <= high) {

			if (nums[middle] >= 1 && nums[middle] <= 3) {
				temp = nums[middle];
				nums[middle] = nums[low];
				nums[low] = temp;
				middle++;
				low++;
			} else if (nums[middle] >= 4 && nums[middle] <= 10) {
				middle++;

			} else {
				temp = nums[high];
				nums[high] = nums[middle];
				nums[middle] = temp;
				high--;
			}

		}
		System.out.println(Arrays.toString(nums));

		return nums;

	}

}
