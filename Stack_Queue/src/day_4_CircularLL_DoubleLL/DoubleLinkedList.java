package day_4_CircularLL_DoubleLL;

import java.util.Scanner;

public class DoubleLinkedList {
	private DoubleNode head;

	public DoubleLinkedList() {
		head=null;
	}

	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}
	
	// methods ~~~~~
	
	public void insert_first(int d) {
		DoubleNode new_node= new DoubleNode(d);
		if(head== null) {
			head= new_node;
			return;
		}
	// set new-node reference first always to avoid errors
		
		new_node.setNext(head);
		head.setPrev(new_node);
		head= new_node;	
		return;
	}
	
	public void insert_last(int d) {
		DoubleNode new_node = new DoubleNode(d);
		if(head==null) {
			head=new_node;
			return;
		}
		DoubleNode iter = head;
		while(iter.getNext()!= null) 
			iter= iter.getNext();
		
		new_node.setPrev(iter);
		iter.setNext(new_node);
		return;
	}
	
	public void insert_by_pos(int d,int pos) {
		DoubleNode new_node = new DoubleNode(d);
		if(head == null) {
			head= new_node;
			return;
		}
		if(pos==1) {
			head.setPrev(new_node);
			new_node.setNext(head);
			head= new_node;
			return;
		}
		
		DoubleNode iter = head;
		
		for(int i=1;i<pos-1 && iter.getNext()!= null; i++,iter=iter.getNext());
		
		new_node.setNext(iter.getNext());
		new_node.setPrev(iter);
		if(iter.getNext()!=null)
			iter.getNext().setPrev(new_node); // new_node.getNext().setPrev(new_node);
		
		iter.setNext(new_node);
	}
	
	public int delete_first() {
		int d=-999;
		if (head==null) {
			return d;
			
		}
	    d=head.getData();
	    DoubleNode deletable =head;
	    head = head.getNext();
	    
	    if(head != null)
	    	head.setPrev(null);
	    
	    deletable = null;
	    return d;
	
	}
	
     public int delete_last() {
    	 int d=-999;
 		if (head==null) {
 			return d;
 		}
 	// when only one node is present in the list then we need to make head null
 		
 		if(head.getPrev() != null) {
 			d= head.getData();
 			head=null;
 			return d; 
 		}
 		
 	    DoubleNode iter =head;
 	    while(iter.getNext()!=null)
 	    	iter = iter.getNext();
 	  
 	    
 	    if(iter.getPrev() != null)
 	    	iter.getPrev().setNext(null);
 	    
         d=iter.getData();
         iter=null;
 	  
 	    return d;
 	
     } // end of function
     
     public int delete_by_pos(int pos) {
    	 int d= -999;
    	 DoubleNode deletable = head;
    	 if(head == null) return d;
    	 
    	 if(head.getNext()== null) {
    		 d= head.getData();
    		 head= head.getNext();
    		 if(head!=null)
    			 head.setPrev(null);
    		 
    		 deletable= null;
    		 return d;
    	 }
    	 
    	 for(int i=1;i<pos;i++) {
    		 deletable= deletable.getNext();
    		 if(deletable==null) return d;
    	 }
    	 
    	 d= deletable.getData();
    	 deletable.getPrev().setNext(deletable.getNext());
    	  
    	 if(deletable.getNext()!=null) 
    		 deletable.getNext().setPrev(deletable.getPrev());
    	 
    	 deletable =null;
    	 return d;
     }
     
     public boolean addToEmpty(int d) {
    	 if(head == null)
    	 { this.insert_first(d);
    	 	return true;
    	 } 
    	 return false;
     }
     
     public void createList (int n) {
    	 int data;
    	 Scanner s = new Scanner(System.in);
    	 for(int i=1;i<=n;i++) {
    		 System.out.print("Enter value :");
    		 data= s.nextInt();
    		 this.insert_last(data);
    	 }
     }
     
     public String toString() {
 		String str = new String(" ");
 		if (head == null)
 			return "List is empty..!!";

 		DoubleNode iter = head;
 		str = "Double LinkedList : ";
 		while (iter != null) {
 			str = str + " -> " + iter.getData();
 			iter = iter.getNext();
 		}
 		return str;
 	}
}
