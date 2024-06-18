package day_8_Sorting;

import java.util.Scanner;

public class Sorting {
	
// Bubble Sort -- Insertion Sort -- Selection Sort 
	

	public static Student [] insertMany(int n) {
		int m1,m2,rollno;
		String name;
		Scanner sc = new Scanner(System.in);
		Student arr[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println();
			System.out.print("Enter Roll number: ");
			rollno=sc.nextInt();
			System.out.print("Enter name: ");
			name=sc.next();
			System.out.print("Enter Marks1: ");
			m1=sc.nextInt();
			System.out.print("Enter Marks2: ");
			m2=sc.nextInt();
			arr[i]= new Student(rollno, name, m1, m2);
			System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~");
		}	
		return arr;
	} 

	
	//~~~~ Bubble sorting ~~~~//
	
	public static  void bubble_Sort(Student []arr) {
		int i ,j,flag=0;
		Student temp;
		
		for(i= arr.length-1;i>0;i--)
		{
			flag=0;
			for(j=0;j<i;j++)
			{
				if(arr[j].getTotal()>arr[j+1].getTotal())
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
			display(arr);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n");
		}
		
	}

	public static void display(Student[] arr) {
		for(int i= 0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

	//~~~~ Insertion Sorting ~~~~//
	
	public static void insertion_Sort(Student arr[]) {
		int i,j;
		Student k;
		
		for(i=1;i<arr.length;i++) {
			k= arr[i];
			for(j=i-1;j>=0 && k.getTotal() < arr[j].getTotal();j--)
				arr[j+1]=arr[j];
			
			arr[j+1]=k;
		}
	}
	
	//~~~~ Selection Sorting ~~~~//
	
		public static void selection_Sort(Student arr[]) {
			int i,j,min;
			Student temp;
			
			for(i=0;i<arr.length-1;i++)
			{
				min=i;
				for(j=i+1;j<arr.length;j++)
				{
					if(arr[j].getTotal()<arr[min].getTotal())
						min=j;
				}
				if(min!=i) {
					temp= arr[i];
					arr[i]= arr[min];
					arr[min]= temp;
				}
			}
		}
}
 
