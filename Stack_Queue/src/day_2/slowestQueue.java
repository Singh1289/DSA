package day_2;

public class slowestQueue {
	private int front,rear;
	private int arr[];
	public slowestQueue() {
		front=rear=-1;
		arr= new int [10];
	}
	public slowestQueue(int a) {
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
			if(front==0) {
			System.out.println("Queue is full..!!");
			return;
			}			
		}
		if(front==-1)front++;
		
		rear++;
		arr[rear]=a;
		return;
	}
	
	private void shiftArray() {
		int i,j=0,d=front;
		for(i=front;i<=rear;i++) {
			arr[j]=arr[i];
			j++;
		}
		for(i=d;i>0;i--) {
			front--;
			rear--;
		}
		
	}
	public int remove() {
		int d = -999;  //arbitrary constant
		if(isEmpty()) {
			System.out.println("Queue is Empty...!!!");
			return d;
		}
		d= arr[front++];
		shiftArray();
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
	public void printArray() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
