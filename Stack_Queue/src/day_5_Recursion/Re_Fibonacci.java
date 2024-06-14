package day_5_Recursion;

import java.util.Scanner;

public class Re_Fibonacci {
	static int n1=0,n2=1,n3;
	public static void fibonacci(int n) {

		if(n!=0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;		
		System.out.print(" -> "+n3);
		fibonacci(n-1);
		}	
		return;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("how many terms : ");
		int count = s.nextInt();
		
		System.out.print("Series: "+n1+" -> "+n2);
		fibonacci(count-2);
		
		System.out.println("\n~~~ Thank you ~~~");
	}
}
