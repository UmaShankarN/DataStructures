package leetcode.twopointers;

public class RemoveDuplicates {
	
	
    public int removeDuplicates(int[] nums) {
        
        /* Pseudocode:
        * declare pointer p1 =0 and p2 =p1+1, counter =1;
        * check if the pointer p2 and p1 difference is 1. if it is not 1 move the pointer p2
        * if it is, increment pointer 1 and replace the current value with pointer p2 value, increment counter
        * Break the loop when p2 is less than length of array
        */

        if(nums.length <2)
            return nums.length;

        int p1=0, p2=1;
        while(p2 < nums.length){
            if(nums[p2]-nums[p1] != 0){
                p1++;
                nums[p1] = nums[p2];
                p2++;
             } else
                p2++;

        }
        return p1+1;
    }
}