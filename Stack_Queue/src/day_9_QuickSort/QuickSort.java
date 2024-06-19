package day_9_QuickSort;

public class QuickSort {

	public static int partition(int arr[],int low,int high)
	{
		int left_ind,right_ind,pivot,t;
		
		pivot=arr[low];
		left_ind=low;
		right_ind=high;
		
		while(left_ind<=right_ind)
		{
			while((arr[left_ind]<=pivot)&&(left_ind<high))
				left_ind++;
			
			while(arr[right_ind]>pivot)
				right_ind--;

			if(left_ind<right_ind)
			{
				t=arr[left_ind];
				arr[left_ind]=arr[right_ind];
				arr[right_ind]=t;
				left_ind++;
				right_ind--;
				
			}
			else
				left_ind++;
		}
		arr[low]=arr[right_ind];
		arr[right_ind]=pivot;
		
		return right_ind;
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
		int arr[] = {67,1,23,53,24,7,654,43};
		
		quick_Sort(arr, 0,7);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}

