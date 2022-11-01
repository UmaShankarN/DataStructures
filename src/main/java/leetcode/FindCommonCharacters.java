package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class FindCommonCharacters {

	@Test
	public void commonChars1() {
		
		String[] words = {"bella","label","roller"};
		Assert.assertEquals(Arrays.asList("e","l","l"), commonChars(words));
	}
	
	@Test
	public void commonChars2() {
		
		String[] words = {"cool","lock","cook"};
		commonChars(words);
	}
	
	   public List<String> commonChars(String[] words) {  
		   char[] firstWord = words[0].toCharArray();
		   List<String> matchList = new ArrayList<>();
		   int min =Integer.MAX_VALUE;
		   HashMap<String,Integer> ncount =new HashMap<String, Integer>();
		   int counter =0;
		   for (char c : firstWord) {
			   for(int i=1;i<words.length;i++) {
				   if(words[i].indexOf(c)!=-1) {
					   for(int j=0;j<words[i].length();j++) {
						   if(words[i].charAt(j)== c)
							   counter+=1;
					   }
					   ncount.put(String.valueOf(c), ncount.getOrDefault(String.valueOf(c), Math.min(min, counter)));
					   counter=0;
				   }else {
					   ncount.remove(String.valueOf(c));
				   }
			   }
	    }
		for(Entry<String, Integer> entry : ncount.entrySet()) {
			for(int i=0;i<entry.getValue();i++) 
				matchList.add(entry.getKey());           
		}
		System.out.println(matchList);
		return matchList;
}
}
