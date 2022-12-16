package leetcode.week9;

public class BinarySearch_ValidPerfectSquare {

	
	
	   public boolean isPerfectSquare(int num) {

	        long left =0, right=num, middle=0; //changing to long as middle*middle at somepoint exceeds the int range and the else part gets executed with middle * middle giving negative value

	        if(num ==1 )
	            return true;

	        while(left<=right){
	            System.out.println("middle "+middle);
	            System.out.println("left " +left);
	            System.out.println("right "+right);
	            middle=left+(right-left)/2;
	            System.out.println("middle again "+middle);
	            if(middle*middle == num )
	                return true;
	            else if(middle * middle> num) 
	              right = middle-1;
	            else
	              left = middle+1;
	            
	        }

	        return false;
	        
	    }
}
