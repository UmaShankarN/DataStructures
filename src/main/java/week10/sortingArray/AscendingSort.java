package week10.sortingArray;

import java.util.Arrays;

public class AscendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Selection Sort	
		int nums[] = {2,4,11,5,6,1,4};
		
//		for(int i =0; i<nums.length-1;i++) {
//			
//			for(int j=i+1; j<nums.length;j++) {
//				
//				if(nums[i]>nums[j]) {
//					int temp = nums[i];
//					nums[i] = nums[j];
//					nums[j] = temp;
//				}
//				
//			}
//		}
		
		
//		for(int i =0; i<nums.length-1;i++) {
//				int j=i+1;
//				int temp=nums[i];
//				int idx=0;
//			while(j<nums.length) {
//				if(temp>nums[j]) {
//					temp=nums[j];
//					idx=j;
//				}
//				j++;
//			}
//			if(idx!=0) {
//			int temp2 = nums[i];
//			nums[i]=nums[idx];
//			nums[idx] = temp2;
//			}
//			
//		}
//		System.out.println(Arrays.toString(nums));
		
		if(nums.length<2)
			//return nums;
	
	for(int i = nums.length-1; i>0;i--) {
		int j=i-1;
		int temp=nums[i];
		int idx=nums.length-1;
	while(j>=0) {
		if(temp>nums[j]) {
			temp=nums[j];
			idx=j;
		}
		j--;
	}
	if(idx!=nums.length-1) {
	int temp2 = nums[i];
	nums[i]=nums[idx];
	nums[idx] = temp2;
	}
	
}
	//return nums;
System.out.println(Arrays.toString(nums));
}

}
