package day_6_Tree;

import java.util.Scanner;

public class TreeMain {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		int choice = 0, woh;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~ Binary Tree(balance) ~~");
			System.out.println("1.Add mulyiple nodes");
			System.out.println("2.Create a node");
			System.out.println("3.Delete a node");
			System.out.println("4.Display tree");
			System.out.println("5.Pre order");
			System.out.println("6.In order");
			System.out.println("7.Post order");
			System.out.println("8.Count nodes");
			System.out.println("9.Sum of nodes");
			System.out.println("10.Average of nodes");
			System.out.println("11.Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("How many nodes you want to add :");
				woh = s.nextInt();
				bt.insert_many(woh);
				break;
			case 2:
				System.out.print("Enter the Value you want add in tree:");
				woh = s.nextInt();
				bt.insert_levelwise(woh);
				break;
			case 3:
				System.out.println("function not avilable");
				break;
			case 4:
				bt.treeTravsal();
				System.out.println();
				break;
			case 5:
				bt.preOrder();
				System.out.println();
				break;
			case 6:
				bt.inOrder();
				System.out.println();
				break;
			case 7:
				bt.postOrder();
				System.out.println();
				break;
			case 8:
				bt.countOfDifferentNodes();
				//System.out.println("function not avilable");

				break;
			case 9:
				bt.sumOfDifferentNodes();
				//System.out.println("function not avilable");

				break;
			case 10:
				bt.averageOfDifferentNodes();
				//System.out.println("function not avilable");

				break;
			case 11:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 11 Enter again!!!..");
				break;
			}
		} while (choice != 11);
		System.out.println("~~~ Thank you ~~~~");
	}
}
