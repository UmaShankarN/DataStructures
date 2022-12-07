package leetcode.week9;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.Test;

public class FrequencySort {

	@Test
	public void freqSort() {

//		int n = 6;
//		int[] nums = { 4, 5, 6, 5, 4, 3 };
		// output[3,6,4,4,5,5]

		int n = 9;
		int[] nums = { 4, 5, 6, 1, 10, 3, 5, 4, 3 };

		TreeMap<Integer, Integer> hmap = new TreeMap<>();
		for (int each : nums)
			hmap.put(each, hmap.getOrDefault(each, 0) + 1);

		TreeSet<Integer> tset = new TreeSet<>(hmap.values());

		int[] output = new int[n];
		int i = 0;
		for (int each : tset) {
			for (int eachin : hmap.keySet()) {
				if (hmap.get(eachin) == each) {
					int j = each;
					while (j != 0) {
						output[i++] = eachin;
						j--;
					}
				}
			}
		}
		System.out.println(Arrays.toString(output));

	}

}
