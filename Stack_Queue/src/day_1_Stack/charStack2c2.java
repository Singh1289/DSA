package day_1_Stack;

public class charStack2c2 {
	private int topA ,topB;
	private char []arr;
	public charStack2c2() {
		topA =-1;
		topB=arr.length;
		arr= new char[10];
	}
	public charStack2c2(int topB) {
		topA =-1;
		arr= new char[topB];
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
	
	public void pushA(char a) {
	
		if(isFull()) {
			System.out.println("Stack Overflow.....");
			return ;
		}else {
			topA++;
			arr[topA]=a;
			return;
		}
	}
	public void pushB(char b) {
		
		if(isFull()) {
			System.out.println("Stack Overflow.....");
			return ;
		}else {
			topB--;
			arr[topB]=b;
			return;
		}
	}
	public char popA() {
		char d='$';
		if(isEmptyA()) {
			return d;
		}else {
			d= arr[topA];
			topA--;
			
			
			return d;
		}
	}
	public char popB() {
		char d='$';
		if(isEmptyB()) {
			return d;
		}else {
			
			topB++;
			
			
			return d;
		}
	}
	public char peekA() {
		char d='$';
		if(isEmptyA()) {
			return d;
		}else {
			d= arr[topA];
			return d;
		}
	}
	public char peekB() {
		char d='$';
		if(isEmptyB()) {
			return d;
		}else {
			d= arr[topB];
			return d;
		}
	}
}
