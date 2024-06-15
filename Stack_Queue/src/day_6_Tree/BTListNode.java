package day_6_Tree;

public class BTListNode {
	private BTNode data;
	private BTListNode next;
	public BTListNode() {
		data=null;
		next=null;
	}
	public BTListNode(BTNode d) {
		data =d;
		next = null;
	}
	public BTNode getData() {
		return data;
	}
	public void setData(BTNode data) {
		this.data = data;
	}
	public BTListNode getNext() {
		return next;
	}
	public void setNext(BTListNode next) {
		this.next = next;
	}
		
}
