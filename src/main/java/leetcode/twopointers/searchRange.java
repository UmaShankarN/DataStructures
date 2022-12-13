package leetcode.twopointers;

import java.util.Arrays;

public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        
        if(Arrays.binarySearch(nums,target)<0)
            return new int[]{-1,-1};

        int p1=0, p2=nums.length-1, start=0, end=0;

        //int[] output = new int[2];
        while(p1<nums.length){

            if(nums[p1] == target){
                start=p1;
                break;}
            p1++;
        }

        while(p2>0){

            if(nums[p2] == target){
                end=p2;
                break;}
            p2--;
        }
        System.out.println(end);
        if(nums.length!=0)
            return new int[]{start,end};

        return new int[]{-1,-1};


    }
}