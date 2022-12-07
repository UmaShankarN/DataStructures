package leetcode.twopointers;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        
    /* Pseudocode: Two Pointers
    * Convert the given s to a char array
    * declare two pointers p1 starts at 0 index and p2 from s.length()-1
    * check if both position has alphabet using Character.isAlphabetic(char)
    * if it is alphabet swap and decrement the pointer
    * else check if left is not a alphabet, increment left else decrement right
    * break when the p1 is less than p2
    * return the char array as String
    */

    int p1=0, p2=s.length()-1, i=0;
    char[] input = new char[s.length()];

    for (char eachin:s.toCharArray())
        input[i++] = eachin;

    while(p1 < p2){

        if(Character.isAlphabetic(input[p1]) && Character.isAlphabetic(input[p2])){//isLetter also works
            char temp = input[p2];
            input[p2--] = input[p1];
            input[p1++] = temp;
        }else if(!Character.isAlphabetic(input[p1])){
            p1++;
        }else p2--;            
    }
    return String.valueOf(input);
        
    }
}
