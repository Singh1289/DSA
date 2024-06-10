package day_1;

public class intStack {
	private int top;
	private int arr[];
	
	public intStack(int size) {
		top = -1;
		arr = new int[size] ;
	}
	public intStack() {
		top = -1;
		arr = new int[10];
	}
	
	// is Empty  isFull pop push peek
	public boolean isEmpty() {
		return (top==-1)? true: false;
	}
	public boolean isFull() {
		return (top==arr.length-1)? true: false;
	}
	
	public void push(int a) {
		if(isFull()) {
			System.out.println("\n Stack overflow...");
			return;
		}else {
			top++;
			arr[top]=a;
			return;
		}
	}
	
	public int pop() {
		int d=-999;        // Arbitrary constant
		if(isEmpty()) {
			//System.out.println("\n Stack underflow...");
			return d;
		}else {
			d=arr[top];
			top--;
			//System.out.println("element popped..: "+ arr[top+1]);
			return d;
		}
	}
	
	public int peek() {
		int d=-999;
		if(isEmpty()) {
			//System.out.println("Stack is Empty...");
			return d;
		}else {
			d= arr[top];
			return d;
		}
	}
	
}
