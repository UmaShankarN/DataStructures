package week10.sortingArray;

import org.junit.Test;

public class MergeSort {


	@Test
	public void insertionSort() {

		int nums[] = {-3, 1, 3, 5, 7, 2};
			//{ 2, 4, 11, 5, 6, 1, 4 };
		// 2 4 5 6 1 4 11
		// 2 4 5 1 4 6 11
		// 2 4 1 4 5 6 11
		// 2 1 4 4 5 6 11
		// 1 2 4 4 5 6 11

		// 2 4 5 11 
		//for (int i = 0; i < nums.length-1; i++) {
		int i=0;
		while(i<nums.length-1) {

			if (nums[i] > nums[i + 1]) {
				int temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
				int k =i;
				while(k!=0) {
					if(nums[k] < nums[k-1]) {
						int temp2=nums[k];
						nums[k] =nums[k-1];
						nums[k-1]=temp2;
						k--;
					}else
						break;
					
				}
		
			}
				i++;

		}

		 System.out.println(Arrays.toString(nums));

	}

}
