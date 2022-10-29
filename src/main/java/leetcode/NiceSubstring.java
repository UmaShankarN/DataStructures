package leetcode;

import java.util.Arrays;

public class NiceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    String s  = "YazaAay";
    int counter = 0, start=0, end=0, j=0;
    int[] sint = new int[s.length()];



    		for(int i =0; i<s.length();i++) {
    			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
    				sint[i] = s.charAt(i)-'a';

    		else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
    				sint[i] = s.charAt(i)-'A';
    		}
    
		System.out.println(Arrays.toString(sint));
		
		
while(j<sint.length)
{
	
	if(sint[j]==sint[j+1]) {
		start=j;
		end=j+1;
	}
}
		System.out.println(start);
		System.out.println(end);
	}
}