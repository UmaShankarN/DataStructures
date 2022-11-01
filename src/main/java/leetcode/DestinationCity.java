package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DestinationCity {
	/*
	 * 1436. Destination City
	 * https://leetcode.com/problems/destination-city/
	 * 
	 */
	
	/*
	 * Psuedocode
	 * Add each array as key value pair to a HashMap
	 * iterate through the Map with values
	 * Check if the Value is not a key in the map and return the value
	 */
	
	@Test
	public void destCity1() {
		List<List<String>> paths = new ArrayList<List<String>>();
		List<String> d1 = new ArrayList<String>(Arrays.asList("London", "New York"));
		List<String> d2 = new ArrayList<String>(Arrays.asList("New York", "Lima"));
		List<String> d3 = new ArrayList<String>(Arrays.asList("Lima", "Sao Paulo"));
		paths.add((ArrayList<String>) d1);
		paths.add((ArrayList<String>) d2);
		paths.add((ArrayList<String>) d3);

		Assert.assertEquals("Sao Paulo", destCity(paths));

	}

	public String destCity(List<List<String>> paths) {

		HashMap<String, String> sdCity = new HashMap<>();

		for (List<String> list : paths)
			sdCity.put(list.get(0), list.get(1));

		for (String currentvalue : sdCity.values()) {
			if (!sdCity.containsKey(currentvalue))
				return currentvalue;
		}

		return "";
	}

}
