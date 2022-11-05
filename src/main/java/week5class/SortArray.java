package week5class;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortArray {
	
	@Test
	public void sortArray() {
		
		int nums[] = {5,7,2,9,1,14,12,10,5,3};
		Assert.assertArrayEquals(new int[] {1, 2, 3, 5, 5, 7, 9, 10, 12, 14}, sortArray(nums));
	}
	
	
	public int[] sortArray(int nums[]) {
		
		for(int i=0; i<nums.length-1; i++) {
			System.out.println(i);
				if(nums[i]>nums[i+1]) {
					int temp = nums[i];
					nums[i] =nums[i+1];
					nums[i+1]=temp;
					i=-1;
				}
				System.out.println(i);
				
			}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
	
	/*
	 * Dutch flag algorithm
	 * 
	 */
	
}
