package expandFromCenter;

public class SmallerThanCurrentNumber {
	
	
	    public int[] smallerNumbersThanCurrent(int[] nums) {
	        
	        /* Pseudocode:
	        * Iterate from 0 to length-1 of the given array
	        * initialise current value to i, left to i-1 and right to i+1
	        * decrement left and increment right until it reaches the 0 and length-1
	        * check if the left >=0 and the numbers on the left is less than current value, if it is increment the counter
	        * check if the right < length and the number on the right is less, if it is increment counter
	        * check if the left reaches 0 and the right reached length-1, add the current counter to output array
	        */
	        
	        int[] output = new int[nums.length];
	    
	        for(int i=0; i< nums.length; i++){
	            int left=i-1, right= i+1, counter=0;
	            
	            while(left >= 0 || right < nums.length ){

	                if(left>=0 && nums[left--] < nums[i]){
	                    counter++;
	                }
	                if(right < nums.length && nums[right++] < nums[i]){
	                    counter++;
	                }
	                if(left<0 && right == nums.length)
	                    output[i] = counter;

	            }

	        }

	        return output;
	        }
	    }

