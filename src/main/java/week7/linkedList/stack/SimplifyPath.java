package week7.linkedList.stack;

import java.util.Stack;

public class SimplifyPath {

	  public String simplifyPath(String path) {
	        /* Pseudocode:
	        * Split the given string with / and convert the input to String array
	        * declare a stack and add only the word or character
	        * if the current value is .. remove the previously added string from the string
	        * Iterate over the stack and build a string out of each String by adding /
	        * if it is empty the last / shouldnt be appended to the String
	        */

	        String[] input = path.split("/");
	        Stack<String> instack = new Stack<>();
	        String s="";

	        for(String each:input){
	            if(!instack.empty() && each.equals(".."))
	                instack.pop();
	            else if(!each.equals(" ") && !each.equals("..")&& !each.equals("") && !each.equals(".") && !each.equals("_"))
	                instack.push(each);
	        }

	        if(instack.empty())
	            return "/";

	        for(String each: instack)    
	                s+= "/"+ each;


	        return s;

	      
	    }
}
