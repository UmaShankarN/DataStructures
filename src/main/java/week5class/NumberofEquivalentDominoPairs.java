package week5class;

import org.junit.Assert;

public class NumberofEquivalentDominoPairs {

	public void numEquivDominoPairs1() {

		int[][] dominoes = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } };
		Assert.assertEquals(1, numEquivDominoPairs(dominoes));
	}

	
	public void numEquivDominoPairs2() {

		int[][] dominoes = { { 1, 2 }, { 1,2 }, {1,1 }, {1,2 },{2,2} };
		Assert.assertEquals(1, numEquivDominoPairs(dominoes));
	}
	
	/*
	 *Pseudocode: 
	 * Outer for loop to iterate each subarray from 0 to length-1
	 * inner for loop to iterate each subarray from 1 to length
	 * assign each 0 and 1 array to separate integer array
	 * check if each index of array matches with next array
	 * increase the counter if matches
	 * after the iteration return the counter
	 */
	
	public int numEquivDominoPairs(int[][] dominoes) {
        int counter = 0;
        
        for(int i = 0; i < dominoes.length - 1; i++) {
            for(int j = i + 1; j < dominoes.length; j++) {
                int[] dom = dominoes[i];
                int[] dom1 = dominoes[j];
               
                if(dom[0] == dom1[0] && dom[1] == dom1[1] || dom[0] == dom1[1] && dom[1] == dom1[0]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
