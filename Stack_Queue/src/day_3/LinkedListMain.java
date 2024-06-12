package day_3;

import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int choice = 0, woh,pos;
		do {
			System.out.println("~~~~~~~~~~~~~~");
			System.out.println("1. Insert First");
			System.out.println("2. Insert Last");
			System.out.println("3. Insert By Pos");
			System.out.println("4. Insert Before");
			System.out.println("5. Insert Sorted");
			System.out.println("6. Insert After");
			System.out.println("7. Delete First");
			System.out.println("8. Delete Last");
			System.out.println("9. Delele By Pos");
			System.out.println("10. Count Nodes");
			System.out.println("11. Display alternate Nodes");
			System.out.println("12. Display List");
			System.out.println("13. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				ll.insertFirst(woh);
				break;
			case 2:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				ll.insert_last(woh);
				break;
			case 3:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				System.out.print("At What Position :");
				pos = s.nextInt();
				ll.insert_by_pos(woh,pos);
				break;
			case 4:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				System.out.print("At What Position :");
				pos = s.nextInt();
				ll.insert_before(woh, pos);
				break;
			case 5:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				ll.insert_sorted(woh);
				break;
			case 6:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				System.out.print("After :");
				pos = s.nextInt();
				ll.insert_After(woh, pos);
				break;
			case 7:
				woh=ll.deleteFirst();
				if (woh == -999) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Value is " + woh);
				}
				break;
			case 8:
				
				woh=ll.deleteLast();
				if (woh == -999) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Value is " + woh);
				}
				break;
			case 9:
				System.out.print("At What Position :");
				pos = s.nextInt();
				woh=ll.delete_by_pos(pos);
				if (woh == -999) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Value is " + woh);
				}
				break;
			case 10:
				woh=ll.count();				
				System.out.println("No.Of Nodes are: " + woh);
				break;
			case 11:
				ll.display_alternativeNode();
				break;
				
			case 12:
				System.out.println(ll);
				break;
			case 13:
				
				break;
			default:
				System.out.println("Enter Value is not between 1 to 13 Enter again!!!..");
				break;
			}
		} while (choice != 13);
		System.out.println("~~~ Thank you ~~~~");
	}
}

