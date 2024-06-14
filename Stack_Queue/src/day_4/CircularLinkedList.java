package day_4;

import java.util.Scanner;

import day_2.IntListNode;

public class CircularLinkedList {
	private IntListNode last;

	public IntListNode getLast() {
		return last;
	}

	public void setLast(IntListNode last) {
		this.last = last;
	}

	public CircularLinkedList() {
		last = null;
	}

	public void insert_first(int d) {
		IntListNode new_node = new IntListNode(d);
		if (last == null) {
			last = new_node;
			last.setNext(last); // self referencing
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}

	// It only work in forward direction only so last node will have address of
	// first node
	public void insert_last(int d) {
		IntListNode new_node = new IntListNode(d);
		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last = new_node;
		return;
	}

	public static IntListNode reverse(IntListNode state, IntListNode last) {
		IntListNode temp, carry;
		if (state.getNext() == last)
			return state;

		temp = reverse(state.getNext(), last);
		carry = state.getNext().getNext();
		state.getNext().setNext(state);
		state.setNext(carry);
		if (state == last) {
			state.setNext(temp);
			return last;
		} else {
			state.setNext(carry);
			return temp;
		}
	}

	public void createList(int n) {
		int data;
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter value :");
			data = s.nextInt();
			this.insert_last(data);
		}
	}

	public void display() {
		if (last == null) {
			System.out.println("List is Empty");
			return;
		}
		IntListNode iter = last.getNext();
		System.out.print(" List");
		do {
			System.out.print(" -> " + iter.getData());
			iter = iter.getNext();
		} while (iter != last.getNext());
		System.out.println();
		return;
	}

	public int delete_first() {
		int d = -999;
		if (last == null) {
			return d;
		}
		if (last.getNext() == last) {
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}
		IntListNode deletable = last.getNext();
		d = deletable.getData();
		last.setNext(deletable.getNext());
		deletable.setNext(null);
		deletable = null;
		return d;
	}

	public void insert_by_pos(int d, int pos) {
		IntListNode new_node = new IntListNode(d);
		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}
		if (pos == 1) {
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			return;
		}
		IntListNode iter = last.getNext();
		int i = 1;
		do {
			if(i<pos-1) {
				iter=iter.getNext();
				i++;
			}else {
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);

				if (iter == last) 
					last = new_node;
				return;
			}
		} while (iter != last.getNext());

		System.out.println("Invalid position..!!");
		return;
	}
	
	public int delete_last() {
		int d = -999;
		if(last==null)return d;
		
		if(last.getNext()==last) {
			d=last.getData();
			last.setNext(null);
			last=null;
		}
		IntListNode deleteable = last.getNext();
		
		while(deleteable.getNext()!= last)
			deleteable=deleteable.getNext();
		
		deleteable.setNext(last.getNext());
		d= last.getData();
		last=deleteable;
		deleteable=deleteable.getNext();
		deleteable=null;
		return d;
	}
	
	public int delete_by_pos(int pos) {
		int d= -999;
		IntListNode deleteable = last.getNext();
		IntListNode temp;
		if(last==null)return d;
		if(pos==1) {
			d= deleteable.getData();
			last.setNext(deleteable.getNext());
			return d;
		}	
		int i = 1;
		do {
			if(i<pos-1) {
				deleteable=deleteable.getNext();
				i++;
			}else {
				d= deleteable.getNext().getData();
				temp=deleteable.getNext().getNext();
				deleteable.getNext().setNext(null);
				deleteable.setNext(temp);

				return d;
			}
		} while (deleteable != last.getNext());
		
		System.out.println("Position out of bound.");
		return d;
	}
}
