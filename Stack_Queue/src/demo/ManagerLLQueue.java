package StackLinkedList;

public class ManagerLLQueue {
	
	private ManagerNode top;

	public ManagerLLQueue() {
		
		top = null;
	}

	public ManagerNode getTop() {
		return top;
	}

	public void setTop(ManagerNode top) {
		this.top = top;
	}
	
	public void push(Manager m)
	{
		ManagerNode new_node=new ManagerNode(m);
		if(top==null)
		{
			top=new_node;
			return;
		}
		ManagerNode iter=top;
		while(iter.getNext()!=null)
			iter=iter.getNext();
		
		iter.setNext(new_node);
		return;
	}
	
	public Manager pop()
	{
		Manager d=null;
		if(top==null)
		{
			return d;
		}
		ManagerNode deletable=top;
		d=deletable.getData();
		top=deletable.getNext();
		deletable.setNext(null);
		deletable=null;
		return d;
		
	}
	
	public Manager peek()
	{
		if(top==null)
		{
			return null;
		}
		return top.getData();
	}
	
	public void display()
	{
		ManagerNode iter=top;
		while(iter!=null)
		{
			System.out.println(iter.getData());
			iter=iter.getNext();
			
		}
		return;
	}
	

}
