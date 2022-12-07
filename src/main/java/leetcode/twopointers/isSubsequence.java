package leetcode.twopointers;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {


    /* Pseudocode:
    * convert s to char array and iterate each char
    * find first char is available in the string if not return false
    * if it is available remove the character and characters before that or store the index of the 
    * character
    * In second iteration second character should start after the index of th first character, if it
    * is found store the current index or return false
    * repeat until the length of t
    */ 
        int ptr1 =0, ptr2 =0, count=0;

        if(s.length() > t.length())
            return false;

        while(ptr1 <s.length() && ptr2 <t.length()){

            if(s.charAt(ptr1) == t.charAt(ptr2)){
                count++;
                ptr1++;
                ptr2++;
            }else{
                ptr2++;
            }
        }

        if(count==s.length())
            return true;

        return false;
    }
}
