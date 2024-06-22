package day_1_Stack;

public class EmployeeStack {
	private int top;
	private Employee arr[];
	
	public EmployeeStack(int size) {
		top = -1;
		arr = new Employee[size] ;
	}
	public EmployeeStack() {
		top = -1;
		arr = new Employee[10];
	}
	
	// is Empty  isFull pop push peek
	public boolean isEmpty() {
		return (top==-1)? true : false;
	}
	public boolean isFull() {
		return (top==arr.length-1)? true : false;
	}
	
	public void push(Employee a) {
		if(isFull()) {
			System.out.println("\n Stack overflow...");
			return;
		}else {
			top++;
			arr[top]=a;
			return;
		}
	}
	
	public Employee pop() {
		Employee d=new Employee();        
		if(isEmpty()) {
			return d;
		}else {
			d=arr[top];
			top--;
			return d;
		}
	}
	
	public Employee peek() {
		Employee d=new Employee();
		if(isEmpty()) {
			return d;
		}else {
			d= arr[top];
			return d;
		}
	}
	
}
