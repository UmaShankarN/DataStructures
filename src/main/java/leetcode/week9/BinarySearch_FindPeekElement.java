package leetcode.week9;

public class BinarySearch_FindPeekElement {

	public int findPeakElement(int[] nums) {

		// Not a binary search approach

		for (int middle = 0; middle < nums.length - 1; middle++) {
			if (nums[middle] > nums[middle + 1])
				return middle;
		}

		return nums.length - 1;
	}
}
