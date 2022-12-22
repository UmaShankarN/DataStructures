package interviewQs;

public class ProductOfArrayExceptSelf {
	    public int[] productExceptSelf(int[] nums) {


	    /*
	    * Pseudocode:
	    * Create two int arrays, add 1 to the first index of first array and 1 to the last index of second array
	    * Iterate the first declared int array from first index until length-1
	    * multiply the value in 0th index with the value in 0th index of input array
	    * and store it from the first index
	    * Do the same in reverse order in another declared int array
	    * Multiply the resultant array and return the result
	    */
	        
	        int[] arr1 = new int[nums.length];
	        int[] arr2 = new int[nums.length];
	        arr1[0] =1; arr2[nums.length-1]=1;

	        for(int i=0; i<arr1.length-1; i++)
	            arr1[i+1] = nums[i] * arr1[i];
	        
	        for(int i=arr2.length-1; i>0; i--)
	            arr2[i-1] = nums[i] * arr2[i];
	        
	        for(int i=0; i< arr1.length; i++)
	            arr1[i] = arr1[i] * arr2[i];

	        return arr1;
	    }
	}

