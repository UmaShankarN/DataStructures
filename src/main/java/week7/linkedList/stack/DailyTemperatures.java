package week7.linkedList.stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemperatures {

	@Test
	public  void dailyTemperatures() {
		int[] input = {89,62,70,58,47,47,46,76,100,70};
	Assert.assertArrayEquals(new int[] {8,1,5,4,3,2,1,1,0,0}, dailyTemperatures(input));
	}
	
	
    public int[] dailyTemperatures(int[] temperatures) {

    /* Pseudocode:
    * Start for loop from length-2 to 0 th index of given array
    * check if the current values is lesser than current+1 value
    * if it is, add 1 to output array and 
    * if it is lesser, get the next highest value index by removing(pop) the stack values
    * if the stack is empty, it means no value left, therefore add 0 to output array
    * if the highest value is found subtract the current index with highest value index and insert difference to output array
    * Whenever a value is added to output array, insert the current index to the stack
    * return the output array
    */
        Stack<Integer> indexstack = new Stack<>();
        int[] output = new int[temperatures.length];

        indexstack.push(temperatures.length-1);
        output[temperatures.length-1] =0;

        for(int i = temperatures.length-2; i>=0; i--){
            if(temperatures[i] < temperatures[i+1]){
                output[i] = 1;
            } else {               
                while(!indexstack.empty() && temperatures[i] >= temperatures[indexstack.peek()])
                    indexstack.pop();

                    if(indexstack.empty())
                        output[i]=0;
                    else
                        output[i] = indexstack.peek()-i;
                }
                indexstack.push(i);
            }
          
  return output;
        }  

	      
	        
	    }

