package leetcode.twopointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        
        /* Pseudocode:
        * Convert the given string to lowercase
        * declare two pointers p1 =0 and p2 = length-1 of given string
        * start pointer p1 and p2 from the respective position
        * Check if the value at pointer p1 and p2 is a letter
        * if it is a letter check if the values are equal
        * if it is increment the p1 and decrement the p2, else return false
        * if the respective value in the pointer is not letter increment if it is p1 
        or decrement if it is p2
        * return true at the end of execution once all the condition satisfies 
        */


        int p1=0, p2=s.length()-1;
        String s1= s.toLowerCase();
        
        while(p1 < p2){     

            if(!Character.isLetterOrDigit(s1.charAt(p1))) p1++;
            if(!Character.isLetterOrDigit(s1.charAt(p2))) p2--;

            if(Character.isLetterOrDigit(s1.charAt(p1)) && Character.isLetterOrDigit(s1.charAt(p2))){

                if(s1.charAt(p1) == s1.charAt(p2)){
                    p1++;
                    p2--;
                }else
                    return false;
            }
        }

        return true;
    }
}