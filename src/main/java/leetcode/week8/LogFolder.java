package leetcode.week8;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LogFolder {

	@Test
	public void minOperations1() {

		String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
		Assert.assertEquals(2, minOperations(logs));
	}

	@Test
	public void minOperations2() {

		String[] logs = { "d1/", "../", "../", "../" };
		Assert.assertEquals(0, minOperations(logs));
	}

	@Test
	public void minOperations3() {

		String[] logs = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
		Assert.assertEquals(3, minOperations(logs));
	}

	public int minOperations(String[] logs) {

        int s=0;
      for(String eachin:logs){
          if(eachin.equals("./")){
              continue;
         // }else if(!logStack.empty() && eachin.equals("../")){
              }else if(s!=0 && eachin.equals("../")){
             // logStack.pop();
             s--;
          }else if(!eachin.equals("../")){
             // logStack.push(eachin);
             s++;
          }
      }

  //return logStack.size();
  return s;
	}
}
