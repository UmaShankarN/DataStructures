package week10.sortingArray;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {

	@Test
	public void bubbleSort() {
	
	int nums[] = {2,4,11,5,6,1,4};
	//2 4 5 6 1 4 11
	//2 4 5 1 4 6 11
	//2 4 1 4 5 6 11 
	//2 1 4 4 5 6 11
	//1 2 4 4 5 6 11
	
	for(int i =0; i<nums.length-1;i++) {
	
	for(int j=0; j<nums.length-1-i;j++) {
		
		if(nums[j]>nums[j+1]) {
			int temp = nums[j];
			nums[j] = nums[j+1];
			nums[j+1] = temp;
		}
		
	}
}
	
	System.out.println(Arrays.toString(nums));
	
}
	
}
	
