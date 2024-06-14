package day_5_Recursion;

public class Re_SumOfArray {
	static int sumOfArray(int []a,int i)
	{
		if(i>9)return 0; 			
		System.out.print(a[i]+" ");
		return a[i] + sumOfArray(a,i+1); 
	}
	public static void main(String[] args) {		
		int arr[]= {2,5,7,9,4,61,7,1,5,3};
		int sum= sumOfArray(arr,0);
		
		System.out.println(" = Sum : "+sum);
		System.out.println("~~~ Thank you ~~~");
	}
}
