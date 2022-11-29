package week7.linkedList;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindrome {

	@Test
	public void isPlaindrome() {
		int[] input = { 1, 2, 3, 4 };
		Node head = addvaluesLinkedList(input);
		Assert.assertEquals(true, isPalindrome(head));
	}

	private Node addvaluesLinkedList(int[] input) {

		SingleLinkedList s1 = new SingleLinkedList();
		s1.addAll(input);
		return s1.head;
	}

	public boolean isPalindrome(Node head) {
		
		Node temp = head;
		//Node temp2 = temp;
		Node current = temp;
		Node following = temp;
		Node previous = null;
		// 1 2 3 4
		// 2
		while (current != null) {
			
			following = current.next; // 2
			current.next = previous; //1
			previous = current;// 1
			current= following; //as 2
		}
		
		//current =previous;

		while (previous != null) {

			System.out.println(previous.value);
			previous = previous.next;
		}
		
		//didn't change head
		while (head != null) {

			System.out.println(head.value);
			head = head.next;
		}
		
		

		return true;

	}
	
	
//	public boolean isPalindrome(ListNode head) {
//    List<Integer> inputList = new ArrayList<>();
//    while(head!=null){
//        inputList.add(head.val);
//        head = head.next;
//    }
//
//    int start =0, end = inputList.size()-1;
//     while(start < end){
//
//         if(inputList.get(start) != inputList.get(end))
//             return false;
//
//         start++;
//         end--;
//     }
//    return true;}
	
	
//	   public boolean isPalindrome(ListNode head) {
//	        
//		    Stack<Integer> inStack = new Stack<>();
//		    ListNode temp =head;
//		     while(temp!=null){
//		        inStack.push(temp.val);
//		        temp = temp.next;
//		    }
//
//		    temp = head;
//
//		    while(temp!=null){
//		        if(temp.val != inStack.pop())
//		          return false;
//		        
//		        temp = temp.next;
//		    }
//
//		    return true;}

}
