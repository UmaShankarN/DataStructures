package leetcode.twopointers;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int p1=0, p2=0;
        while(p2 < nums.length){
            if(nums[p2]!=0){
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2++;
            }else
                p2++;
        }
	
		}
}
