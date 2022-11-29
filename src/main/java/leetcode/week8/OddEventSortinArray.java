package leetcode.week8;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class OddEventSortinArray {
	
	
	@Test
	public void oddEven1() {
		
		int[] nums = {1,2,3,4,5,6};
		Assert.assertArrayEquals(new int[] {1,5,3,4,2,6}, oddEven(nums));
	}
	
	@Test
	public void oddEven2() {
		
		int[] nums = {2,1,3,4,5,6};
		Assert.assertArrayEquals(new int[] {5,1,3,4,2,6}, oddEven(nums));
	}

	public int[] oddEven(int nums[]) {
		
		
		int start=0, end= nums.length-1;
		
		
		while(start<end) {
			
			if(nums[start]%2==0) {
				if(nums[end]%2!=0) {
				int temp = nums[start];
				nums[start]=nums[end];
				nums[end]= temp;
				start++; 
				end--;
				}else
					end--; 
			}else
			start++;
		}
		
		System.out.println(Arrays.toString(nums));
		
		return nums;
	}
	
}
