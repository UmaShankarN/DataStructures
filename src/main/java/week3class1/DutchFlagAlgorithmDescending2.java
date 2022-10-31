package week3class1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class DutchFlagAlgorithmDescending2 {
	
	
	
	@Test
	public void threePointerString() {
		int[] input = {1,2,0,1,2};
		Assert.assertArrayEquals(new int[] {2,2,1,1,0}, threePointer(input));
	}
	

	public int[] threePointer(int[] input) {
		// TODO Auto-generated method stub
		
		int low=0, middle=0, high=input.length-1;
		int temp = 0;
		while(middle<=high) {
		if(input[middle]==2) {
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
		return input;
	}

}
