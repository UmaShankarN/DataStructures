package leetcode.week4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStrings {

//	
//	@Test
//	public void isIsomorphic1() {
//		
//		String  s= "egg", t = "add";
//		Assert.assertEquals(true, isIsomorphic(s, t));
//	}
//	
//	@Test
//	public void isIsomorphic2() {
//		
//		String  s= "foo", t = "bar";
//		Assert.assertEquals(false, isIsomorphic(s, t));
//	}
	
	@Test
	public void isIsomorphic3() {
		
		String  s= "paper", t = "title";
		Assert.assertEquals(true, isIsomorphic(s, t));
	}

//	@Test
//	public void isIsomorphic4() {
//
//		String s = "badc", t = "baba";
//		Assert.assertEquals(false, isIsomorphic(s, t));
//	}
//
//	@Test
//	public void isIsomorphic5() {
//
//		String s = "abca", t = "abaa";
//		Assert.assertEquals(false, isIsomorphic(s, t));
//	}
////	
//	@Test
//	public void isIsomorphic6() {
//
//		String s = "bbbaaaba", t = "aaabbbba";
//		Assert.assertEquals(false, isIsomorphic(s, t));
//	}


	public boolean isIsomorphic(String s, String t) {
		boolean flag = false;
			HashMap<Character, Character> cmap = new HashMap<>();
			HashSet<Character> chars = new HashSet<Character>();
			HashSet<Character> mapchars = new HashSet<Character>();
			
			String st =s+t;
			for (Character character : st.toCharArray()) 
				chars.add(character);
				
			System.out.println(chars);
			if(s.length()==t.length()) {
				for(int i=0;i<s.length();i++) {
					cmap.put(s.charAt(i), t.charAt(i));
					if(cmap.values().contains(s.charAt(i))) {
						cmap.remove(s.charAt(i));
					}
					if(cmap.values().contains(t.charAt(i))) {
						cmap.remove(t.charAt(i));
					}
				}
				System.out.println(cmap);
				
			for (Map.Entry<Character, Character> entry : cmap.entrySet()) {
						mapchars.add(entry.getKey());
						mapchars.add(entry.getValue());
				}
			System.out.println(mapchars);
			if(chars.size() == mapchars.size()) 
				flag=true;
				
			}
			else
				flag=false;
			
			return flag;
		

	}

}
