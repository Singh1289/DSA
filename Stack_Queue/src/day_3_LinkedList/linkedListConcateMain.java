package day_3_LinkedList;

import java.util.Scanner;

public class linkedListConcateMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList();
		int choice = 0,check=0, woh, pos;
		do {
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1.  Insert First");
			System.out.println("2.  Insert Last");
			System.out.println("3.  Insert By Pos");
			System.out.println("4.  Insert Before");
			System.out.println("5.  Insert Sorted");
			System.out.println("6.  Insert After");
			System.out.println("7.  Delete First");
			System.out.println("8.  Delete Last");
			System.out.println("9.  Delele By Pos");
			System.out.println("10. Count Nodes");
			System.out.println("11. Display alternate Nodes");
			System.out.println("12. Display List");
			System.out.println("13. Concate");
			System.out.println("14. Concate into new list");
			System.out.println("15. Delete List");
			System.out.println("16. Exit");
			System.out.print("Enter your choice: ");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				list.insertFirst(woh);
				break;
			case 2:
				do {
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("1. Insert in 1st list");
					System.out.println("2. Insert in 2nd list");
					System.out.println("3. Exit");
					System.out.print("Enter your choice: ");
					check = s.nextInt();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					switch(check) {
					case 1:
						System.out.print("Enter the Value you want add in List :");
						woh = s.nextInt();
						list.insert_last(woh);
						break;
					case 2:
						System.out.print("Enter the Value you want add in List :");
						woh = s.nextInt();
						list2.insert_last(woh);
						break;
					case 3:
						break;
					default:
						System.out.println("Enter value is not between 1 to 3 enter again..!!!");
						break;
					}
				}while(check!=3);
				break;
			case 3:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				System.out.print("At What Position :");
				pos = s.nextInt();
				list.insert_by_pos(woh, pos);
				break;
			case 4:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				System.out.print("At What Position :");
				pos = s.nextInt();
				list.insert_before(woh, pos);
				break;
			case 5:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				list.insert_sorted(woh);
				break;
			case 6:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				System.out.print("After :");
				pos = s.nextInt();
				list.insert_After(woh, pos);
				break;
			case 7:
				woh = list.deleteFirst();
				if (woh == -999) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Value is " + woh);
				}
				break;
			case 8:
				woh = list.deleteLast();
				if (woh == -999) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Value is " + woh);
				}
				break;
			case 9:
				System.out.print("At What Position :");
				pos = s.nextInt();
				woh = list.delete_by_pos(pos);
				if (woh == -999) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Value is " + woh);
				}
				break;
			case 10:
				woh = list.count();
				System.out.println("No. of nodes are: " + woh);
				break;
			case 11:
				list.display_alternativeNode();
				break;
			case 12:
				System.out.println("1. "+list);
				System.out.println("2. "+list2);
				break;
			
			case 13:list.concate(list2);
				System.out.println("Done");
				break;
			case 14:
				LinkedList list3 = LinkedList.concateToThirdList(list, list2);
				System.out.println("1. "+list);
				System.out.println("2. "+list2);
				System.out.println("3. "+list3);
				break;
			case 15:
				do {
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("1. Delete in 1st list");
					System.out.println("2. Delete in 2nd list");
					System.out.println("3. Exit");
					System.out.print("Enter your choice: ");
					check = s.nextInt();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					switch(check) {
					case 1:
						list.deleteList();
						System.out.println("List1 is deleted");
						break;
					case 2:
						list2.deleteList();
						System.out.println("List2 is deleted");
						break;
					case 3:
						break;
					default:
						System.out.println("Enter value is not between 1 to 3 enter again..!!!");
						break;
					}
				}while(check!=3);
				break;
			default:
				System.out.println("Enter Value is not between 1 to 15 Enter again!!!..");
				break;
			}
		} while (choice != 16);
		System.out.println("~~~ Thank you ~~~~");
	}
}
