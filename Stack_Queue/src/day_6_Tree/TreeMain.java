package day_6_Tree;

import java.util.Scanner;

public class TreeMain {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		int choice = 0, woh;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~ Binary Tree(balance) ~~");
			System.out.println("1.Create a node");
			System.out.println("2.Delete a node");
			System.out.println("3.Display tree");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("Enter the Value you want add in stack:");
				woh = s.nextInt();
				bt.insert_levelwise(woh);
				break;
			case 2:
				System.out.println("function not avilable");
//				woh = bt.pop();
//				if (woh == -999) {
//					System.out.println("Stack is empty");
//				} else {
//					System.out.println("Popped Value is " + woh);
//				}
				break;
			case 3:
				bt.treeTravsal();
				
				break;
			case 4:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 4 Enter again!!!..");
				break;
			}
		} while (choice != 4);
		System.out.println("~~~ Thank you ~~~~");
	}
}
