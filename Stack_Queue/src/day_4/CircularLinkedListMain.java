package day_4;

import java.util.Scanner;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		int choice = 0, woh,pos;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1.Insert values");
			System.out.println("2.Insert first");
			System.out.println("3.Insert Last");
			System.out.println("4.Insert By Pos");
			System.out.println("5.Delete First");
			System.out.println("6.Delete Last");
			System.out.println("7.Delete by position");
			System.out.println("8.Display list");
			System.out.println("9.Reverse");
			System.out.println("10. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			
			case 1: System.out.print("how many nodes to be added : ");
				woh = s.nextInt();
				cl.createList(woh);
			break;
			case 2:
				System.out.print("Enter Value to insert first: ");
				woh = s.nextInt();
				cl.insert_first(woh);
				break;
			case 3:
				System.out.print("Enter Value to insert first: ");
				woh = s.nextInt();
				cl.insert_last(woh);
				break;
			case 4:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				System.out.print("At What Position :");
				pos = s.nextInt();
				cl.insert_by_pos(woh,pos);
				break;
			
			case 5:
				woh = cl.delete_first();
				if(woh!=-999)
					System.out.println(woh+" is deleted");
				else
					System.out.println("list is empty");
				break;
			case 6:
				woh = cl.delete_last();
				if(woh!=-999)
					System.out.println(woh+" is deleted");
				else
					System.out.println("list is empty");
				break;
			case 7:
				System.out.print("At What Position :");
				pos = s.nextInt();
				woh = cl.delete_by_pos(pos);
				if(woh!=-999)
					System.out.println(woh+" is deleted");
				else
					System.out.println("list is empty");
				break;

			case 8:
				cl.display();
				break;
			case 9:
				cl.setLast(CircularLinkedList.reverse(cl.getLast().getNext(), cl.getLast().getNext()));
				System.out.println("List Reserved ");
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
