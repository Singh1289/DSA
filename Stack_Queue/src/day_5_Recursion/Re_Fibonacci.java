package day_5_Recursion;

public class Re_Fibonacci {
	public static void fibonacci(int n) {
		int ch=0;

		if(n== -1)return;
		
		fibonacci(n-1);
	
		for(int i=0;i<=n;i++)
			ch+=i;
		System.out.print(ch+" ");
		
		//System.out.println("in backward 2 :"+n);
		return;
	}
	
	
	public static void main(String[] args) {
		
		fibonacci(5);
		
		System.out.println("\n~~~ Thank you ~~~");
	}
}
