package week7.linkedList;

import org.junit.Assert;
import org.junit.Test;

public class RotateList {

	@Test
	public void rotateList1() {
		int[] input = { 1, 2, 3, 4 };
		int[] output = {4,5,1,2,3};
		Node finalhead = addvaluesLinkedList(output);
		Assert.assertEquals(finalhead, rotateList(addvaluesLinkedList(input), 2));
	}

	@Test
	public void rotateList2() {
		int[] input = { 1, 2, 3 };
		int[] output = {2,3,1};
		Node finalhead = addvaluesLinkedList(output);
		Assert.assertEquals(finalhead, rotateList(addvaluesLinkedList(input), 2000000000));
	}

	
	
	private Node addvaluesLinkedList(int[] input) {

		SingleLinkedList s1 = new SingleLinkedList();
		s1.addAll(input);
		return s1.head;
	}

	/*
	 * private Node rotateList(Node head, int k) {
	 * 
	 * for (int i = 0; i < k; i++) { Node temp3 = null; Node temp2 = head; while
	 * (temp2!= null) {
	 * 
	 * temp2 = temp2.next; if (temp2.next == null) { temp3 = temp2; temp2 = null;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * Node temp4 = head; while(temp4.next.next!=null) temp4 = temp4.next;
	 * 
	 * temp4.next = null; temp3.next = head; head = temp3; }
	 * 
	 * return head; }
	 */

	public Node rotateList(Node head, int k) {
		
		
		
		
		return head;
		
	}
	
}