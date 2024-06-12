package day_2;

public class SituationalSlowQueue {
	private int front,rear;
	private int arr[];
	public SituationalSlowQueue() {
		front=rear=-1;
		arr= new int [10];
	}
	public SituationalSlowQueue(int a) {
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
			}else {
				shiftArray();
			}			
		}
		if(front==-1)front++;
		
		rear++;
		arr[rear]=a;
		return;
	}
	
	private void shiftArray() {
		int i,j,d=front;
		for(i=d;i>=0;i--) {
			for(j=d+1;j<rear;j++) {
				arr[j-1]=arr[j];
			}
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

