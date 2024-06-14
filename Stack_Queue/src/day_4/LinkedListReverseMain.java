package day_4;

import java.util.Scanner;

import day_2.IntListNode;
import day_3.LinkedList;

public class LinkedListReverseMain {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int choice = 0, woh,pos;
		do {
			System.out.println("~~~~~~~~~~~~~~");
			System.out.println("1. Insert values");
			System.out.println("2. Delete Last");
			System.out.println("3. Reverse List");
			System.out.println("4. Find middle element");
			System.out.println("5. Display List");
			System.out.println("6. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~");
			switch (choice) {
			
			case 1:
				System.out.print("How many values you want to add : ");
				woh = s.nextInt();
				ll.createList(woh);
				break;

				
			case 2:
				woh=ll.deleteLast();
				if (woh == -999) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Value is " + woh);
				}
				break;
				
			case 3:
				ll.setHead(LinkedList.reverse(ll.getHead()));
				System.out.println("List is reversed");
				break;
				
			case 4:
				ll.findMiddle();
				break;
				
			case 5:
				System.out.println(ll);
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("Enter Value is not between 1 to 13 Enter again!!!..");
				break;
			}
		} while (choice != 6);
		System.out.println("~~~ Thank you ~~~~");
	}

	
}
