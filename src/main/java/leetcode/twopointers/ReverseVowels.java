package leetcode.twopointers;

public class ReverseVowels {
    public String reverseVowels(String s) {

        /* Two pointers
        * Add all the vowels to a list(contains(ch)) or to an Array(binarySearch(char[],ch)) or a String(use indexOf(ch) to check)
        * declare two pointer p1= 0, p2 = s.length-1;
        * Add all characters of the s to a char array
        * check if the values in index p1 and p2 has vowels
        * swap the letters else if p1 has non vowel move the p1 pointer else decrement the p2 pointer
        * return the char array as String
        */

        String vowels = "aeiouAEIOU";
        int p1=0, p2= s.length()-1,i=0;
        char[] input = new char[s.length()];

        for(char each:s.toCharArray())
            input[i++] = each;

        while(p1 < p2){

            if(vowels.indexOf(input[p1])!=-1 && vowels.indexOf(input[p2])!=-1){
                char temp = input[p2];
                input[p2--] = input[p1];
                input[p1++] = temp;
            }else if(vowels.indexOf(input[p1])==-1)
                p1++;
            else p2--;
        }

        return String.valueOf(input);
    }
}
