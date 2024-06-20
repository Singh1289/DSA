package assignment;

import java.util.Scanner;

import day_2_Queue.IntListNode;

public class Int_linkedlist {
	private IntListNode head;

	public Int_linkedlist() {
		head = null;
	}

	public IntListNode getHead() {
		return head;
	}

	public void setHead(IntListNode head) {
		this.head = head;
	}
	
	public void insertMany(int woh) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=woh;i++) {
			System.out.print("Enter value : ");
			int a = sc.nextInt();
			insert_last(a);
		}
		
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
	
	public void display_reverse() {
		displayReverseRec(head);
	}
	
	private void displayReverseRec(IntListNode iter) {
		if(iter==null)return;
		
		displayReverseRec(iter.getNext());
		System.out.println(" -> "+iter.getData());		
	}

	public void deleteAlternate() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		IntListNode iter = head;
		System.out.print( "Alternate deleted value ");
		while (iter != null) {
			deleteByAddress(iter);
			if (iter.getNext() != null)
				iter = iter.getNext().getNext();
			else
				iter = iter.getNext();
		}
		System.out.println();
	}
	
	private void deleteByAddress(IntListNode del) {
			
		IntListNode temp= del.getNext().getNext();
		del.setData(del.getNext().getData());
		del.getNext().setNext(null);
		del.setNext(temp);		
		return ;
	}
	
	public IntListNode split(int d) {
		if (head == null) {
			System.out.println("List Empty");
			return null;
		}
		if(head.getData()==d) {
			System.out.println("there is only one node.. can't split");
			return null;
		}
		
		IntListNode iter = head;
		while ((iter.getNext() != null) && (iter.getNext().getData() != d)) 
			iter = iter.getNext();
		
		IntListNode temp= iter.getNext();
		iter.setNext(null);
		return temp;
	}

	public static Int_linkedlist mergeSorted(Int_linkedlist list1,Int_linkedlist list2) {
		Int_linkedlist ll = new Int_linkedlist();
		IntListNode itr1= list1.getHead();
		IntListNode itr2 = list2.getHead();
		
		while(itr1!=null && itr2!= null) {
			if(itr1.getData() < itr2.getData()) {
				ll.insert_last(itr1.getData());
				itr1=itr1.getNext();
			}else if( itr1.getData() > itr2.getData()) {
				ll.insert_last(itr2.getData());
				itr2=itr2.getNext(); 
			}else{
				ll.insert_last(itr2.getData());
				itr2=itr2.getNext();
				itr1=itr1.getNext();
			}
		}
		while(itr1!=null) {
			ll.insert_last(itr1.getData());
			itr1=itr1.getNext();
		}
		while(itr2!=null) {
			ll.insert_last(itr2.getData());
			itr2=itr2.getNext();
		}
		return ll;
	}
	
	public void evenOdd() {
		Int_linkedlist temp= new Int_linkedlist();
		IntListNode iter= head;
		while(iter!=null) {
			if((iter.getData() % 2)==0) {
				temp.insert_last(iter.getData());				
			}
			iter = iter.getNext();
		}
		iter= head;
		while(iter!=null) {
			if((iter.getData() % 2)!=0) {
				temp.insert_last(iter.getData());			
			}
			iter = iter.getNext();
		}
		
		head = temp.getHead();
		temp=null;
		return;
	}
	
	
	
}
