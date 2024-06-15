package day_2_Queue;

public class MyQueue {
	private int front,rear;
	private int arr[];
	public MyQueue() {
		front=rear=-1;
		arr= new int [10];
	}
	public MyQueue(int a) {
		front=rear=-1;
		arr= new int [a];
	}
	public boolean isFull() {
		return (rear==arr.length-1)? true:false;
	}
	public boolean isEmpty() {
		return ((front== -1)||(front==rear+1))? true:false;
	}
	
	public void insert(int a) {
		if (isFull()) {
			System.out.println("Queue is full..!!");
			return;
		}
		if(front==-1)front++;
		
		rear++;
		arr[rear]=a;
		return;
	}
	
	public int remove() {
		int d = -999;  //arbitrary constant
		if(isEmpty()) {
			System.out.println("Queue is Empty...!!!");
			return d;
		}
	//	d = arr[front];
	//	front++;
		d= arr[front++];
		return d;		
	}
	
	public int peek() {
		int d = -999;  //arbitrary constant
		if(isEmpty()) {
			System.out.println("Queue is Empty...!!!");
			return d;
		}
		d = arr[front];
		return d;	
	}
	
}
