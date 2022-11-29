package leetcode.week8;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortByParityOddEven2pointer {

	@Test
	public void sortArrayByParityII1() {

		int[] nums = { 4, 2, 5, 7 };
		Assert.assertArrayEquals(new int[] { 4, 5, 2, 7 }, sortArrayByParityII(nums));

	}

	@Test
	public void sortArrayByParityII2() {

		int[] nums = { 4,3,2,7 };
		Assert.assertArrayEquals(new int[] { 4,3,2,7 }, sortArrayByParityII(nums));
// 3 2 5 6 
//3 3 2 4
		
//2 3 3 5
		
//2 2 3 5  //2 3 2 5
	}

	public int[] sortArrayByParityII(int[] nums) {

		int start = 0, end = 1;

		while (start <nums.length && end < nums.length) {

			if (nums[start] % 2 != 0) {
				if (nums[end] % 2 == 0) {
					int temp = nums[start];
					nums[start] = nums[end];
					nums[end] = temp;
					start += 2;
					end += 2;
				}else
					end+=2;

			}else
				start+=2;
				
		}
		
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
