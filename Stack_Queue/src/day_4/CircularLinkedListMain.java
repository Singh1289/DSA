package day_4;

import java.util.Scanner;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		int choice = 0, woh,pos;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1.Insert First");
			System.out.println("2.Insert Last");
			System.out.println("3.Insert By Pos");
			System.out.println("4.Delete First");
			System.out.println("5.Delete Last");
			System.out.println("6.Delete by passing the node address");
			System.out.println("7.Display list");
			System.out.println("8.Reverse");
			System.out.println("9. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			
			case 1: System.out.print("how many nodes to be added : ");
				woh = s.nextInt();
				cl.insert_first(woh);
			break;
			case 2:
				System.out.print("Enter Value to insert first: ");
				woh = s.nextInt();
				cl.insert_last(woh);
				break;
			case 3:
				System.out.println("function not available right now.");
//				System.out.print("Enter Value to insert first: ");
//				woh = s.nextInt();
//				cl.insert_last(woh);
				break;
			case 4:
				woh = cl.delete_first();
				if(woh!=-999)
					System.out.println(woh+" is deleted");
				else
					System.out.println("list is empty");
				break;
			case 5:
				System.out.println("function not available right now.");
//				woh = cl.delete_last();
//				if(woh!=-999)
//					System.out.println(woh+" is deleted");
//				else
//					System.out.println("list is empty");
				break;
			case 6:
				System.out.println("function not available right now.");
//				woh = cl.delete_last();
//				if(woh!=-999)
//					System.out.println(woh+" is deleted");
//				else
//					System.out.println("list is empty");
				break;

			case 7:
				cl.display();
				break;
			case 8:
				System.out.println("function not available right now.");
//				woh = cl.delete_last();
//				if(woh!=-999)
//					System.out.println(woh+" is deleted");
//				else
//					System.out.println("list is empty");
				break;
			case 9:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 9 Enter again!!!..");
				break;
			}
		} while (choice != 9);
		System.out.println("~~~ Thank you ~~~~");
	}

}
