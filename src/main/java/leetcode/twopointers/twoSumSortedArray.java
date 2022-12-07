package leetcode.twopointers;

public class twoSumSortedArray {
    /*
    Pseudocode:
    create int array of size 2
    ouer for loop to iterate through numbers array from i=0 to length-1
    inner for loop to iterate from i+1 to length
    check if sum of i and i+1 is target, 
    if it is target return the index of numbers.
    */
    public int[] twoSum(int[] numbers, int target) {
        // int result[] = new int[2];
		
		// for(int i =0; i<numbers.length-1; i++) {
		// 	for(int j=i+1; j<numbers.length;j++) {
		// 		if(numbers[i]+numbers[j]==target) {
		// 			result[0]=i+1;
		// 			result[1]=j+1;
		// 		}
				
		// 	}
			
		// }
        
        // return result;


        /*Two pointers
        * Declare two pointers p1 and p2 one starting from 0
        * and length -1 of the array
        * check if th sum of values in the corresponding index is < or > target
        * if the sum is greater decrement right pointer
        * if sum is lesser increment the left pointer
        * return the p1+1 and p2+1 indexes if the sum is found
        */

        int p1 =0, p2=numbers.length-1;
        int[] output = new int[2];
        while(p1<p2){

            if(numbers[p1] + numbers[p2] == target){
                output[0] = p1+1;
                output[1] = p2+1;
                 return output;
            }
            else if(numbers[p1]+numbers[p2] > target){
                p2--;
            } else{
                p1++;
            }
        }
       return new int[]{};
    }   

}
