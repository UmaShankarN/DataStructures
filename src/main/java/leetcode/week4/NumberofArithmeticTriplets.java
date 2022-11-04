package leetcode.week4;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Assert;

public class NumberofArithmeticTriplets {

	/*
	 * 2367. Number of Arithmetic Triplets
	 * https://leetcode.com/problems/number-of-arithmetic-triplets/description/
	 */

	/*
	 * Pseudocode:
	 * initialise a counter variable to get the count Iterate through the outer for
	 * loop from 0 to length-2 inner for loop from 0 to length-1 innermost for loop
	 * from 0 to length check if difference of numbers in index j-i = diff and k-j = diff
	 * increment the counter if the both condition satisfies
	 * return the counter
	 */
	@Test
	public void arithmeticTriplets1() {

		int[] nums = { 0, 1, 4, 6, 7, 10 };
		int diff = 3;
		Assert.assertEquals(2, arithmeticTriplets2(nums, diff));
	}

	@Test
	public void arithmeticTriplets2() {

		int[] nums = { 4, 5, 6, 7, 8, 9 };
		
		int diff = 2;
		Assert.assertEquals(2, arithmeticTriplets2(nums, diff));
	}

	public int arithmeticTriplets(int[] nums, int diff) {

		int counter = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				for (int k = 0; k < nums.length; k++) {
					if ((nums[j] - nums[i] == diff) && (nums[k] - nums[j] == diff))
						counter += 1;
				}

			}
		}

		return counter;

	}

	
	/*
	 * Pseudocode:
	 * initialise a counter variable
	 * Create a HashSet and add the values of nums inside the set
	 * Iterate for each element in the set
	 * check if set contains number= current value+diff and number =current value +diff+diff
	 * second number =first number+diff, third number = second number+diff(firstnumber+diff+diff), so third number = first number+2diff
	 * increment the counter if the condition satisfies
	 * return the counter
	 */
	
	
	public int arithmeticTriplets2(int[] nums, int diff) {

		int counter = 0;
		HashSet<Integer> numset = new HashSet<>();
		for (Integer integer : nums)
			numset.add(integer);
		//System.out.println(numset);
		for (Integer integer : numset) {
			if(numset.contains(integer+diff) && numset.contains(integer+(2*diff)))
				counter+=1;
		}
		return counter;

	}
	
	
	public int arithmeticTriplets3(int[] nums, int diff) {

		int counter = 0;
		HashSet<Integer> numset = new HashSet<>();
		for (Integer integer : nums)
			numset.add(integer);
		System.out.println(numset);
		for (Integer integer : numset) {
			if(numset.contains(integer+diff) && numset.contains(integer+(2*diff)))
				counter+=1;
		}
		return counter;

	}

}
