package assignment;

public class ProListNode {
	Product pro;
	ProListNode next;
	
	public ProListNode() {
		pro= null;
		next=null;
	}
	public ProListNode(Product p) {
		pro = p;
		next = null;
	}
	public Product getPro() {
		return pro;
	}
	public void setPro(Product pro) {
		this.pro = pro;
	}
	public ProListNode getNext() {
		return next;
	}
	public void setNext(ProListNode next) {
		this.next = next;
	}	
}
