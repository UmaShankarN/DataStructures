package week4class;

import org.junit.Assert;
import org.junit.Test;

public class DutchFlagAlgorithmNumbersAscending {
	
	
	
	@Test
	public void threePointerString() {
		int[] input = {1,2,0,1,2};
		Assert.assertArrayEquals(new int[] {0,1,1,2,2}, threePointer(input));
	}
	

	public int[] threePointer(int[] input) {
		// TODO Auto-generated method stub
		
		
		int low=0, middle=0, high=input.length-1;
		int temp = 0;
		while(middle<=high) {
		if(input[middle]==0) {
			temp = input[middle];
			input[middle] =input[low];
			input[low] = temp;
			middle++;
			low++;			
		}else if(input[middle]==1) {
			middle++;
		}else {
			temp =input[high];
			input[high] = input[middle];
			input[middle]=temp;
			high--;
		}

	   }
		//System.out.println(Arrays.toString(input));
		return input;
	}

}
