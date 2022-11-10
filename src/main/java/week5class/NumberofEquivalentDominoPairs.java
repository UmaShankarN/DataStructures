package week5class;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class NumberofEquivalentDominoPairs {

	/*
	 * 1128. Number of Equivalent Domino Pairs
	 * https://leetcode.com/problems/number-of-equivalent-domino-pairs/
	 */
	@Test
	public void numEquivDominoPairs1() {

		int[][] dominoes = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } };
		Assert.assertEquals(1, numEquivDominoPairs(dominoes));
	}

	@Test
	public void numEquivDominoPairs2() {

		int[][] dominoes = { { 1, 2 }, { 1, 2 }, { 1, 1 }, { 1, 2 }, { 2, 2 } };
		Assert.assertEquals(3, numEquivDominoPairs(dominoes));
	}

	@Test
	public void numEquivDominoPairs3() {	

		int[][] dominoes = { { 1, 1 }, { 2, 2 }, { 1, 1 }, { 1, 2 }, { 1, 2 }, { 1, 1 } };
		Assert.assertEquals(4, numEquivDominoPairs(dominoes));
	}

	/*
	 * Pseudocode: Outer for loop to iterate each subarray from 0 to length-1 inner
	 * for loop to iterate each subarray from 1 to length assign each 0 and 1 array
	 * to separate integer array check if each index of array matches with next
	 * array increase the counter if matches after the iteration return the counter
	 */

	public int numEquivDominoPairs1(int[][] dominoes) {
		int counter = 0;

		for (int i = 0; i < dominoes.length - 1; i++) {
			for (int j = i + 1; j < dominoes.length; j++) {
				int[] dom = dominoes[i];
				int[] dom1 = dominoes[j];

				if (dom[0] == dom1[0] && dom[1] == dom1[1] || dom[0] == dom1[1] && dom[1] == dom1[0]) {
					counter++;
				}
			}
		}
		return counter;
	}

	/*
	 * declare an integer array with size 100
	 * to identify unique pairs (1,2) or (3,0) when added gives the same sum
	 * so to differentiate the above examples, multiplying the min value of each array with 10 
	 * and add with max value, store the occurence/count of same value
	 * in the position of the above arithmetic result
	 * for example (1,2) = 1*10+2 = 12, if we have another array (1,2) =12, so 2 will be stored at 11th(12-1) index
	 * to get the combination use the formula n*n-1/2 for each value greater than 1
	 * return the result
	 * 
	 */
	public int numEquivDominoPairs(int[][] dominoes) {

		int[] value = new int[100];
		for (int[] currentpair : dominoes) {
			value[Math.min(currentpair[0], currentpair[1]) * 10 + Math.max(currentpair[0], currentpair[1])] += 1;

		}
		System.out.println(Arrays.toString(value));

		int ans = 0;
		for (int i : value) {
			if (i > 1)
				ans += i * (i - 1) / 2;
		}
		System.out.println(ans);
		return ans;
	}
}
