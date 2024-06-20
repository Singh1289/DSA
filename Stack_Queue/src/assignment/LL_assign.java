package assignment;

public class LL_assign {	
	private ProListNode head;

	public LL_assign() {
		head = null;
	}

	public ProListNode getHead() {
		return head;
	}

	public void setHead(ProListNode head) {
		this.head = head;
	}
	
	public void insert_first(Product p) {
		ProListNode new_node = new ProListNode(p);
		if(head==null) {
			head=new_node;
			return;
		}
		new_node.setNext(head);
		head=new_node;
		return;
	}
	
	public void insert_last(Product p) {
		ProListNode new_node = new ProListNode(p);
		if(head==null) {
			head=new_node;
			return;
		}
		ProListNode iter=head;
		while(iter.getNext()!=null) 
			iter=iter.getNext();
		
		iter.setNext(new_node);
		return;
	}
	
	public void insert_ByPos(Product p,int pos) {
		ProListNode new_node = new ProListNode(p);
		if(head==null) {
			System.out.println("Postion Invalid");
			return;
		}
		if (pos == 1) {
			new_node.setNext(head);
			head = new_node;
			return;
		}
		ProListNode iter=head;
		for(int i=1;i<pos-1 && iter.getNext()!=null;i++)
			iter= iter.getNext();
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}
	
	public void insert_before(Product p,int before) {
		
		if(head==null) {
			insert_first(p);
			return;
		}
		ProListNode new_node = new ProListNode(p);
		ProListNode iter=head;
		while((iter.getNext()!=null) && (iter.getNext().getPro().getPrice()!= before))
			iter= iter.getNext();
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}
	
	public void insert_after(Product p,int after) {
		
		if(head==null) {
			insert_first(p);
			return;
		}
		ProListNode new_node = new ProListNode(p);
		ProListNode iter=head;
		while((iter.getNext()!=null) && (iter.getPro().getPrice()!= after))
			iter= iter.getNext();
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}
	
	// delete
	public Product delete_first() {		
		Product temp= new Product();
		if(head==null)return temp;
		
		if(head.getNext()==null) {
			temp= head.getPro();
			head= null;
			return temp;
		}
		
		ProListNode deletable=head;
		temp= deletable.getPro();
		head=deletable.getNext();
		deletable.setNext(null);
		deletable=null;		
		return temp;		
	}
	
	public Product delete_last() {
		Product temp= new Product();
		if(head==null)return temp;
		
		if(head.getNext()==null) {
			temp= head.getPro();
			head= null;
			return temp;
		}
		
		ProListNode iter=head;
		while(iter.getNext().getNext()!=null) 
			iter=iter.getNext();
		
		temp= iter.getNext().getPro();
		iter.setNext(null);
		return temp;
	}
	
	public void display() {
		ProListNode iter=head;
		while(iter!=null) { 
			System.out.println(iter.getPro());
			iter=iter.getNext();
		}
	}

	public static LL_assign concate(LL_assign list, LL_assign list2) {
		LL_assign list_new=null;
		
		
		
		
		return list_new;
		
	}
	
	

}
