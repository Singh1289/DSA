package day_9_merge_sort;

public class MergeSort {
	
	public static void merge_ver1(int arr1[],int arr2[],int target[]) {
		int i,j,k;
		i=j=k=0;
		
		while(i<arr1.length && j< arr2.length) {
			if(arr1[i]< arr2[j]) {
				target[k]=arr2[j];
				j++;k++;
			}
			if(arr1[i]> arr2[j]) {
				target[k]=arr1[i];
				i++;k++;
			}
		}
		while(i<arr1.length) {
			target[k]=arr1[i];
			i++;k++;
		}
		while(j<arr2.length) {
			target[k]=arr2[j];
			j++;k++;
		}		
	}//end of function
	
	
	// used in merge sort
	public static void merge_ver2(int arr[],int target[],int low_in1,int high_in1, int low_in2, int high_in2) {
		int i=low_in1,j=low_in2, k=low_in1;
		
		while(i<=high_in1 && j<=high_in2) {
			
			if(arr[i]< arr[j]) {
				target[k]=arr[i];
				i++;k++;
			}
			else {
				target[k]=arr[j];
				j++;k++;
			}
			while(i <= high_in1) {
				target[k]=arr[i];
				i++;k++;
			}
			while(j <= high_in2) {
				target[k]=arr[j];
				j++;k++;
			}			
		}
	}// end of ver 2
	
	public static void copy(int target[],int arr[],int low_in,int high_in) {
		for(int i=low_in; i<=high_in;i++)
			target[i]=arr[i];
		
		return;
	}
	
	// actual merge sort program
	public static void mergeSort(int arr[],int low_in, int high_in ) {
		int mid;
		int temp[]= new int [arr.length];
		
		if(low_in>= high_in) return;
		
		mid = (low_in + high_in)/2;
		mergeSort(arr,low_in,mid);
		mergeSort(arr,mid+1,high_in);
		
		merge_ver2(arr, temp, low_in, mid, mid+1, high_in);
		copy(arr, temp, low_in, high_in);
		
	}// end of mergeSort
	
	public static void display(int arr[]) {
		System.out.print("Array : ");
		for (int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {23,34,65,12,14,05,65,11,23,10,3,6};
		display(arr);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		mergeSort(arr, 0, arr.length-1);
		
		display(arr);
		
	}
	
}
