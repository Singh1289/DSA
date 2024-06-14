package day_5_Recursion;

public class Re_factorial {
 
	public static int fact(int n) {

		if(n==1)return 1;
		
		return n*fact(n-1);
	}
		
	public static void main(String[] args) {		
		int i=fact(5);
		System.out.println("Factorial is : "+i);
		System.out.println("~~~ Thank you ~~~");
	}
}
