package leetcode.week5;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberWordsYouCanType {

	/*
	 * 1935. Maximum Number of Words You Can Type
	 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
	 * 
	 */
	@Test
	public void canBeTypedWords1() {

		String text = "hello world", brokenLetters = "ad";
		Assert.assertEquals(1, canBeTypedWords(text, brokenLetters));
	}

	@Test
	public void canBeTypedWords2() {

		String text = "leet code", brokenLetters = "lt";
		Assert.assertEquals(1, canBeTypedWords(text, brokenLetters));
	}

	@Test
	public void canBeTypedWords3() {

		String text = "leet code", brokenLetters = "e";
		Assert.assertEquals(0, canBeTypedWords(text, brokenLetters));
	}

	/*
	 * initialise a wordcount variable to store the output count iterate through
	 * each word of the given text string initialise a counter variable with 0
	 * iterate through each character of broken letters increment the counter if the
	 * broken letter is found in the current word verify if the counter is equal to
	 * the length of broken letters and increment the wordcount return the word
	 * count once all the words in the given text is verified
	 * 
	 */
	public int canBeTypedWords(String text, String brokenLetters) {

		int wordcount = 0;

		for (String wordsintext : text.split(" ")) {
			int counter = 0;
			for (char brokenchars : brokenLetters.toCharArray()) {
				if (wordsintext.indexOf(brokenchars) == -1)
					counter += 1;
			}
			if (counter == brokenLetters.length())
				wordcount += 1;

		}
		System.out.println(wordcount);
		return wordcount;
	}

}
