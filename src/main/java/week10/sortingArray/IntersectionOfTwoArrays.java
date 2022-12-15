package week10.sortingArray;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {


    public int[] intersect(int[] nums1, int[] nums2) {
        
        List<Integer> nums1list = new ArrayList<>();
        List<Integer> outputlist = new ArrayList<>();

        for(int each:nums1)
            nums1list.add(each);

        for(Integer each:nums2){
              if(nums1list.contains(each)){
                outputlist.add(each);
                nums1list.remove(each);//its taking as index not value
            }  
            System.out.println(outputlist);
            System.out.println(nums1list);

        }

        int[] output = new int[outputlist.size()];
        for(int i=0;i<outputlist.size();i++)
            output[i] =outputlist.get(i);

        return output;


        
    }
}