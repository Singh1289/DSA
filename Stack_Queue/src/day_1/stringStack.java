package day_1;

public class stringStack {
	private int top;
	private String arr[];
	
	public stringStack(int size) {
		top = -1;
		arr = new String[size] ;
	}
	public stringStack() {
		top = -1;
		arr = new String[10];
	}
	
	// is Empty  isFull pop push peek
	public boolean isEmpty() {
		return (top==-1)? true: false;
	}
	public boolean isFull() {
		return (top==arr.length-1)? true: false;
	}
	
	public void push(String a) {
		if(isFull()) {
			System.out.println("\n Stack overflow...");
			return;
		}else {
			top++;
			arr[top]=a;
			return;
		}
	}
	
	public String pop() {
		String d= "#";        
		if(isEmpty()) {
			return d;
		}else {
			d=arr[top];
			top--;
			return d;
		}
	}
	
	public String peek() {
		String d="#";
		if(isEmpty()) {
			return d;
		}else {
			d= arr[top];
			return d;
		}
	}
	
}
