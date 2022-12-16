package leetcode.week9;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearch_GuessNumber {
	
	int pick =0;
	
	@Test
	public void guessNumber1() {
		pick =6;
		System.out.println(pick);
		Assert.assertEquals(pick,guessNumber(10));
	}
	
	@Test
	public void guessNumber2() {
		pick=1;
		System.out.println(pick);
		Assert.assertEquals(pick,guessNumber(1));
	}
	
	
	@Test
	public void guessNumber3() {
		pick=1;
		System.out.println(pick);
		Assert.assertEquals(pick,guessNumber(2));
	}
	
	
    public int guessNumber(int n) {
        
        int left =0, right = n-1, middle=0;

        while(left<=right){
            middle = left+(right-left)/2;
            if(guess(middle)==0){
                return middle;
            }else if(guess(middle) ==-1){
             right = middle-1; 
            
            }else
            left = middle+1; 
        }
        return n;
    }
    
    
	private int guess(int middle) {
		
		if(middle <pick)
			return 1;
			else if(middle>pick)
				return -1;
			else
				return 0;
	}
    
   

}
