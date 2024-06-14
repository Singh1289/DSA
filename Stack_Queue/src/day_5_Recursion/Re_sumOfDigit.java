package day_5_Recursion;
//Sum of digit || count of digit || power
public class Re_sumOfDigit {
	public static int sumOfDigit(int n) {

		if(n/10==0)return n;
		
		return n%10 + sumOfDigit(n/10);
	}
	
	public static int countOfDigit(int n) {

		if(n/10==0)return 1;
		
		return 1 + countOfDigit(n/10);
	}
	public static int power(int a, int p)
	{
		if(p==0) return 1;
		return a * power(a,p-1);
	}
		
	public static void main(String[] args) {		
		int i=sumOfDigit(25465650);
		System.out.println("Sum is : "+i);
		
		int count=countOfDigit(25445650);
		System.out.println("count is : "+count);
		
		int co=power(2,5);
		System.out.println("Power : "+co);
		
		System.out.println("~~~ Thank you ~~~");
	}
}
