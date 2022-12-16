package leetcode.week9;

import org.junit.Test;

import org.junit.Assert;

public class BinarySearch_FirstBadVersion {

	int bad =0;
	
	@Test
	public void badVersion1() {
		bad=4;
		Assert.assertEquals(4, firstBadVersion(5));
	}
	
	@Test
	public void badVersion2() {
		bad=1;
		Assert.assertEquals(1, firstBadVersion(1));
	}
	
	
    public int firstBadVersion(int n) {

        /* Pseudocode: Binary Search
        * declare left=0, right =n-1 and middle=0
        * check if middle version is false if it is, our version is higher, so move left next to middle
        * if our middle version is true, check the previous version, if the previous version is false
        * return the middle version which is the first bad version
        * if it is not, move our right to left of middle, because there are some bad version towards the left
        * By this our bad version will be confined to a good and bad version
        */
        int left=0, right=n-1, middle=0; 
        
        while(left<=right){
        
            middle=left+(right-left);
            if(isBadVersion(middle) == false){
                left = middle+1;
            } else{
                if(isBadVersion(middle-1) ==false)
                    return middle;
                else
                    right = middle-1;
            }
            
        }
        return n;
    }

	private boolean isBadVersion(int middle) {
		
		if(middle == bad )
			return true;
		else
			return false;
	}
    
}
