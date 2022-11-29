package leetcode.week8;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class MakeTheStringGreat {
	
	@Test
	public void makeGood() {
		String s = "leEeetcode";
		Assert.assertEquals("leetcode", makeGood(s));
		
	}
	
	
	   public String makeGood(String s) {
	        
	       Stack<Character> goodStack = new Stack<>();

	        //System.out.println(goodStack);
	       
	       for(char eachin: s.toCharArray()) {
	    	   
	    	   if(!goodStack.empty() && Math.abs((int)eachin-(int)goodStack.peek())==32)
	    		   goodStack.pop();
	    	   else
	    		   goodStack.push(eachin);
	       }
	       System.out.println(goodStack);
	       
	       
	       StringBuilder sb = new StringBuilder();
	       String ss ="";
//	       	while(!goodStack.empty()) {
//	       		sb.append(goodStack.pop());
//	       	}
	       	
	       	while(!goodStack.empty()) 
	       		ss= goodStack.pop()+ss;
	       	System.out.println(ss);
	       	//System.out.println(sb.reverse());
	        return ss;
	    }
//https://leetcode.com/problems/crawler-log-folder/description/
}
