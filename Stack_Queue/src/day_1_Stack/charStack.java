package day_1_Stack;

public class charStack {
	private int top;
	private char arr[];
	
	public charStack(int size) {
		top = -1;
		arr = new char[size] ;
	}
	public charStack() {
		top = -1;
		arr = new char[10];
	}
	
	// is Empty  isFull pop push peek
	public boolean isEmpty() {
		return (top==-1)? true: false;
	}
	public boolean isFull() {
		return (top==arr.length-1)? true: false;
	}
	
	public void push(char a) {
		if(isFull()) {
			System.out.println("\n Stack overflow...");
			return;
		}else {
			top++;
			arr[top]=a;
			return;
		}
	}
	
	public char pop() {
		char d='#';        
		if(isEmpty()) {
			return d;
		}else {
			d=arr[top];
			top--;
			return d;
		}
	}
	
	public char peek() {
		char d='#';
		if(isEmpty()) {
			return d;
		}else {
			d= arr[top];
			return d;
		}
	}
	
}
