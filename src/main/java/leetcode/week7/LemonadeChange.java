package leetcode.week7;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class LemonadeChange {
//
//	@Test
//	public void lemonadeChange1() {
//
//		int[] bills = { 5, 5, 5, 10, 20 };
//		Assert.assertEquals(true, lemonadeChange(bills));
//	}
//
//	@Test
//	public void lemonadeChange2() {
//
//		int[] bills = { 5, 5, 10, 10, 20 };
//		Assert.assertEquals(false, lemonadeChange(bills));
//	}
//
//	@Test
//	public void lemonadeChange3() {
//
//		int[] bills = { 10, 10 };
//		Assert.assertEquals(false, lemonadeChange(bills));
//	}

	@Test
	public void lemonadeChange4() {

		int[] bills = { 5, 5, 5, 5, 10, 5, 10, 10, 10, 20 };
		Assert.assertEquals(true, lemonadeChange(bills));
	}

	public boolean lemonadeChange(int[] bills) {
		HashMap<Integer, Integer> changeMap = new HashMap<>();

		for (int eachin : bills) {
			if (eachin == 5)
				changeMap.put(eachin, changeMap.getOrDefault(eachin, 0) + 1);
			if (eachin == 10) {
				if (changeMap.containsKey(5) && changeMap.get(5) != 0) {
					changeMap.put(eachin, changeMap.getOrDefault(eachin, 0) + 1);
					changeMap.put(5, changeMap.getOrDefault(5, 0) - 1);
				} else {
					return false;
				}
			}

			if (eachin == 20) {
				if ((changeMap.containsKey(10) && changeMap.get(10) >=1 )
						&& (changeMap.containsKey(5) && changeMap.get(5) >= 1)) {
					changeMap.put(10, changeMap.getOrDefault(10, 0) - 1);
					changeMap.put(5, changeMap.getOrDefault(5, 0) - 1);
				} else if ((changeMap.containsKey(5) && changeMap.get(5) >= 3)) {
					changeMap.put(5, changeMap.getOrDefault(5, 0) - 3);
				} else {
					return false;
				}

			}

		}
		System.out.println(changeMap);

		return true;
	}
}
