package leetcode.twopointers;

public class ReversePrefix {
    public String reversePrefix(String word, char ch) {

        /* Two pointers
        * declare p1=0; p2=0, conver the word to char array
        * increment the pointer until the char ch is found and get the index, or us indexOf to get the index value. if it returns -1 return the original word
        * once the start and end of p1 and p2 is found
        * swap the characters, increment the p1 and decrement the p2 until the p1 < p2
        * return the char array as String
        */

        int p1=0, p2 =0, i=0;

        if(word.indexOf(ch)==-1)
            return word;
        else
            p2 = word.indexOf(ch);
        
        char[] input = new char[word.length()];
        for(char eachin:word.toCharArray())
            input[i++]=eachin;
 
        while(p1 < p2){
            char temp = input[p2];
            input[p2] = input[p1];
            input[p1] = temp;
            p1++;
            p2--;
        }

        return String.valueOf(input);
    }
}
