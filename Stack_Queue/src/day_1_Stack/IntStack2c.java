package day_1_Stack;

public class IntStack2c {
	private int topA ,topB;
	private int []arr;
	public IntStack2c() {
		topA =-1;
		topB=arr.length;
		arr= new int[10];
	}
	public IntStack2c(int topB) {
		topA =-1;
		arr= new int[topB];
		this.topB = topB;
	}
	 
	public boolean isFull() {
		return((topB-topA)==1) ? true:false;
	}
	public boolean isEmptyA() {
		return((topA)==-1) ? true:false;
	}
	public boolean isEmptyB() {
		return((topB)==arr.length) ? true:false;
	}
	
	public void pushA(int a) {
	
		if(isFull()) {
			System.out.println("Stack Overflow.....");
			return ;
		}else {
			topA++;
			arr[topA]=a;
			return;
		}
	}
	public void pushB(int b) {
		
		if(isFull()) {
			System.out.println("Stack Overflow.....");
			return ;
		}else {
			topB--;
			arr[topB]=b;
			return;
		}
	}
	public int popA() {
		int d=-999;
		if(isEmptyA()) {
			return d;
		}else {
			d= arr[topA];
			topA--;
			
			
			return d;
		}
	}
	public int popB() {
		int d=-999;
		if(isEmptyB()) {
			return d;
		}else {
			
			topB++;
			
			
			return d;
		}
	}
	public int peekA() {
		int d=-999;
		if(isEmptyA()) {
			return d;
		}else {
			d= arr[topA];
			return d;
		}
	}
	public int peekB() {
		int d=-999;
		if(isEmptyB()) {
			return d;
		}else {
			d= arr[topB];
			return d;
		}
	}
}
