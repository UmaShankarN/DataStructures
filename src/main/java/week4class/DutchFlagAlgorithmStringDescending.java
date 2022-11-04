package week4class;

import org.junit.Assert;
import org.junit.Test;

public class DutchFlagAlgorithmStringDescending {
	
	
	
	@Test
	public void threePointerString() {
		String[] input = {"Red", "Green", "Green", "Blue", "Red"};
		Assert.assertArrayEquals(new String[] {"Blue", "Green", "Green", "Red", "Red"}, threePointer(input));
	}
	

	public String[] threePointer(String[] input) {
		// TODO Auto-generated method stub
		
		
		int low=0, middle=0, high=input.length-1;
		String temp;
		while(middle<=high) {
		if(input[middle]=="Blue") {
			temp = input[middle];
			input[middle] =input[low];
			input[low] = temp;
			middle++;
			low++;			
		}else if(input[middle]=="Green") {
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
