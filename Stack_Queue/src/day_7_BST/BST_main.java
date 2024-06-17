package day_7_BST;

import java.util.Scanner;

import day_6_Tree.BTNode;

public class BST_main {
	// no duplicate value 
	// time complexity n/2 = logn 
	// because every time it get half  
	public static void main(String[] args) {
		BST tree= new BST();
		int choice = 0, woh,data;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Insert Multiple Nodes");
			System.out.println("2. Insert a node");
			System.out.println("3. Display");
			System.out.println("4. Search a node");
			System.out.println("5. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("How many nodes to enter :");
				woh = s.nextInt();
				tree.insertMany(woh);
				//System.out.println("Added Successfully");
				break;
			case 2:
				System.out.print("What value to entered :");
				woh = s.nextInt();
				tree.insert(woh);
				//System.out.println("Added Successfully");
				break;
			case 3:
				tree.displayInOrder();
				break;
			case 4:
				System.out.print("Value to be searched :");
				woh = s.nextInt();
				BTNode ch=tree.search(woh);
				if(ch==null)
				System.out.println("Node not found");
				else
					System.out.println("Found value :"+ch.getData());
				break;
			case 5:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 5 Enter again!!!..");
				break;
			}
		} while (choice != 5);
		System.out.println("~~~ Thank you ~~~~");
	}
}
