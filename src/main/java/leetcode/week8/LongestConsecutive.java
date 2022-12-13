package leetcode.week8;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LongestConsecutive  {
	    public int longestConsecutive(int[] nums) {
	        
	        if(nums.length<2)
	            return nums.length;
	        TreeSet<Integer> tset = new TreeSet<>();
	        
	        for(int each:nums)
	            tset.add(each);
	        List<Integer> list = new ArrayList<>(tset);

	        int start=0, end=0,max=1;

	        for(int i=1;i<list.size();i++){
	            if(list.get(i)-list.get(i-1)!=1)
	                start=i;
	                              
	            end++;
	            max = Math.max(max, end-start+1);
	        }

	    return max;
	      

	    }
	}
