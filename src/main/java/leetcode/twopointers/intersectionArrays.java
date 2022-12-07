package leetcode.twopointers;

import java.util.Arrays;
import java.util.HashSet;

public class intersectionArrays {
    
/* Create a new integer array
* check if each number in array1 is in array2
* if number matches add to new integer array
* if number is already present in new array donot add
*/
    
    public int[] intersection(int[] nums1, int[] nums2) {
        
      int p1=0, p2=0;
      HashSet<Integer> outSet = new HashSet<>();
      Arrays.sort(nums1); Arrays.sort(nums2);
      while(p1 < nums1.length && p2 < nums2.length){
          if(nums1[p1] == nums2[p2]){
              outSet.add(nums1[p1]);
              p1++;
              p2++;
          }else if(nums1[p1] > nums2[p2])
            p2++;
            else
            p1++;
      }
    // 4 4 8 9 9
      int[] out = new int[outSet.size()];
      int i=0;
      for(int each:outSet)
        out[i++] = each;
        return out;

    }
}
