package leetcode.twopointers;

public class sortArrayByOddandEvenPosition {

public int[] sortArrayByParityII(int[] nums) {

int start = 0, end = 1;

		while (start <nums.length && end < nums.length) {

			if (nums[start] % 2 != 0) {
				if (nums[end] % 2 == 0) {
					int temp = nums[start];
					nums[start] = nums[end];
					nums[end] = temp;
					start += 2;
					end += 2;
				}else
					end+=2;

			}else
				start+=2;
				
		}
		
return nums;
    

    }
}
