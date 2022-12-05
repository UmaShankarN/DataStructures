package leetcode.week8;

import org.junit.Assert;
import org.junit.Test;

import leetcode.week5.MaximumNumberWordsYouCanType;

public class CircularPrinter_Hackerrank{
	
	
	@Test
	public void circularPrinter1() {
		String s = "BZA";
		Assert.assertEquals(4, circularPrinter(s));
		
	}
	
	
	@Test
	public void circularPrinter2() {
		String s = "ZNMD";
		Assert.assertEquals(23, circularPrinter(s));
		
	}
	
	@Test
	public void circularPrinter3() {
		String s = "AZGB";
		Assert.assertEquals(13, circularPrinter(s));
		
	}
	
	/*
	 * Pseudocode:
	 * Iterate each char from the string after converting it to string array
	 * get the current position which is 'A' i.e 0 . curr = current - 'A'
	 * subtract the current char from 'A' to get the difference(pointer position), clockwise
	 * Also subtract the above result from 26 to get the value in anticlockwise
	 * Find the minimum distance and add it with sum, where sum should be 0 initially
	 */
//	1 + 2+1 {max(currechar -'A' -prvpos , 26-(currechar-'A'-prvpos)} prev =0 initially, 
	// B-A =1
	//26-1 =25 (1) prev position
	//B to Z = 'Z' -'A' -previous = 90-65-1 = 24
	// 26- (90-65-1) = 2 <-
	// A -A - 25 = 25 , 26-25 =1
	//
	
	//Space complexity : O(1)
	//Time complexity : O(N)
	public int circularPrinter(String s) {
		
		int previous = 65, sum =0, min =Integer.MAX_VALUE;// pointer is at 'A'
		//AZGB
		for(char current:s.toCharArray())
		{
			
			//clock = Math.abs(current -previous);
			//anticlock = 26-Math.abs(clock);
			min = Math.min(Math.abs(current -previous), 26-Math.abs(current -previous));
			//System.out.println("clock" + current +" "+ clock);			
			//System.out.println("anticlock" + current +" "+ anticlock);			
			previous = (int)current;
			sum+=min;
			
			
			
		}
		return sum;
		
	}

}
