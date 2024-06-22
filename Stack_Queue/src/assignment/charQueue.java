package assignment;

public class charQueue {
	private int front,rear;
	private char arr[];
	public charQueue() {
		front=rear=-1;
		arr= new char [10];
	}
	public charQueue(int a) {
		front=rear=-1;
		arr= new char [a];
	}
	public boolean isFull() {
		return (rear==arr.length-1)? true:false;
	}
	public boolean isEmpty() {
		return ((front== -1)||(front==rear+1))? true:false;
	}
	
	public void insert(char a) {
		if (isFull()) {
			System.out.println("Queue is full..!!");
			return;
		}
		if(front==-1)front++;
		
		rear++;
		arr[rear]=a;
		return;
	}
	
	public char remove() {
		char d = '@';  //arbitrary constant
		if(isEmpty()) {
			System.out.println("Queue is Empty...!!!");
			return d;
		}
	//	d = arr[front];
	//	front++;
		d= arr[front++];
		return d;		
	}
	
	public char peek() {
		char d = '@';  //arbitrary constant
		if(isEmpty()) {
			System.out.println("Queue is Empty...!!!");
			return d;
		}
		d = arr[front];
		return d;	
	}
}
