package day_2_Queue;

import java.util.Scanner;

public class MyQueueMain {
	public static void main(String[] args) {
		MyQueue que= new MyQueue();
		int choice = 0, woh;
		do {
			System.out.println("~~~~~~~~~~~~~~");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("Enter the Value you want add in Queue :");
				woh = s.nextInt();
				que.insert(woh);
				break;
			case 2:
				woh = que.remove();
				if (woh == -999) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Popped Value is " + woh);
				}
				break;
			case 3:
				woh = que.peek();
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
