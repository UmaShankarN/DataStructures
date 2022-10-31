package week3class1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumHashSetReturnNumber {
	
	

	@Test
	public void twosumHashSet1() {
		int[] nums = {2,7,11,15};
		int target =18;
		Assert.assertArrayEquals(new int[] {7,11}, twoSumHashSetReturnNumber(nums,target));
	}

	public int[] twoSumHashSetReturnNumber(int[] nums,int target) {
		// TODO Auto-generated method stub
				
		Set<Integer> nset = new HashSet<Integer>();
		for (int i=0; i<nums.length; i++) {
			nset.add(nums[i]);
			if(nset.contains(target-nums[i])) {
				return new int[] {target-nums[i], nums[i]};
			}	
		}
		
		return new int[] {};
		
	}

}
