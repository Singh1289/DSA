package day_9_QuickSort;

import java.util.Scanner;

public class QuickSort {

	public static int partition(int arr[],int low,int high)
	{										
		int left_ind,right_ind,pivot,t;
					
		pivot=arr[low];//15
		left_ind=low; //0  
		right_ind=high;//3
		
		while(left_ind<=right_ind)
		{
			while((arr[left_ind]<=pivot)&&(left_ind<high))
				left_ind++; //1
			
			while(arr[right_ind]>pivot)
				right_ind--; //2

			if(left_ind<right_ind)
			{
				t=arr[left_ind]; //68
				arr[left_ind]=arr[right_ind];//7
				arr[right_ind]=t;//68
				left_ind++;//2
				right_ind--;//1
				
			}
			else
				left_ind++;
		}
		arr[low]=arr[right_ind];//68
		arr[right_ind]=pivot;//15
		
		return right_ind;//1
	}
	
	public static void quick_Sort(int arr[],int low, int high)
	{
		int pivloc;
		
		if(low>=high)
			return;
		
		pivloc=partition(arr, low, high);
		
		quick_Sort(arr, low, pivloc-1);
		
		quick_Sort(arr, pivloc+1, high);
		
	}

	public static void main(String[] args) {
			
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size:");
		
		int arr[] = new int[s.nextInt()];
	
		for(int i=0;i<arr.length;i++)
			{System.out.println("Enter the value:");
			int a=s.nextInt();
			arr[i]=a;
			
			}
		
		System.out.print("UnSorted array:[");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.print("]");
		
		quick_Sort(arr, 0,arr.length-1);
		
		System.out.println(" ");
		System.out.print("Sorted array:[");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.print("]");
		}
}

