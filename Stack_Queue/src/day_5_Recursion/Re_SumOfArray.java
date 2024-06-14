package day_5_Recursion;

public class Re_SumOfArray {
	static int sum(int []a,int i)
	{
		if(i>9) 
			return 0;
		System.out.println(a[i]);
		return a[i] + sum(a,i+1); 
	}
}
