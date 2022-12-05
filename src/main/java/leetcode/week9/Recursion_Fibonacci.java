package leetcode.week9;

import org.junit.Assert;
import org.junit.Test;

public class Recursion_Fibonacci {
	
	@Test
	public void fib1() {

		Assert.assertEquals(3, fib(4));
	}
//0 1 1 2 3 5 8
	public int fib(int n) {
		
		
		System.out.println(fibonacci(n));
		
		return fibonacci(n);
	}

	private int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		
		//System.out.println(fibonacci(n - 1) + fibonacci(n - 2));
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	//n-1 = 3 // 2  // 1 // 0 //3 //4
}	// 2 // 1 //0 
	// 1 // 0

// 2
//0


// 2 // 0 

