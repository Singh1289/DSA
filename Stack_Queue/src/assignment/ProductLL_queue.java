package assignment;

public class ProductLL_queue {
	private ProListNode top;

	public ProductLL_queue(ProListNode top) {
		this.top = top;
	}

	public ProListNode getTop() {
		return top;
	}

	public void setTop(ProListNode top) {
		this.top = top;
	}
	
	public void enQueue(Product p) {
		ProListNode new_node= new ProListNode(p);
		if(top==null) {
			top = new_node;
			return;
		}
		
		ProListNode iter = top;
		while(iter!=null) {
			iter= iter.getNext();
		}
		iter.setNext(new_node);
		return;
	}
	
	public Product deQueue() {
		Product temp= null;
		if(top==null)return temp;
		
		if(top.getNext()==null) {
			temp= top.getPro();
			top=null;
			return temp;
		}
		ProListNode del = top;
		ProListNode tt;
		temp = del.getPro();
		tt= del.getNext();
		del.setNext(null);
		top= tt;
		del=tt=null;	
		
		return temp;
	}
	
	
	
}
