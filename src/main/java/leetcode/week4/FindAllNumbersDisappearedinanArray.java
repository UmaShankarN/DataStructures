package leetcode.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindAllNumbersDisappearedinanArray {

	/*
	 * 448. Find All Numbers Disappeared in an Array
	 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	 * description/
	 * 
	 */
	@Test
	public void findDisappearedNumbers1() {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		Assert.assertEquals(Arrays.asList(5, 6), findDisappearedNumbers2(nums));

	}

	@Test
	public void findDisappearedNumbers2() {
		int[] nums = { 1, 1 };
		Assert.assertEquals(Arrays.asList(2), findDisappearedNumbers(nums));

	}

	/*
	 * Pseudocode Create a list and set add the input integer array to the set to
	 * get rid of the duplicates iterate from 1 to last value(n) inside the array as
	 * the input always starts from 1 to n check if the set contains the current
	 * iteration number add to the list if the set don't contains the current number
	 * after the iteration ends return the list
	 * 
	 */

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		HashSet<Integer> iset = new HashSet<>();
		for (Integer integer : nums)
			iset.add(integer);
		for (int i = 1; i <= nums.length; i++) {
			if (!iset.contains(i))
				result.add(i);
		}
		return result;
	}

	/*
	 * Pseudocode Create a list and int array to store count iterate through the
	 * input list and increment the position(=nums) of count array iterate through
	 * count Array and add the position == 0 to arraylist after the iteration ends
	 * return the list
	 * 
	 */

	public List<Integer> findDisappearedNumbers2(int[] nums) {

		List<Integer> result = new ArrayList<>();
		int[] countArr = new int[nums.length];

		for (int i : nums)
			countArr[i - 1] += 1;

		for (int i = 1; i <= countArr.length; i++) {
			if (countArr[i - 1] == 0)
				result.add(i);
		}

		return result;
	}

}
