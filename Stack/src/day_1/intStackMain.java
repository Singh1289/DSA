package day_1;

import java.util.Scanner;

public class intStackMain {

	public static void main(String[] args) {

		intStack is = new intStack(5);
		int choice = 0, woh;
		do {
			System.out.println("~~~~~~~~");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("Enter the Value you want add in stack:");
				woh = s.nextInt();
				is.push(woh);
				break;
			case 2:
				woh = is.pop();
				if (woh == -999) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Popped Value is " + woh);
				}
				break;
			case 3:
				woh = is.peek();
				if (woh == -999) {
					System.out.println("Stack is empty");
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
