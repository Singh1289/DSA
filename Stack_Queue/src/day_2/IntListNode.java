package day_2;

public class IntListNode {
	private int data;
	private IntListNode next;  // reference variable
	public IntListNode() {
		data=0;
		next = null;
	}
	public IntListNode(int d) {
		data=d;
		next= null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public IntListNode getNext() {
		return next;
	}
	public void setNext(IntListNode next) {
		this.next = next;
	}
		
}
