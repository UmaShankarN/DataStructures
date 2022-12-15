package leetcode.twopointers;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {
	
	@Test
	public void mergeSortedArray() {
		
		
		int[] nums1 = {1,2,3,0,0,0},  nums2 = {2,5,6};
		int m = 3, n = 3;
		
		mergeSortedArraymain(nums1,nums2,m,n);
	}

	private void mergeSortedArraymain(int[] nums1, int[] nums2, int m, int n) {
		
		
		
	      int p1=0,p2=0,index =0;
	        int[] output = new int[m+n];
	      while(index<(m+n)){
	    	  
	          if(p1==m){
	              output[index++] =nums2[p2];
	              p2++;
	          }else if(p2==n){
	              output[index++] =nums1[p1];
	              p1++;
	          }else    
	          if(nums1[p1]<=nums2[p2]){
	              output[index++] = nums1[p1];
	              p1++;
	          }
	          else {
	          output[index++] = nums2[p2];
	          p2++;
	          }

	  

	      }

	      System.out.println(Arrays.toString(output));

	}
	
	

}
