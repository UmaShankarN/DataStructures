package week5class;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateZeros {

	/*
	 * 1089. Duplicate Zeros
	 * https://leetcode.com/problems/duplicate-zeros/description/
	 * 
	 */
	
	
	@Test
	public void duplicateZeros1() {
		 int[] arr = {1,0,2,3,0,4,5,0};
		 Assert.assertArrayEquals(new int[] {1,0,0,2,3,0,0,4}, duplicateZeros2(arr));
		
	}
	
	
	
	@Test
	public void duplicateZeros2() {
		 int[] arr = {1,2,3};
		 Assert.assertArrayEquals(new int[] {1,2,3}, duplicateZeros(arr));
		
	}
	
	
	/*
	 * Pseudocode:
	 * Declare an output array with the same length as input array
	 * iterate through the input array
	 * check if input is zero, add zero to the current position, next position
	 * else add the current value to output array
	 * 
	 */
	  public int[] duplicateZeros(int arr[]) {
	     
		        int[] output = new int[arr.length];//All 0s in array with same length
		        int j=0;
		        for(int i=0;i<arr.length;i++){
		           if(j<arr.length){
		            if(arr[i] == 0){
		                output[j]=0;
		                output[j++] =0;
		                j++;
		            } else{
		                output[j] = arr[i];
		                j++;
		            }
		           }          
		        }
		        for(int i=0; i<arr.length;i++)
                    arr[i] = output[i];
		        return arr;
	
	}
	  
	  //1,0,2,3,0,4,5,0
	  //1,0,0,2,3,0,0,4
	  
	  public int[] duplicateZeros2(int arr[]) {
		     
	        int[] output = new int[arr.length];//All 0s in array with same length
	       
	        int counter =0;
	        for(int i=0;i<arr.length;i++) {
	        	if(counter<arr.length) {
	        	if(arr[i]==0) {
	        		counter+=2;
	        	}else {
	        		output[counter] = arr[i];
	        		counter+=1;
	        	}
	        	}
	        }
	        
	        for(int i=0; i<arr.length;i++)
              arr[i] = output[i];
	        return arr;

}
}
