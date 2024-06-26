package day_3_LinkedList;

import java.util.Scanner;

import day_2_Queue.IntListNode;

public class LinkedList {
	private IntListNode head;

	public LinkedList() {
		head = null;
	}

	public IntListNode getHead() {
		return head;
	}

	public void setHead(IntListNode head) {
		this.head = head;
	}

	public void insertFirst(int d) {
		IntListNode new_node = new IntListNode(d);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;
		return;
	}

	public void insert_last(int d) {
		IntListNode new_node = new IntListNode(d);
		if (head == null) {
			head = new_node;
			return;
		}
		IntListNode iter = head;

		while (iter.getNext() != null)
			iter = iter.getNext();

		iter.setNext(new_node);
		return;
	}

	public void insert_by_pos(int d, int pos) {
		IntListNode new_node = new IntListNode(d);
		if (head == null) {
			head = new_node;
			return;
		}
		if (pos == 1) {
			// insertFirst(d)
			new_node.setNext(head);
			head = new_node;
			return;
		}
		int i;
		IntListNode iter = head;
		for (i = 1; i < pos - 1 && iter.getNext() != null; i++) {
			iter = iter.getNext();
		}

		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public int deleteFirst() {
		int d = -999;
		@SuppressWarnings("unused")
		IntListNode deleteable;
		if (head == null)
			return d;
		if (head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}
		deleteable = head;
		d = head.getData();
		head = head.getNext();
		deleteable = null;
		return d;

	}

	public int deleteLast() {
		int d = -999;

		IntListNode deleteable;

		if (head == null)
			return d;

		if (head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}

		IntListNode iter = head;

		while (iter.getNext().getNext() != null)
			iter = iter.getNext();

		deleteable = iter.getNext();
		d = deleteable.getData();
		iter.setNext(null);
		deleteable = null;
		return d;
	}

	public int delete_by_pos(int pos) {
		int d = -999;

		IntListNode deleteable;

		if (head == null)
			return d;

		if (pos == 1) {
			d = head.getData();
			deleteable = head;
			head = head.getNext();
			deleteable = null;
		}

		IntListNode iter = head;

		for (int i = 1; (i < pos - 1) && (iter.getNext() != null); i++)
			iter = iter.getNext();

		if (iter.getNext() != null) {
			deleteable = iter.getNext();
			d = deleteable.getData();
			iter.setNext(iter.getNext().getNext());
			deleteable = null;
		} else
			System.out.println("invalid Position");

		return d;
	}

	public void insert_before(int d, int before) {

		IntListNode new_node = new IntListNode(d);
		if (head == null)
			return;

		if (head.getData() == before) {
			new_node.setNext(head);
			head = new_node;
			return;
		}

		IntListNode iter = head;

		while ((iter.getNext() != null) && (iter.getNext().getData() != before)) {
			iter = iter.getNext();
		}

		if (iter.getNext() != null) {
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
		}
		return;
	}

	public void insert_After(int d, int after) {
		if (head == null) {
			insertFirst(d);
			return;
		}
		IntListNode new_node = new IntListNode(d);	
		IntListNode iter = head;
		if (iter.getData() == after) {
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			return;
		}
		while ((iter.getNext() != null) && (iter.getData() != after)) 
			iter = iter.getNext();
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public void insert_sorted(int d) {
		IntListNode new_node = new IntListNode(d);

		if ((head == null) || (d < head.getData())) {
			new_node.setNext(head);
			head = new_node;
			return;
		}
		IntListNode iter = head;

		while ((iter.getNext() != null) && (d > iter.getNext().getData()))
			iter = iter.getNext();

		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public int count() {
		int cnt = 0;
		IntListNode iter = head;
		if (head == null)
			return 0;

		while (iter != null) {
			cnt++;
			iter = iter.getNext();
		}
		return cnt;
	}

	public void display_alternativeNode() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		IntListNode iter = head;
		System.out.print( "Alternate List ");
		while (iter != null) {
			System.out.print(" -> "+iter.getData());
			if (iter.getNext() != null)
				iter = iter.getNext().getNext();
			else
				iter = iter.getNext();
		}
		System.out.println();
	}

	public String toString() {
		String str = new String(" ");
		if (head == null)
			return "List is empty..!!";

		IntListNode itr = head;
		str = "\n List : ";
		while (itr != null) {
			str = str + " -> " + itr.getData();
			itr = itr.getNext();
		}
		return str;
	}
	
	public static LinkedList concateToThirdList(LinkedList list1, LinkedList list2){
		LinkedList list3 = new LinkedList();
		IntListNode iter = list1.getHead();
		IntListNode iter2 = list2.getHead();
		
		while(iter.getNext()!=null) {
			list3.insert_last(iter.getData());
			iter=iter.getNext();
		}
		list3.insert_last(iter.getData());
		while(iter2.getNext()!=null) {
			list3.insert_last(iter2.getData());
			iter2=iter2.getNext();
		}
		list3.insert_last(iter2.getData());
		return list3;		
	}
	
	public void deleteList() {
		head=null;
		return;
	}

	public void concate(LinkedList list2) {
		IntListNode iter = head;
		while(iter.getNext()!=null)
			iter=iter.getNext();
		
		//System.out.println(iter.getNext());
		iter.setNext(list2.getHead());
		return;
	}

	public void reverseList() {
		IntListNode prev,next,iter;
		iter = head;
		prev= null;
		
		while(iter != null) {
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter;
			iter = next;
		}
		head= prev;
	}
	
	public void createList (int n) {
   	 int data;
   	 Scanner s = new Scanner(System.in);
   	 for(int i=1;i<=n;i++) {
   		 System.out.print("Enter value :");
   		 data= s.nextInt();
   		 this.insert_last(data);
   	 }
    }
	
	public static IntListNode reverse(IntListNode state)
	{
		IntListNode temp;
		if(state.getNext()==null) return state;
		
		temp=reverse( state.getNext());
		state.getNext().setNext(state);
		state.setNext(null);
		
		return temp;
	}

	
	public void findMiddle() { // tortoise and hare method  
		IntListNode slow,fast;
		slow=fast=head;
		// time complexity is O(n/2)
		while((fast!=null)&&(fast.getNext()!= null)) {
			slow = slow.getNext();
			fast= fast.getNext().getNext();
		}
		System.out.println("Middle element is : "+ slow.getData());
	}
}
