package leetcode.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MaxPositiveSpread_Hackerrank {

	@Test
	public void maxPositiveSpread1() {

		int[] px = { 7, 1, 2, 5 };
		Assert.assertEquals(4, maxPositiveSpread(px));

	}

	// Bruteforce
	public int maxPositiveSpread1(int[] px) {

		int max = Integer.MIN_VALUE, i = 0;

		for (int j = 1; j < px.length; j++) {

			i = 0;
			while (i != j) {
				if (px[j] > px[i])
					max = Math.max(max, px[j] - px[i]);
				i++;
			}

		}

		if (max == Integer.MIN_VALUE)
			return -1;

		return max;
	}

	// px = { 7, 1, 2, 5 };
	// Optimised approach
	public int maxPositiveSpread(int[] px) {

		List<Integer> list = new ArrayList<>();
		for(int eachin: px) 
			list.add(eachin);
		
		int temp=list.get(0),difference=-1,i=1;
		while(i<list.size()){
		if(list.get(i)>temp) 
			difference=Math.max(difference, list.get(i)-temp);
		else 
			temp=list.get(i);
		i++;
		}
		return difference;
		
	}

}
