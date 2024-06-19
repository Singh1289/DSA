package day_8_Sorting;

public class Selection {
	
	/* 
	   Binary Search -- Sequential Search
	
	   Binary Search -- work on only on sorted array 
	 	
	 */
	public static int binarySearch(int arr[], int key) {
		int low = 0, high = arr.length-1;//10      72
		int mid = (low+high)/2; // 5
		// [ 12,18,21,25,43,47,56,61,72,79,83 ]
		while((arr[mid]!=key)&&(low<high))  
		{
			if(key<arr[mid])
				high=mid-1;			// 
			else
				low= mid+1;			// 
			
			mid=(high+low)/2;		// 
		}
		
		return (arr[mid]==key)? mid : -999;
	}
	
	public static int binarySearch_rec(int arr[],int key) {
		int low = 0, high = arr.length-1;
		int mid = (low+high)/2;
		
		return binarySer_rec(arr,key,low,high,mid);
	}
	// {4,20,24,28,35,65,70,85}
	private static  int binarySer_rec(int arr[], int key, int low, int high, int mid) {
		
//		System.out.println("mid :"+arr[mid]+" ,low "+low+" high:"+high+" ,mid:"+mid);
//		
//		System.out.println("....................");
		
		if(arr[mid]==key) return mid;
		
		if(low==high) return -999;
		
		if(key<arr[mid])
			high=mid-1;			// 
		else
			low= mid+1;			// 
		
		mid=(high+low)/2;
	
		return binarySer_rec(arr,key,low,high,mid);
	}

	public static int sequentialSearch(int arr[],int key) {
		int i, d=-999;
		for(i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				d=i;
				break;
			}	
		}
		return d;
	}
	
	public static void display(int arr[]) {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i =0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~");
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {4,20,24,28,35,65,70,85};
		
		display(arr);
	//	int a=binarySearch(arr, 90);
		int a=binarySearch_rec(arr, 90);
		System.out.println("value : "+a);
	}
}
