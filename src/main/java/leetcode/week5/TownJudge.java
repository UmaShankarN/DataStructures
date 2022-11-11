package leetcode.week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TownJudge {

	/*
	 * 997. Find the Town Judge
	 * https://leetcode.com/problems/find-the-town-judge/description/
	 * 
	 */
	@Test
	public void findJudge1() {

		int n = 2;
		int[][] trust = { { 1, 2 } };
		Assert.assertEquals(2, findJudge(n, trust));
	}

	@Test
	public void findJudge2() {

		int n = 3;
		int[][] trust = { { 1, 3 }, { 2, 3 } };
		Assert.assertEquals(3, findJudge(n, trust));
	}

	@Test
	public void findJudge3() {

		int n = 3;
		int[][] trust = { { 1, 3 }, { 2, 3 }, { 3, 1 } };
		Assert.assertEquals(-1, findJudge(n, trust));
	}

	@Test
	public void findJudge4() {

		int n = 4;
		int[][] trust = { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };
		Assert.assertEquals(3, findJudge(n, trust));
	}

	@Test
	public void findJudge5() {

		int n = 3;
		int[][] trust = { { 1, 2 }, { 2, 3 } };
		Assert.assertEquals(-1, findJudge(n, trust));
	}

	@Test
	public void findJudge6() {

		int n = 1;
		int[][] trust = {};
		Assert.assertEquals(1, findJudge(n, trust));
	}

	@Test
	public void findJudge7() {

		int n = 2;
		int[][] trust = {};
		Assert.assertEquals(-1, findJudge(n, trust));
	}

	@Test
	public void findJudge8() {

		int n = 4;
		int[][] trust = { { 1, 3 }, { 1, 4 }, { 2, 3 } };
		Assert.assertEquals(-1, findJudge(n, trust));
	}

	@Test
	public void findJudge9() {

		int n = 4;
		int[][] trust = { { 1, 2 }, { 1, 3 }, { 2, 1 }, { 2, 3 }, { 1, 4 }, { 4, 3 }, { 4, 1 } };
		Assert.assertEquals(3, findJudge(n, trust));
	}

	/*
	 * Check if length of given array is 1 then return the [0][1] if number of
	 * people is 1 and the return n for other cases, create two lists add the not
	 * trusted in first list that is 0th index of all array add the trusted in
	 * second list that is 1st index of all array create a map and add the trusted
	 * identifier and its occurrence in the map, get the last picked number to a
	 * variable check the size of map is 1 and count of picked number is greater
	 * than 1 return the number if the condition matches else return -1
	 * 
	 */
	public int findJudge(int n, int[][] trust) {

		if (trust.length == 1)
			return trust[0][1];
		if (n == 1)
			return 1;

		List<Integer> nottrusted = new ArrayList<>();
		List<Integer> trusted = new ArrayList<>();

		for (int[] intarray : trust) {

			nottrusted.add(intarray[0]);
			trusted.add(intarray[1]);
		}
		//1,2,3
		//3,3,1
		
		//1,2
		//3,3
		int picked = 0;
		HashMap<Integer, Integer> trustcountmap = new HashMap<>();
		for (Integer integer : trusted) {

			if (!nottrusted.contains(integer)) {
				trustcountmap.put(integer, trustcountmap.getOrDefault(integer, 0) + 1);
				picked = integer;
			}
		}
//		 System.out.println(nottrusted);
//		 System.out.println(trusted);
//		System.out.println(picked);
//		System.out.println(trustcountmap);
		if (trustcountmap.size() == 1 && trustcountmap.get(picked) > 1)
			return picked;

		return -1;

	}
	
	/*
	 * declare an integer array with size n+1 because the array starts from 0 to n
	 * for each 1D array in input trust 2D array,
	 * decrement the index value of declared array by getting the position from the 0 the index of input array
	 * as no one trusts
	 * increment the index value of declared array by getting the position from the 1 the index of input array
	 * as someone trusts
	 * Iterate from 1 to n and return the value index of value that is equal to n-1
	 * 
	 */
	public int findJudge2(int n, int[][] trust) {

		int[] tru2 = new int[n + 1];
		for (int[] in : trust) {
			tru2[in[0]]--;
			tru2[in[1]]++;
		}

		//System.out.println(Arrays.toString(tru2));

		for (int i = 1; i <= n; i++) {
			if (tru2[i] == n - 1)
				return i;
		}

		return -1;
	}

}
