package day_3;

import day_2.IntListNode;

public class LinkedList {
	private IntListNode head;

	public LinkedList() {
		head = null;
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

		for (int i = 1; i < pos - 1 && iter.getNext() != null; i++)
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
		
		while ((iter.getNext() != null) && (iter.getNext().getData() != after)) {
			iter = iter.getNext();
		}
		
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

		while ((iter.getNext() != null) && (d > iter.getNext().getData())) {
			iter = iter.getNext();
		}

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

}
