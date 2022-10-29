package leetcode;

import java.util.Arrays;

public class Problem1317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1010, temp=0;
	       int[] result = new int[2];
	       temp=n;
	      
	       
	       if(String.valueOf(n-1).contains("0")) {
	    	   n=n-1;
	       while((String.valueOf(n).contains("0"))){
	    	   n=n-1; 
	    	   result[1]=n;
	    	   result[0]= temp-result[1];
	       }
	       }
	       else 
	    	   {
	                result[1] = n-1;
	                result[0] = 1;
	            }
	      
	      
	       
	       
	       
	       System.out.println(n);
	       System.out.println(Arrays.toString(result));
	       
	       
	       
	       
	       
//	       for(int i=0; i<n;i++){
//	        if(String.valueOf(n-1).contains("0")) {
//	        	result[1] = n-2;
//	        	result[0]= n-result[1];
//	        		        	
//	        }
//	        else{
//                result[1] = n-1;
//                result[0] = 1;
//            }
//	       
//	}
	       //System.out.println(Arrays.toString(result));
}
}
