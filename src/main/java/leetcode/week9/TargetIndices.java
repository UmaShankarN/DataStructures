package leetcode.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        /* Sort the input array
        * And iterate through the array and check if the target is available
        * return the index or indeces
        */

	for(int i=0; i<nums.length-1; i++) {
				if(nums[i]>nums[i+1]) {
					int temp = nums[i];
					nums[i] =nums[i+1];
					nums[i+1]=temp;
					i=-1;
				}
			}

    List<Integer> outputList = new ArrayList<>();
    if(Arrays.binarySearch(nums,target)<0)
        return outputList;
    
    for(int i=0; i<nums.length; i++){
        if(nums[i]==target)
            outputList.add(i);
    }

		
        return outputList;
    }
}
