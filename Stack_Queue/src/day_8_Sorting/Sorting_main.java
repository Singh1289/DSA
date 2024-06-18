package day_8_Sorting;

import java.util.Scanner;

import day_6_Tree.BTNode;
import day_7_BST.BST_Recusive;

public class Sorting_main {

	public static void main(String[] args) {
		Student arr[]=null;
		int choice=0,woh, mark1,mark2,rollno;
		String name;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Insert Multiple Student");
			System.out.println("2. Bubble Sort");
			System.out.println("3. Insertion Sort");
			System.out.println("4. Selection Sort");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("How many Student to enter :");
				woh = s.nextInt();
				arr= Sorting.insertMany(woh);
				
				//System.out.println("Added Successfully");
				break;
			case 2:
				Sorting.bubble_Sort(arr);
				break;
			case 3:
				Sorting.insertion_Sort(arr);
				break;
			case 4:
				Sorting.selection_Sort(arr);
				break;
			case 5:
				Sorting.display(arr);
				break;
			case 6:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 6 Enter again!!!..");
				break;
			}
		} while (choice != 6);
		System.out.println("~~~ Thank you ~~~~");
	}
}
