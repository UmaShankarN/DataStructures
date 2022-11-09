package leetcode.week5;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class UncommonWordsFromTwoSentences {
	
	
	/*
	 * 884. Uncommon Words from Two Sentences
	 * https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
	 * 
	 */
	@Test
	public void uncommonFromSentences1() {
		
		String s1 = "this apple is sweet", s2 = "this apple is sour";
		Assert.assertArrayEquals(new String[] {"sweet","sour"}, uncommonFromSentences(s1, s2));
	}
	
	@Test
	public void uncommonFromSentences2() {
		
		String s1 = "apple apple", s2 = "banana";
		Assert.assertArrayEquals(new String[] {"banana"}, uncommonFromSentences(s1, s2));
	}
	
	
	/*
	 * Pseudocode:
	 * Create a hashmap to store the words and occurences
	 * Convert the given String s1 and s2 to String array
	 * Add each word to the map
	 * declare the output String array with size equivalent to number of values in map with value 1
	 * iterate the map and add the words that occur once to the output String array
	 * return the String array
	 * S 
	 */
	public String[] uncommonFromSentences(String s1, String s2) {
    HashMap<String, Integer> inputmap =new HashMap<>();
    for(String s1words:s1.split(" "))
        inputmap.put(s1words,inputmap.getOrDefault(s1words,0)+1);
    
    for(String s2words:s2.split(" "))
        inputmap.put(s2words,inputmap.getOrDefault(s2words,0)+1);

    int size =0;
    for(Integer count :inputmap.values()){
        if(count==1)
            size++;
    }

    String[] output = new String[size];
    int i =0;
    for(String word :inputmap.keySet()){
        if(inputmap.get(word) == 1){
            output[i] = word;
            i++;}

    }

    return output;
}
}
