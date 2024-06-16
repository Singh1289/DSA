package day_6_Tree;

public class BTQueueLL {
	private BTListNode front,rear;
	
	public BTQueueLL() {
		front=rear=null;
	}
	 
	public boolean isEmpty() {
		return (front==null)?true:false;
	}
	
	public void enQueue(BTNode d) {
		BTListNode new_node= new BTListNode(d);
		if(front==null) {
			front=rear=new_node;
			return;
		}
		rear.setNext(new_node);	
		rear=new_node;
		return;
	}
	
	public BTNode deQueue() {
		BTNode d= null;
		if(front==null) return d;
		BTListNode temp=front.getNext();
		d= front.getData();
		front.setNext(null);
		front=temp;
		return d;
	}
}
