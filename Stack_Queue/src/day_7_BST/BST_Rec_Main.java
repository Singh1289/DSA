package day_7_BST;

import java.util.Scanner;

import day_6_Tree.BTNode;

public class BST_Rec_Main {
	public static void main(String[] args) {
		BST_Recusive tree= new BST_Recusive();
		int choice = 0, woh,data;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Insert Multiple Nodes");
			System.out.println("2. Insert a node");
			System.out.println("3. Display");
			System.out.println("4. Search a node");
			System.out.println("5. Find hight");
			System.out.println("6. Find Min Max");
			System.out.println("7. Delete a node");
			System.out.println("8. Exit");
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
				if(ch == null)
					System.out.println("Node not found");
				else
					System.out.println("Found value :"+ch.getData());
				break;
			case 5:
				woh= BST_Recusive.findHeight(tree.getRoot());
				System.out.println("Height : "+ woh);
				break;
			case 6:
				System.out.println("Max node : "+ tree.findMax_rec());
				System.out.println("Min node : "+ tree.findMin_rec());
				break;
			case 7:
				System.out.print("What value to be delete :");
				woh = s.nextInt();
				tree.delete(woh);
				System.out.println("deleted Successfully");
				break;
			case 8:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 6 Enter again!!!..");
				break;
			}
		} while (choice != 8);
		System.out.println("~~~ Thank you ~~~~");
	}
}
