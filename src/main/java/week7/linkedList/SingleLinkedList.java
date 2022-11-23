package week7.linkedList;

import org.junit.Test;

public class SingleLinkedList {

	Node head, tail;
	int length;

	public void add(int value) {
		length++;
		Node temp = new Node(value);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
	}

	public boolean addFirst(int value) {

		length++;
		Node temp = new Node(value);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			temp.next = head;
			head = temp;
		}
		return true;
	}

	public int size() {
		return length;
	}

	public boolean removeFirst() {

		head = head.next;
		length--;
		return true;
	}

	public int get(int index) {

		Node temp = head; // here temp hold ths first value i.e., head. So start iterating from 1 to index
		for (int i = 1; i <= index; i++) // index =2, i =1,2
			temp = temp.next;

		return temp.value;
	}

	public int remove(int index) {

		Node temp = head;
		if (index == 0) {
			head = head.next;
			length--;
		} else {
			for (int i = 1; i <= index; i++) { // index =2, i =1,2
				if (i == index) {
					temp.next = temp.next.next;
					length--;
				} else
					temp = temp.next;
			}
		}
		return index;
	}

	public boolean remove(Object value) {

		if (value != null) {
			Node temp = head;
			for (int i = 0; i <= length; i++) {
				if ((Object) temp.value == value) {// 1 2 3 4
					remove(i);
					return true;
				} else
					temp = temp.next;
			}
		}
		return false;
	}

	public boolean set(int index, int value) {
		Node temp = head;

		if (index > length - 1)
			return false;

		for (int i = 0; i <= length; i++) {
			if (i == index) {
				temp.value = value;
				return true;
			} else
				temp = temp.next;
		}

		return false;
	}

	// 1 2 3 4
	public int indexOf(int value) {

		Node temp = head;
		for (int i = 0; i < length; i++) {
			if (temp.value == value) {// 1 2 3 4
				return i;
			} else
				temp = temp.next;
		}

		return -1;
	}

	public int lastIndexOf(int value) {

		Node temp = head;
		int output = -1;
		for (int i = 0; i < length; i++) {
			if (temp.value == value) {// 1 2 3 4
				output = i;
				temp = temp.next;
			} else
				temp = temp.next;
		}

		return output;
	}

	public boolean removeLastIndex() {

		remove(length - 1);
		return true;
	}

	public boolean removeFirstIndex() {

		removeFirst();
		return true;
	}

	public boolean removeAll() {

		head = null;
		length = 0;
		return true;
	}


	public boolean removeAll(int[] input) {

		for (int i = 0; i < input.length; i++) {
			Node temp = head;
			int j = 0;
			while (j != length) {

				if (temp.value == input[i]) {
					remove(j);
					temp = head;
					j = 0;
				} else {
					temp = temp.next;
					j++;
				}
			}

		}
		return true;
	}
	
	public boolean removeAll(int input) {

			Node temp = head;
			int j = 0;
			while (j != length) {

				if (temp.value == input) {
					remove(j);
					temp = head;
					j = 0;
				} else {
					temp = temp.next;
					j++;
				}
			}
		return true;
	}

//	public boolean remove(Object value) {
//
//		if (value != null) {
//			Node temp = head;
//			for (int i = 0; i <= length; i++) {
//				if ((Object) temp.value == value) {// 1 2 3 4
//					remove(i);
//					return true;
//				} else
//					temp = temp.next;
//			}
//		}
//		return false;
//	}

	public boolean addAll(int[] input) {

		if (length == 0) {
			for (int i = 0; i < input.length; i++) {
				Node newNode = new Node(input[i]);
				if (head == null) {
					length++;
					head = newNode;
					tail = newNode;
				} else {
					length++;
					tail.next = newNode;
					tail = newNode;

				}
			}
		} else {
			Node temp = head;
			for (int i = 0; i < length; i++) {
				if (temp.next == null) {
					for (int j = 0; j < input.length; j++) {
						Node newNode = new Node(input[j]);
						length++;
						tail.next = newNode;
						tail = newNode;
					}
				} else {
					temp = temp.next;
				}

			}

		}

		return true;
	}

	@Test
	public void singleLinkedListMethods() {

		SingleLinkedList s1 = new SingleLinkedList();
		s1.add(4);
		s1.add(1);
		s1.add(4);
		s1.add(1);
		s1.add(1);
//		System.out.println(s1.head.value);
//		System.out.println(s1.tail.value);
//		System.out.println(s1.size());
//		System.out.println(s1.removeFirst());
//		System.out.println(s1.size());
//		System.out.println("-------print list before removing elemnt by index------------");
//		for (int i = 0; i < s1.size(); i++)
//			System.out.println(s1.get(i));
//
		// System.out.println(s1.remove(1));
//		// System.out.println(s1.size());
//		System.out.println("-------print list after removing elemnt by index------------");
//		for (int i = 0; i < s1.size(); i++)
//			System.out.println(s1.get(i));
//		System.out.println(s1.size());
//		System.out.println(s1.remove(Integer.valueOf(1)));
//		System.out.println("-------print list after removing elemnt by value------------");
//		for (int i = 0; i < s1.size(); i++)
//			System.out.println(s1.get(i));

//		System.out.println(s1.set(2,6));
//		System.out.println("-------print list after adding element by index------------");
//		for (int i = 0; i < s1.size(); i++)
//			System.out.println(s1.get(i));

//		System.out.println(s1.indexOf(1));
//		System.out.println(s1.lastIndexOf(1));
//
//		System.out.println(s1.removeFirstIndex());
//		System.out.println("-------print list after remove removeFirstIndex------------");
//		for (int i = 0; i < s1.size(); i++)
//			System.out.println(s1.get(i));
//
//		System.out.println(s1.removeLastIndex());
//		System.out.println("-------print list after remove removeLastIndex------------");
//		for (int i = 0; i < s1.size(); i++)
//			System.out.println(s1.get(i));
//
//		System.out.println(s1.addFirst(6));
//		System.out.println("-------print list after addFirst 6------------");
//		for (int i = 0; i < s1.size(); i++)
//			System.out.println(s1.get(i));

		// System.out.println(s1.removeAll());
		System.out.println(s1.size());

		int[] add = { 4, 6, 4, 3, 1, 4, 4, 4 };
		System.out.println(s1.addAll(add));
		System.out.println("-------print list after addAll------------");
		System.out.println(s1.size());
		for (int i = 0; i < s1.size(); i++)
			System.out.println(s1.get(i));

		int[] remove = {4,3};
		System.out.println(s1.removeAll(remove));
		System.out.println(s1.size());
		System.out.println("-------print list after removeAll------------");
		for (int i = 0; i < s1.size(); i++)
			System.out.println(s1.get(i));
		
		System.out.println(s1.removeAll(1));
		System.out.println(s1.size());
		System.out.println("-------print list after removeAll------------");
		for (int i = 0; i < s1.size(); i++)
			System.out.println(s1.get(i));
	}

}
