package day_2;

public class LinkedList {
	private IntListNode head;
	public LinkedList() {head = null;}
	
	public void insertFirst(int d) {
		IntListNode new_node = new IntListNode(d);
		if(head== null) {
			head= new_node;
			return;
		}
		new_node.setNext(head);
		head= new_node;
		return;
	}
	
	public String toString() {
		String str = new String (" ");
		if(head==null)
			return "List is empty..!!";
		
		IntListNode itr = head;
		str = "\n List : ";
		while(itr!= null) {
			str= str + " -> "+itr.getData();
			itr= itr.getNext();
		}
		return str;
	}
}
