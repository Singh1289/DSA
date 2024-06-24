package StackLinkedList;



public class ManagerCircularLL {
	
	private ManagerNode last;

	public ManagerCircularLL() {
		
		last = null;
	}

	public ManagerNode getlast() {
		return last;
	}

	public void setlast(ManagerNode last) {
		this.last = last;
	}
/*	
	public void insert_First(Manager m)
	{
		ManagerNode new_node=new ManagerNode(m);
		if(last==null)
		{
			last=new_node;
			last.setNext(new_node);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}
	
	public void insert_Last(Manager m)
	{
		ManagerNode new_node=new ManagerNode(m);
		if(last==null)
		{
			last=new_node;
			last.setNext(new_node);
			return;
		}
		
		new_node.setNext(last);
		last.setNext(new_node);
		last=new_node;
		return;
	}
*/
	public void insert_first(Manager d) {
		ManagerNode new_node = new ManagerNode(d);
		if (last == null) {
			last = new_node;
			last.setNext(last); // self referencing
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}

	// It only work in forward direction only so last node will have address of
	// first node
	public void insert_last(Manager d) {
		ManagerNode new_node = new ManagerNode(d);
		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last = new_node;
		return;
	}

	
	public Manager delete_byid(int id)
	{
		Manager d=null;
		if(last==null)
		{
			return d;
		}
		if(last.getData().getManager_id() == id)
		{
			d=last.getData();
			last.setNext(null);
			last=null;
			return d;
		}
		ManagerNode deletable=last.getNext();
		while(deletable.getNext().getNext()!=last.getNext())
		{
			if(deletable.getNext().getData().getManager_id()==id)
			{
				d=deletable.getNext().getData();
				ManagerNode temp=deletable.getNext().getNext();
				deletable.getNext().setNext(null);
				deletable.setNext(temp);
				deletable=temp=null;
				return d;
			}
			deletable=deletable.getNext();
		}
			
		
		return d;
		
	}
	
	public void display() {
		ManagerNode iter= last.getNext();
		do {
			System.out.println(iter.getData());
			iter=iter.getNext();
		}while(iter!= last.getNext());
	}
	
	public String toString()
	{
		if(last==null)
			return "empty..";
		
		ManagerNode iter=last.getNext();
		String str="";
		do {
			str=str+ "\n"+iter.getNext().getData().toString();
			iter=iter.getNext();
			
		}while(iter!=last.getNext());
		
		return str;
		
	}

}
