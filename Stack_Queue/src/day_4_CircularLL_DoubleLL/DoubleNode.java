package day_4_CircularLL_DoubleLL;

public class DoubleNode {
	private int data;
	private DoubleNode prev,next;
	public DoubleNode() {
		data=0;
		prev=next=null;
	}
	public DoubleNode(int d) {
		data=d;
		prev=next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoubleNode getPrev() {
		return prev;
	}
	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}
	public DoubleNode getNext() {
		return next;
	}
	public void setNext(DoubleNode next) {
		this.next = next;
	}
	
}
