package assignment;


import java.util.Scanner;

public class Int_LLMain {
	public static void main(String[] args) {
		Int_linkedlist ll = new Int_linkedlist();
		Int_linkedlist list= new Int_linkedlist();
		int choice = 0, woh=0,pos;
		do {
			System.out.println("~~~~~~~~~~~~~~");
			System.out.println("1. Insert Many");
			System.out.println("2. Insert Last");
			System.out.println("3. Split");
			System.out.println("4. Find Middle");
			System.out.println("5. insert in two list");
			System.out.println("6. even odd");
			System.out.println("7. merge both list");
			System.out.println("8. display reverse");
			System.out.println("9. reverse list");
			System.out.println("10. delete alternate");
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
				ll.insertMany(woh);
				break;
			case 2:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				ll.insert_last(woh);
				break;
			case 3:
				System.out.print("split before (value) :");
				pos = s.nextInt();
				list.setHead(ll.split(pos));
				System.out.println("list 1 : ");
				System.out.println(ll);
				System.out.println("list 2 : ");
				System.out.println(list);
				break;
			case 4:
				ll.findMiddle();
				break;
			case 5:
				System.out.print("Enter the Value you want add in List :");
				woh = s.nextInt();
				ll.insertMany(woh);
				System.out.print("Enter the Value you want add in List2 :");
				woh = s.nextInt();
				list.insertMany(woh);
				break;
			case 6:
				ll.evenOdd();
				System.out.println("Done..!!");
				break;
			case 7:
				Int_linkedlist test =Int_linkedlist.mergeSorted(ll, list);
				System.out.println(test) ;
				break;
			case 8:
				ll.display_reverse();
				break;
			case 9:
				ll.reverseList();
				System.out.println("Done..!!");
				break;
			case 10:
				ll.deleteAlternate();
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

