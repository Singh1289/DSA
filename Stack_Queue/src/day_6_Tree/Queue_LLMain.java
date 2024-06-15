package day_6_Tree;

import java.util.Scanner;

public class Queue_LLMain {
	public static void main(String[] args) {
		Queue_LinkedList is=new Queue_LinkedList();
		int choice = 0, woh;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~ Stack-LinkedList ~~");
			System.out.println("1.add");
			System.out.println("2.remove");
			System.out.println("3.Peek");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("Enter the Value you want add in stack:");
				woh = s.nextInt();
				is.add(woh);
				break;
			case 2:
				woh = is.remove();
				if (woh == -999) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Popped Value is " + woh);
				}
				break;
			case 3:
				woh = is.peek();
				if (woh == -999) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Top Value is " + woh);
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 4 Enter again!!!..");
				break;
			}
		} while (choice != 4);
		System.out.println("~~~ Thank you ~~~~");
	}
}
