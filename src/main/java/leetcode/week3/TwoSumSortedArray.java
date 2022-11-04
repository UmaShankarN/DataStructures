package leetcode.week3;

import java.util.Arrays;

public class TwoSumSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {2,7,11,15};
		//int[] numbers = {2,3,4};
		//int[] numbers = {-1,0};
		int target =9;
		int result[] = new int[2];
		
		for(int i =0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length;j++) {
				if(numbers[i]+numbers[j]==target) {
					result[0]=i+1;
					result[1]=j+1;
					break;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(result));
		
	}

}
