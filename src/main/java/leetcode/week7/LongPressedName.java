package leetcode.week7;

import org.junit.Assert;

public class LongPressedName {
// 8*********************Not working****************************
	public void isLongPressedName() {
		
		Assert.assertEquals(true, isLongPressedName("alex",  "aaleex"));
		
	}

	public boolean isLongPressedName(String name, String typed) {

		// if(typed.length() < name.length()) return false;

		for (int i = 0; i < typed.length(); i++) {
			int j = 0;
			if (typed.charAt(i) != name.charAt(j))
				j++;
			if (typed.charAt(i) == name.charAt(j)) {

			}

		}
		return false;

	}
}

/*
 * public boolean isLongPressedName(String name, String typed) {
 * 
 * HashMap<Character, Integer> nameMap = new HashMap<>(); HashMap<Character,
 * Integer> typedMap = new HashMap<>();
 * 
 * for(Character eachin : name.toCharArray()) nameMap.put(eachin,
 * nameMap.getOrDefault(eachin,0)+1);
 * 
 * for(Character eachin : typed.toCharArray()){
 * 
 * if(nameMap.containsKey(eachin)) typedMap.put(eachin,
 * typedMap.getOrDefault(eachin,0)+1); else return false;
 * 
 * }
 * 
 * System.out.println(nameMap); System.out.println(typedMap);
 * 
 * if(nameMap.size() != typedMap.size()) return false;
 * 
 * for(Character eachCharKeyin: nameMap.keySet()){ //
 * if(nameMap.get(eachCharKeyin) < typedMap.get(eachCharKeyin) ||
 * nameMap.get(eachCharKeyin) == typedMap.get(eachCharKeyin) )
 * 
 * if(nameMap.get(eachCharKeyin) > typedMap.get(eachCharKeyin)) return false;
 * 
 * }
 * 
 * 
 * return true; }
 */
