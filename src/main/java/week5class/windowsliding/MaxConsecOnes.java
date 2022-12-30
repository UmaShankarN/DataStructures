package week5class.windowsliding;

public class MaxConsecOnes {

    public static void main(String[] args) {

        /* Pseudocode: 10 mins
        * Keep the left pointer =0 and right pointer =0
        * traverse the array using for loop and check if the current value is 1
        * increment the right until the k values is consumed that is if right is 0
        * if k is zero, take the length right-left and put it in max variable
        * then increment the left
        *
        */
    	
    	int[] nums= {1,1,1,0,0,0,1,1,1,1,0};  int k=2;

        int left =0, max =Integer.MIN_VALUE;
        for(int right=0; right < nums.length; right++){

            if(nums[right] == 0)
                k--;
            
            if(k<0){

                if(nums[left] == 0)
                    k++;
                left++;
            }

            max = Math.max(max, right-left+1);
        }
        
       System.out.println(max);

        
    }
	
	
}
