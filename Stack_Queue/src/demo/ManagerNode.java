package StackLinkedList;

public class ManagerNode {
	
	private Manager data;
	private ManagerNode next;
	
	
	public ManagerNode() {
		data=null;
		next=null;
	}


	public ManagerNode(Manager data) {
		super();
		this.data = data;
		next = null;
	}


	public Manager getData() {
		return data;
	}


	public void setData(Manager data) {
		this.data = data;
	}


	public ManagerNode getNext() {
		return next;
	}


	public void setNext(ManagerNode next) {
		this.next = next;
	}
	
	
	
	
	
	
	
	

}
