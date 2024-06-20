package assignment;

import java.util.Scanner;



public class LL_Main {
	public static void main(String[] args) {
		LL_assign list= new LL_assign();
		LL_assign list2 = new LL_assign();
		int choice = 0,check=0, woh, pos;
		String name;
		Product test;
		do {
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1.  Insert last");
			System.out.println("2.  Insert in 2 list");
			System.out.println("3.  Insert By Pos");
			System.out.println("4.  Insert Before");
			System.out.println("5.  ----");
			System.out.println("6.  Insert After");
			System.out.println("7.  Delete First");
			System.out.println("8.  Delete Last");
			System.out.println("9.  -------");
			System.out.println("10. -------");
			System.out.println("11. --------");
			System.out.println("12. Display both List");
			System.out.println("13. Concate---");
			System.out.println("14. -------");
			System.out.println("15. display");
			System.out.println("16. Exit");
			System.out.print("Enter your choice: ");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("Enter name of the product :");
				name = s.next();
				System.out.print("Enter price of the product :");
				woh = s.nextInt();
				list.insert_last(new Product(name, woh));
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
						System.out.print("Enter name of the product :");
						name = s.next();
						System.out.print("Enter price of the product :");
						woh = s.nextInt();
						list.insert_first(new Product(name, woh));
						break;
					case 2:
						System.out.print("Enter name of the product :");
						name = s.next();
						System.out.print("Enter price of the product :");
						woh = s.nextInt();
						list2.insert_first(new Product(name, woh));
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
				System.out.print("At What Position :");
				pos = s.nextInt();
				System.out.print("Enter name of the product :");
				name = s.next();
				System.out.print("Enter price of the product :");
				woh = s.nextInt();
				list.insert_ByPos(new Product(name, woh),pos);
				break;
			case 4:
				System.out.print("Enter price before you want to add :");
				pos = s.nextInt();
				System.out.print("Enter name of the product :");
				name = s.next();
				System.out.print("Enter price of the product :");
				woh = s.nextInt();
				list.insert_before(new Product(name, woh),pos);
				
				break;
			case 5:
				//
				break;
			case 6:
				System.out.print("Enter price before you want to add :");
				pos = s.nextInt();
				System.out.print("Enter name of the product :");
				name = s.next();
				System.out.print("Enter price of the product :");
				woh = s.nextInt();
				list.insert_after(new Product(name, woh),pos);
			
				break;
			case 7:
				test = list.delete_first();
				if (test.getPrice() == 0) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Product is " + test);
				}
				break;
			case 8:
				//woh = list.deleteLast();
				test = list.delete_last();
				if (test.getPrice() == 0) {
					System.out.println("List is empty");
				} else {
					System.out.println("Deleted Product is " + test);
				}
				break;
			case 9:
				//
				break;
			case 10:
				//
				break;
			case 11:
				//list.display_alternativeNode();
				break;
			case 12:
				System.out.println("~~ list 1 ~~");
				list.display();
				System.out.println("~~ list 2 ~~");
				list2.display();
				break;
			
			case 13:
				LL_assign list_new=LL_assign.concate(list,list2);
				System.out.println("Done");
				System.out.println("~~ list 1 ~~");
				list.display();
				System.out.println("~~ list 2 ~~");
				list2.display();
				System.out.println("~~ list =3 ~~");
				list_new.display();;
				break;
			case 14:
				//
				break;
			case 15:
				list.display();
				break;
			default:
				System.out.println("Enter Value is not between 1 to 15 Enter again!!!..");
				break;
			}
		} while (choice != 16);
		System.out.println("~~~ Thank you ~~~~");
	}
}
