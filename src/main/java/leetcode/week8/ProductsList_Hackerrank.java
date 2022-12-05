package leetcode.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ProductsList_Hackerrank {

	@Test
	public void productList1() {
		List<String> nameList = new ArrayList<>(Arrays.asList("ball", "bat", "glove", "glove", "glove"));
		List<Integer> priceList = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 1));
		List<Integer> weightList = new ArrayList<>(Arrays.asList(2, 5, 1, 1, 1));
		Assert.assertEquals(1, productList(nameList, priceList, weightList));

	}

	private int productList(List<String> nameList, List<Integer> priceList, List<Integer> weightList) {

		HashSet<String> hset = new HashSet<>();
		
		for(int i =0; i<nameList.size(); i++) {
			hset.add(nameList.get(i)+""+priceList.get(i)+""+weightList.get(i));
		}
		
		System.out.println(hset.size());
		return nameList.size()-hset.size();
	}

}
