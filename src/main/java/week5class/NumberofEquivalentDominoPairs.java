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

	// int[][] dominoes = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } }; pairs =2
	// int[][] dominoes = { { 1, 2 }, { 1,2 }, {1,1 }, {1,2 },{2,2} }; pairs =3
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
