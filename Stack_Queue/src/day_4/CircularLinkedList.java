package day_4;

import day_2.IntListNode;

public class CircularLinkedList {
	private IntListNode last;

	public CircularLinkedList() {
		last = null;
	}
	public void insert_first(int d) {
		IntListNode new_node = new IntListNode(d);
		if(last==null) {
			last= new_node;
			last.setNext(last);   // self referencing
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}
	
	public void insert_last(int d) {
		IntListNode new_node = new IntListNode(d);
		if(last==null) {
			last= new_node;
			last.setNext(last);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last= new_node;
		return;
	}
	
	public void display() {
		IntListNode iter = last.getNext();
		System.out.print(" List");
		do {
			System.out.print(" -> "+iter.getData());
			iter = iter.getNext();
		}while(iter!= last.getNext());
		return;
	}
	
}
