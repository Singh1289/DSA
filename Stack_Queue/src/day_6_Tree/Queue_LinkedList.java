package day_6_Tree;

import day_2_Queue.IntListNode;

public class Queue_LinkedList {
	IntListNode front, rear;
	

	public Queue_LinkedList() {
		front=rear=null;
	}

	public IntListNode getFront() {
		return front;
	}

	public void setFront(IntListNode front) {
		this.front = front;
	}

	public IntListNode getRear() {
		return rear;
	}

	public void setRear(IntListNode rear) {
		this.rear = rear;
	}

	public void add(int a) {
		insert_last(a);
	}

	private void insert_last(int a) {
		
		
	}
	public int remove() {
		return delete_first();
	}

	private int delete_first() {
		
		return 0;
	}
	
}
