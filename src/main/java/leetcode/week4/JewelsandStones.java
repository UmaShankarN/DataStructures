package leetcode.week4;

import org.junit.Assert;
import org.junit.Test;

public class JewelsandStones {
	
	/*
	 * 771. Jewels and Stones
	 * https://leetcode.com/problems/jewels-and-stones/description/ 
	 */
	
	/*
	 * Pseudocode:
	 * Convert jewel String to character array and iterate using outer for each loop
	 * Convert stones String to character array and iterate using inner each loop
	 * use a counter variable to increment each time when a jewel is found in stone
	 * 
	 */
	@Test
	public void numJewelsInStones1() {
		
		String jewels = "aA", stones = "aAAbbbb";
		Assert.assertEquals(3, numJewelsInStones2(jewels, stones));
	}
	
	
	@Test
	public void numJewelsInStones2() {
		
		String  jewels = "z", stones = "ZZ";
		Assert.assertEquals(0, numJewelsInStones2(jewels, stones));
	}

	//O(N^2)
    public int numJewelsInStones(String jewels, String stones) {
    	
    	int counter =0;
    	for (Character jewel : jewels.toCharArray()) {
			for (Character stone : stones.toCharArray()) {
				if(jewel == stone)
					counter+=1;
			}
		}
		return counter;
        
    }
    
    //O(N)
   public int numJewelsInStones2(String jewels, String stones) {
    	
    	int counter =0;
			for (char stone : stones.toCharArray()) {
				if(jewels.indexOf(stone)!=-1)
					counter+=1;
			}
		return counter;
        
    }
	
}
