package week6class;

public class SortByParityII {
	
	public int[] sortArrayByParityII(int[] nums) {
	       int oddindex=1,evenindex=0,temp=0;
	        
	        while(oddindex < nums.length && 
	
	evenindex<nums.length){
        if(nums[oddindex]%2 < nums[evenindex]%2){
            temp = nums[oddindex];
            nums[oddindex] = nums[evenindex];
            nums[evenindex]=temp;
        }
        if (nums[oddindex] % 2 == 1)
            oddindex = oddindex + 2;
        if (nums[evenindex] % 2 == 0)
            evenindex = evenindex + 2;
    }
    
    return nums;
    
}

}
