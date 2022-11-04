package leetcode.week3;

import java.util.Arrays;

public class ConvertIntegertotheSumofTwoNoZeroIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4102, temp=0;
	       int[] result = new int[2];
	       temp=n;
	      n=n-1;
	       
	       if(String.valueOf(n).contains("0")) {
	    	   
	       while((String.valueOf(n).contains("0"))){
	    	   n=n-1; 
	       }
	       result[1]=n;
    	   result[0]= temp-result[1];
	       }
	       else 
	    	   {
	                result[1] = n-1;
	                result[0] = 1;
	            } 
	       System.out.println(n);
	       System.out.println(Arrays.toString(result));
	       
}
}
