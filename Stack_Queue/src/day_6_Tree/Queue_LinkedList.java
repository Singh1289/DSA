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
	public boolean isEmpty() {
		return (front==null)?true:false;
	}

	public void add(int a) {
		IntListNode new_node= new IntListNode(a);
		if(front==null) {
			front= rear=new_node;
			return;
		}
		rear.setNext(new_node);
		rear= new_node;
		return;
	}

	
	public int remove() {
		int d= -999;
		if(isEmpty())return d;
		d= front.getData();
		front= front.getNext();
		return d;
	}

	public int peek() {
		int d= -999;
		if(isEmpty())return d;
		d= front.getData();	
		return d;
	}

	
	
}
