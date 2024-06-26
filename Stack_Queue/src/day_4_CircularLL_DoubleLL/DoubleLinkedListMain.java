package day_4_CircularLL_DoubleLL;

import java.util.Scanner;

public class DoubleLinkedListMain {
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		int choice = 0, woh,pos;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1.Create list");
			System.out.println("2.Add to empty");
			System.out.println("3.Insert First");
			System.out.println("4.Insert Last");
			System.out.println("5.Insert By Pos");
			System.out.println("6.Delete First");
			System.out.println("7.Delete Last");
			System.out.println("8.Delete by position");
			System.out.println("9.Display list");
			System.out.println("10. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			
			case 1: System.out.print("how many nodes to be added : ");
				woh = s.nextInt();
				dll.createList(woh);
			break;
			case 2: System.out.print("how many nodes to be added : ");
				woh = s.nextInt();
				boolean ch=dll.addToEmpty(woh);
				if(ch)
					System.out.println("value added succesfully.");
				else
					System.out.println("List is not empty.");
				break;
			case 3:
				System.out.print("Enter Value to insert first: ");
				woh = s.nextInt();
				dll.insert_first(woh);
				break;
			case 4:
				System.out.print("Enter Value to insert last: ");
				woh = s.nextInt();
				dll.insert_last(woh);
				break;
			case 5:
				System.out.print("Enter Value to insert: ");
				woh = s.nextInt();
				System.out.print("Enter Position to insert: ");
				pos = s.nextInt();
				dll.insert_by_pos(woh, pos);
				break;
			case 6:
				woh = dll.delete_first();
				if(woh!=-999)
					System.out.println(woh+" is deleted");
				break;
			case 7:
				woh = dll.delete_last();
				if(woh!=-999)
					System.out.println(woh+" Deleted");
				break;
			case 8:
				System.out.print("From which postion : ");
				pos = s.nextInt();
				woh = dll.delete_by_pos(pos);
				if(woh!=-999)
					System.out.println(woh +" is deleted");
				break;
			case 9:
				System.out.println(dll);
				break;
			case 10:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 10 Enter again!!!..");
				break;
			}
		} while (choice != 10);
		System.out.println("~~~ Thank you ~~~~");
	}
}
