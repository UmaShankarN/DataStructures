package interviewQs;

import java.util.ArrayList;
import java.util.HashMap;

public class AnagramInStringOfWords {
	
	public static void main(String[] args) {
		
	String[] words = {"abba","baba","bbaa","cd","cd", "bbaa"};
	//String[] words = {"a","b","c","d","e"};
	HashMap<Character, Integer> fmap = new HashMap<>();
	
	ArrayList<String> outlist= new ArrayList<>();

	outlist.add(words[0]);
	
	for(char each:words[0].toCharArray())
		fmap.put(each, fmap.getOrDefault(each,0)+1);

	for(int i=1; i<words.length;i++){
		HashMap<Character, Integer> smap = new HashMap<>();
		if(words[i-1].length() == words[i].length()){
			for(char each:words[i].toCharArray())
				smap.put(each, smap.getOrDefault(each,0)+1);
			if(!fmap.equals(smap))
				outlist.add(words[i]);
		}else{
			fmap = new HashMap<>();
			for(char each:words[i].toCharArray())
				fmap.put(each, fmap.getOrDefault(each,0)+1);
			outlist.add(words[i]);
		}

	}
	
	System.out.println(outlist);
}

}