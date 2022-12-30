package interviewQs;

import org.junit.Test;

public class CharOccurence {
	
	
	@Test
	public void charOccurence1() {
		
		charOccurence("aaabbccaadde");
	}
	
	@Test
	public void charOccurence2() {
		
		charOccurence("aaabbcccaadd");
	}
	
	public void charOccurence(String s) {
		
		
		/*
		 * Pseudocode:
		 * declare two pointers p1 =0 and p2=0; counter =0
		 * check if p1 and p2 is equal, if it is increment counter, incrment p2
		 * if not equal add the left character to a string and counter value move the p1 to p2
		 * return the string
		 * 
		 */
	
        //aaabbccaadde
        
        int p1=0, p2 =0, counter=0;
        String s2="";
        
        while(p2 < s.length()) {
        	
        	if(s.charAt(p1) == s.charAt(p2)) {
        		counter++;
        		p2++;
        		
        	}else {
        		
        		s2+=String.valueOf(s.charAt(p1)) + counter;
        		counter=0;
        		p1=p2;
        	}

        }
        s2+=String.valueOf(s.charAt(p1))+counter;
        System.out.println(s2);
        
	}

}
