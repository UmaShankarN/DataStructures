package week3class1;

import java.util.Arrays;

public class DutchFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,0,0,-1,100,88,1,2};
		int temp =0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] =arr[j];
					arr[j]=temp;					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
