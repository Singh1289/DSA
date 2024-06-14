package day_5_Recursion;

public class Recursion01 {
	
	public static void fun01(int n) {
		System.out.println("in function 1 :"+n);
		fun02(n+1);
		System.out.println("in backward 1 :"+n);
		return;
	}
	
	public static void fun02(int i) {
		System.out.println("in function 2 :"+i);
		if(i>5)return;
		fun01(i+1);
		System.out.println("in backward 2 :"+i);
		return;
	}
	
	
	public static void main(String[] args) {
		
		fun01(1);
		
		System.out.println("~~~ Thank you ~~~");
	}
}
