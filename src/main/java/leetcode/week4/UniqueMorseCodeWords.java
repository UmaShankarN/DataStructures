package leetcode.week4;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWords {
	
	
	/*
	 * 804. Unique Morse Code Words
	 * https://leetcode.com/problems/unique-morse-code-words/description/
	 * 
	 */
	
	/*
	 * Pseudocode:
	 * Create a method to return the morsecode equivalent for the character
	 * -Method contains a Map with lowercase alphabets in key and the morse code in value
	 * Create HashSet to store the unique values
	 * iterate through each word and each character in string and append the equivalent morse code in a new string
	 * Add the converted string to set
	 * after the iteration return the size of the set
	 */
	
	@Test
	public void uniqueMorseRepresentations1() {
		
		String[] words = {"gin","zen","gig","msg"};
		Assert.assertEquals(2, uniqueMorseRepresentations(words));
	}
	
	@Test
	public void uniqueMorseRepresentations2() {
		
		String[] words = {"a"};
		Assert.assertEquals(1, uniqueMorseRepresentations(words));
	}
	
	  public int uniqueMorseRepresentations(String[] words) {
		  HashSet<String> codeSet = new HashSet<>(); 
		  for (String string : words) {
			  String s="";
			for (Character chars : string.toCharArray())
				s+=morseMap(chars);
			codeSet.add(s);
		}
		return codeSet.size();
	    }
	  
	  //returns the code for the given character
	  private String morseMap(Character chars) {
		 String[] morsecode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		 HashMap<Character, String> morseMap = new HashMap<>();
		 int i=97;
		 for (String string : morsecode)
			morseMap.put((char)i++, string);
		 return morseMap.get(chars);
		  
	  }

}
