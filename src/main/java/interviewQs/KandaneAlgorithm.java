package interviewQs;

import org.junit.Assert;
import org.junit.Test;

public class KandaneAlgorithm {

	@Test
	public void maxSum1() {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		Assert.assertEquals(6, maxSum(nums));

	}

	@Test
	public void maxSum2() {

		int[] nums = { 1, 2, -1, 0, 3 };
		Assert.assertEquals(5, maxSum(nums));

	}

	@Test
	public void maxSum3() {

		int[] nums = { -1, -2, -1, 0, -3 };
		Assert.assertEquals(0, maxSum(nums));

	}

	@Test
	public void maxSum4() {

		int[] nums = { -2, -1, -3, -4, -1, -2, -1, -5, -4 };
		Assert.assertEquals(-1, maxSum(nums));

	}

	public int maxSum(int[] nums) {

		/*
		 * Pseudocode: declare a sum variable and max variable iterate the give array
		 * using for loop add the current value to the sum check if sum is less than 0,
		 * if it is find the max sum and reset the sum to 0 if not find the max sum
		 */

		int sum = 0, maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];

			if (sum < 0) {
				maxSum = Math.max(maxSum, sum);
				sum = 0;
			} else
				maxSum = Math.max(maxSum, sum);
		}

		System.out.println(maxSum);

		return maxSum;

	}

}
