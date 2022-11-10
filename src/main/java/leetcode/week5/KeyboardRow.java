package leetcode.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class KeyboardRow {

	/*
	 * 500. Keyboard Row
	 * https://leetcode.com/problems/keyboard-row/description/
	 * 
	 */
	@Test
	 public void findWords1() {
		 
		String[] words = {"Hello","Alaska","Dad","Peace"} ;
		Assert.assertArrayEquals(new String[] {"Alaska","Dad"}, findWords(words));
	 }
	
	@Test
	 public void findWords2() {
		 
		String[] words = {"omk"} ;
		Assert.assertArrayEquals(new String[] {}, findWords(words));
	 }

	@Test
	 public void findWords3() {
		 
		String[] words = {"adsdf","sfd"} ;
		Assert.assertArrayEquals(new String[] {"adsdf","sfd"}, findWords(words));
	 }
	 
	/*
	 * Pseudocode:
	 * Create three lists for each alphabetical row of keyboard and the characters
	 * Iterate each word and each characters in the word
	 * Create three counters for each row
	 * check if the word is in which list and increment the respective counter
	 * check if the counter value is same as word length
	 * if matches add the current word to the list
	 * add the values of list to the output String array and return the output
	 * 
	 */
	 
    public String[] findWords(String[] words) {
        List<Character> firstRow = new ArrayList<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        List<Character> secondRow = new ArrayList<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        List<Character> thirdRow = new ArrayList<>(Arrays.asList('z','x','c','v','b','n','m'));
        List<String> outputList = new ArrayList<>();
        for (String eachword : words) {
        	int firstRowcounter =0, secondRowcounter =0, thirdRowcounter =0;
			for (char character : eachword.toLowerCase().toCharArray()) {
				if(firstRow.contains(character))
					firstRowcounter+=1;
				if(secondRow.contains(character))
					secondRowcounter+=1;
				if(thirdRow.contains(character))
					thirdRowcounter+=1;
			}
			if(eachword.length()==firstRowcounter)
				outputList.add(eachword);
			if(eachword.length()==secondRowcounter)
				outputList.add(eachword);
			if(eachword.length()==thirdRowcounter)
				outputList.add(eachword);
		}
        
        String[] output = new String[outputList.size()];
        for(int i=0;i<outputList.size();i++)
        	output[i] = outputList.get(i);
        
		return output;

    }
}
