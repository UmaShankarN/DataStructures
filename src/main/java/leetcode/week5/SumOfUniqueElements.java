package leetcode.week5;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class SumOfUniqueElements {

	/*
	 * 1748. Sum of Unique Elements
	 * https://leetcode.com/problems/sum-of-unique-elements/description/
	 * 
	 */
	@Test
	public void sumOfUnique1() {
		int[] nums = { 1, 2, 3, 2 };
		Assert.assertEquals(4, sumOfUnique(nums));
	}

	@Test
	public void sumOfUnique2() {
		int[] nums = { 1, 1, 1, 1, 1 };
		Assert.assertEquals(0, sumOfUnique(nums));
	}

	@Test
	public void sumOfUnique3() {
		int[] nums = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(15, sumOfUnique(nums));
	}

	/*
	 * Create a map to store the given numbers in nums array as key and the
	 * Occurrences in value iterate through the nums array and add the key value to
	 * the map initialise a sum variable iterate through the keyset of the map and
	 * get the value that is occurred once using the key add the number(key) to the
	 * sum and store it in sum after the iteration return the sum
	 * 
	 */
	public int sumOfUnique(int[] nums) {

		HashMap<Integer, Integer> countMap = new HashMap<>();

		for (int eachNum : nums)
			countMap.put(eachNum, countMap.getOrDefault(eachNum, 0) + 1);
		int sum = 0;
		for (Integer eachKey : countMap.keySet()) {
			if (countMap.get(eachKey) == 1)
				sum += eachKey;
		}

		return sum;
	}

}
