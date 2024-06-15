package day_6_Tree;

import day_2_Queue.IntListNode;

public class Stack_LinkedList {
	IntListNode top;

	public IntListNode getTop() {
		return top;
	}

	public void setTop(IntListNode top) {
		this.top = top;
	}
	
	public void push(int a) {
		insert_first(a);
	}

	private void insert_first(int a) {
		IntListNode new_node= new IntListNode(a);
		if(top==null) {
			top=new_node;
			return;
		}
		new_node.setNext(top);
		top=new_node;
		return;
	}
	
	public int pop() {
		return delete_first();
	}

	private int delete_first() {
		int d= -999;
		if(top==null)return d;
		
		IntListNode temp= top.getNext();
		d=top.getData();
		top.setNext(null);
		top=temp;
		return d;
	}

	public int peek() {
		int d= -999;
		if(top==null)return d;
		d= top.getData();
		return d;
	}
}
