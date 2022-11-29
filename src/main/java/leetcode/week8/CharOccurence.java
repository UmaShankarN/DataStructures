package leetcode.week8;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "aaabbccaadde";
        String out = "a3b2c2a2d1";
        
        if(s.length()==0) {
        	System.out.println("");
        }else {
        int count =0;
        String out1="";
        char c=s.charAt(0);
        for(char eachin: s.toCharArray()) {
        	if(eachin == c) {
        		count+=1;
        	}else {
        		out1+=String.valueOf(c)+count;
        		count=1;
        		c=eachin;
        	}
        	
        }
	
        out1+=String.valueOf(c)+count;
        
		System.out.println(out1);
        }
	}

}
