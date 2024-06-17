package day_6_Tree;

import java.util.Scanner;

public class TreeMain {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		BinaryTree bt1 = new BinaryTree();
		Scanner s = new Scanner(System.in);
		int choice = 0, woh,ch=0;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~ Binary Tree(balance) ~~");
			System.out.println("1.Add multiple nodes");
			System.out.println("2.Create a node");
			System.out.println("3.count level");
			System.out.println("4.Display tree");
			System.out.println("5.IsIdentical");
			System.out.println("6.Create new Mirror Image");
			System.out.println("7.Create mirror image");
			System.out.println("8.Count nodes");
			System.out.println("9.Sum of nodes");
			System.out.println("10.Average of nodes");
			System.out.println("11.Max Value of Tree");
			System.out.println("12.Min Value of Tree");
			System.out.println("13.Display leaf Nodes");
			System.out.println("14.Display Non-leaf Nodes");
			System.out.println("15.Exit");
			System.out.print("Enter your choice:");
			
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				do {
					System.out.println("~~~~~~~~~~~~~~~~~~");
					System.out.println("1.Create Tree one");
					System.out.println("2.Create Tree two");
					System.out.println("3.Exit");
					System.out.print("Enter your choice:");
					ch = s.nextInt();
					System.out.println("~~~~~~~~~~~~~~~~~~~");
					switch(ch) {
					case 1:
						System.out.print("How many nodes you want to add :");
						woh = s.nextInt();
						bt.insert_many(woh);
						break;
					case 2:
						System.out.print("How many nodes you want to add :");
						woh = s.nextInt();
						bt1.insert_many(woh);
						break;
					case 3: break;
					default: System.out.println("Invalid option");
					}
				}while(ch!=3);
				break;
			case 2:
				System.out.print("Enter the Value you want add in tree:");
				woh = s.nextInt();
				bt.insert_levelwise(woh);
				break;
			case 3:
				int count= bt.level_cout();
				if(count==-1)
					System.out.println("tree is empty..!!");
				else {
				System.out.println("levels : "+count);
				System.out.println("Height : "+(count+1));
				}
				break;
			case 4:
				do {
					System.out.println("~~~~~~~~~~~~~~~~~~");
					System.out.println("1.Tree one");
					System.out.println("2.Tree two");
					System.out.println("3.Exit");
					System.out.print("Enter your choice:");
					ch = s.nextInt();
					System.out.println("~~~~~~~~~~~~~~~~~~~");
					switch(ch) {
					case 1:
						bt.treeTravsal();
						System.out.println();
						break;
					case 2:
						bt1.treeTravsal();
						System.out.println();
						break;
					case 3: break;
					default: System.out.println("Invalid option");
					}
				}while(ch!=3);
				
				break;
			case 5:
				if(BinaryTree.isIdentical(bt,bt1))
					System.out.println("Both Trees are identical");
				else
					System.out.println("Trees are not Identical");
				break;
			case 6:
				BinaryTree new_tree= bt.createMirrorImage();
				System.out.println("New mirror copy is  created successfully");
				new_tree.treeTravsal();
				System.out.println();
				break;
			case 7:
				bt.mirror();
				System.out.println("Mirror image created successfully.");
				break;
			case 8:
				bt.countOfDifferentNodes();
				break;
			case 9:
				bt.sumOfDifferentNodes();
				break;
			case 10:
				bt.averageOfDifferentNodes();
				break;
			case 11:
				woh=bt.max_node();
				if (woh == -999) {
					System.out.println("Tree is empty");
				} else {
					System.out.println("Maximum Value of Node :"+woh);
				}
				break;
			case 12:
				woh=bt.min_node();
				
				if (woh == Integer.MAX_VALUE) {
					System.out.println("Tree is empty"+woh);
				} else {
					System.out.println("Minimum Value of Node :"+woh);
				}
			
				break;
			case 13:
				bt.display_leafNode();
				//System.out.println("function not avilable");

				break;
			case 14:
				bt.display_nonLeafNode();
				//System.out.println("function not avilable");

				break;
			case 15:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 11 Enter again!!!..");
				break;
			}
		} while (choice != 15);
		System.out.println("~~~ Thank you ~~~~");
	}
}
