package assignment;

import java.util.Scanner;

import day_2_Queue.IntListNode;
import day_2_Queue.MyQueue;
import day_6_Tree.Queue_LinkedList;

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
		for (int i = 1; i <= woh; i++) {
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
		IntListNode slow, fast;
		slow = fast = head;
		// time complexity is O(n/2)
		while ((fast != null) && (fast.getNext() != null)) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		System.out.println("Middle element is : " + slow.getData());
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
		IntListNode prev, next, iter;
		iter = head;
		prev = null;

		while (iter != null) {
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter;
			iter = next;
		}
		head = prev;
	}

	public static IntListNode reverse(IntListNode state) {
		IntListNode temp;
		if (state.getNext() == null)
			return state;

		temp = reverse(state.getNext());
		state.getNext().setNext(state);
		state.setNext(null);

		return temp;
	}

	public void display_alternativeNode() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		IntListNode iter = head;
		System.out.print("Alternate List ");
		while (iter != null) {
			System.out.print(" -> " + iter.getData());
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
		if (iter == null)
			return;

		displayReverseRec(iter.getNext());
		System.out.println(" -> " + iter.getData());
	}

	public void deleteAlternate() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		IntListNode iter = head;
		System.out.print("Alternate deleted value ");
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
		temp = null;
		return ;
	}

	public IntListNode split(int d) {
		if (head == null) {
			System.out.println("List Empty");
			return null;
		}
		if (head.getData() == d) {
			System.out.println("there is only one node.. can't split");
			return null;
		}

		IntListNode iter = head;
		while ((iter.getNext() != null) && (iter.getNext().getData() != d))
			iter = iter.getNext();

		IntListNode temp = iter.getNext();
		iter.setNext(null);
		return temp;
	}

	public static Int_linkedlist mergeSorted(Int_linkedlist list1, Int_linkedlist list2) {
		Int_linkedlist ll = new Int_linkedlist();
		IntListNode itr1 = list1.getHead();
		IntListNode itr2 = list2.getHead();

												// no duplicates in sorted array (merge sort)
		
		while (itr1 != null && itr2 != null) {
			if (itr1.getData() < itr2.getData()) {

				ll.insert_last(itr1.getData());
				itr1 = itr1.getNext();
			} else if (itr1.getData() > itr2.getData()) {
				ll.insert_last(itr2.getData());
				itr2 = itr2.getNext();
			} else {
				ll.insert_last(itr2.getData());
				itr2 = itr2.getNext();
				itr1 = itr1.getNext();
			}
		}
		while (itr1 != null) {
			ll.insert_last(itr1.getData());
			itr1 = itr1.getNext();
		}
		while (itr2 != null) {
			ll.insert_last(itr2.getData());
			itr2 = itr2.getNext();
		}
		return ll;
	}

	public void evenOdd() {
		Int_linkedlist temp = new Int_linkedlist();
		IntListNode iter = head;
		while (iter != null) {
			if ((iter.getData() % 2) == 0) {
				temp.insert_last(iter.getData());
			}
			iter = iter.getNext();
		}
		iter = head;
		while (iter != null) {
			if ((iter.getData() % 2) != 0) {
				temp.insert_last(iter.getData());
			}
			iter = iter.getNext();
		}

		head = temp.getHead();
		temp = null;
		return;
	}

	public void evenOdd2() {
		IntListNode iter = head;
		MyQueue qq = new MyQueue(20);
		while (iter != null) {
			if (iter.getData() % 2 == 0) {
				qq.insert(iter.getData());
			}
			iter = iter.getNext();
		}
		iter = head;
		while (iter != null) {
			if (iter.getData() % 2 != 0) {
				qq.insert(iter.getData());
			}
			iter = iter.getNext();
		}
		// updating list
		iter = head;
		while (iter != null) {
			iter.setData(qq.remove());
			iter = iter.getNext();
		}
		return;
	}

	public Int_linkedlist evenOdd3() {
		IntListNode iter = head;
		Int_linkedlist ll = new Int_linkedlist();
		while(iter!=null) {
			if(iter.getData() % 2== 0) {
				ll.insertFirst(iter.getData());
				iter = iter.getNext();
			}else {
				ll.insert_last(iter.getData());
				iter = iter.getNext();
			}
		}		
		return ll;
	} 


	public void swapAdjacent() {
		if (head == null) {
			System.out.println("list is empty..!!");
		}
		IntListNode iter = head;
		int temp;

		while (iter != null) {
			if (iter.getNext() != null && iter.getNext().getNext() != null) {
				temp = iter.getData();
				iter.setData(iter.getNext().getData());
				iter.getNext().setData(temp);
			}
			if (iter.getNext() != null)
				iter = iter.getNext().getNext();
			else
				iter = iter.getNext();
		}
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
	
	public static void bubbleSort(Int_linkedlist ll) {
		int count, temp, flag;
		IntListNode iter = ll.getHead();
		count = ll.count();
		
		for(int i=1;i<=count;i++) {
			flag=0;
			iter = ll.getHead();
			while(iter!= null && iter.getNext() != null) {
				if(iter.getData()> iter.getNext().getData()) {
					temp= iter.getData();
					iter.setData(iter.getNext().getData());
					iter.getNext().setData(temp);
					flag=1;
				}
				iter= iter.getNext();
			}
		//	System.out.println("~~~~~~~~~~~~~~");
		//	System.out.println(ll);
			if(flag==0)
				break;
		}
	}



	//  
	public static void insertionSort(Int_linkedlist ll) {
		int count, temp;
		IntListNode iter,tt,tt2;
		count = ll.count();
		tt2=ll.getHead();
		for(int i=1;i<=count;i++) {
			iter = ll.getHead();
			tt = tt2;
			while(iter!=null && iter.getNext()!= null) {
				if(tt.getData()<iter.getData()) {
					temp= iter.getData();
					iter.setData(tt.getData());
					tt.setData(temp);
				}
				iter= iter.getNext();
			}
		//	System.out.println("~~~~~~~~~~~~~~");
		//	System.out.println(ll);
			tt2=tt.getNext();
		}
	}

	// selection sort
	public static void selectionSort(Int_linkedlist ll) {
		int temp;
		IntListNode iter,min,iter2,tt2;
		iter2= ll.getHead();

		while(iter2!=null) {
			min=tt2= iter = iter2;
			 
			while(iter!=null ) {
				if(min.getData()>iter.getData()) 					
					min=iter; 
					
				iter= iter.getNext();
			}
			if(tt2!=min) {
				temp= min.getData();
				min.setData(tt2.getData());
				tt2.setData(temp);
			}
		//	System.out.println("~~~~~~~~~~~~~~");
		//	System.out.println(ll);
			iter2=iter2.getNext();
		}
	}


	public static Int_linkedlist list_to_digit(Int_linkedlist ll,Int_linkedlist ll2) {
		Int_linkedlist list = new Int_linkedlist();
		int temp, temp2;
		temp=temp2=0;
		IntListNode iter= ll.getHead();
		while(iter!= null) {
			temp=(temp*10)+iter.getData();
			iter=iter.getNext();
		}
		System.out.println("list1 = "+temp);
		iter=ll2.getHead();
		while(iter!= null) {
			temp2=(temp2*10)+iter.getData();
			iter=iter.getNext();
		}
		System.out.println("list1 = "+temp2);
		
		temp=temp+temp2;
		
		while(temp!=0) {
			list.insertFirst(temp%10);
			temp=temp/10;
		}
		
		return list;
	}
	
	
	public void bringAlternateToFront() {
		IntListNode iter= head;
		int flag=0;
		Queue_LinkedList alter=new Queue_LinkedList();
		Queue_LinkedList qq=new Queue_LinkedList();
		while(iter !=null) {
			if(flag==0) {
				alter.add(iter.getData());
				flag=1;
			}else {
				qq.add(iter.getData());
				flag=0;
			}
			iter=iter.getNext();
		}
		iter=head;
		while(iter !=null) {
			if(!alter.isEmpty()) {
				iter.setData(alter.remove());
				iter=iter.getNext();
			}
			else {
				iter.setData(qq.remove());
				iter=iter.getNext();
			}
		}
	}

}
