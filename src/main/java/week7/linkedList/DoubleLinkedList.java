package week7.linkedList;

import org.junit.Test;

public class DoubleLinkedList {

	Node head, tail;
	int length;

	private void add(int value) {
		length++;
		Node temp = new Node(value);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			temp.previous =tail;
			tail.next = temp;
			tail = temp;
		}
	}
	
	
	private int size() {
		return length;
	}
	
	private int get(int index) {
		
		
		
		return index;
		
		
	}
	
	

	@Test
	public void doubleLinkedListMethods() {

		DoubleLinkedList s1 = new DoubleLinkedList();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		
		System.out.println("-------print list before removing elemnt by index------------");
		for (int i = 0; i < s1.size(); i++)
			System.out.println(s1.get(i));
		
		
}
	
}
