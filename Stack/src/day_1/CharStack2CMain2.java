package day_1;

import java.util.Scanner;

public class CharStack2CMain2 {
	public static void main(String[] args) {
		System.out.print("Enter your Size of Stack Array:");
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		charStack2c2 is = new charStack2c2(c);
		int choice = 0;
		char check,woh;
		do {
			System.out.println("~~~~~~~~");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
		
			choice = s.nextInt();
			System.out.println("~~~~~~~~");
			switch (choice) {
			case 1:
				do {
					System.out.println("~~~~~~~~");
					System.out.println("a.Push Value From front");
					System.out.println("b.Push Value From back");
					System.out.println("c.Exit");
					System.out.print("Enter your choice:");
					check = s.next().charAt(0);
					System.out.println("~~~~~~~~");
					switch (check) {
					case 'a':
						System.out.print("Enter the Value you want add in stack:");
						woh = s.next().charAt(0);
						is.pushA(woh);
						break;
					case 'b':
						System.out.print("Enter the Value you want add in stack:");
						woh = s.next().charAt(0);
						is.pushB(woh);
						break;

					case 'c':
						break;
					default: System.out.print("Enter the valid option a,b,or c");
					}
					
				} while (check != 'c');
				break;
			case 2:
				do {
					System.out.println("~~~~~~~~");
					System.out.println("a.Pop Value From front");
					System.out.println("b.Pop Value From back");
					System.out.println("c.Exit");
					System.out.print("Enter your choice:");
					check = s.next().charAt(0);
					System.out.println("~~~~~~~~");
					switch (check) {
					case 'a':
						woh = is.popA();
						if (woh == '$') {
							System.out.println("Stack is empty");
						} else {
							System.out.println("Popped Value From A is :" + woh);
						}
						break;
					case 'b':
						woh = is.popB();
						if (woh == '$') {
							System.out.println("Stack is empty");
						} else {
							System.out.println("Popped Value From B is :" + woh);
						}
						break;
					case 'c':
						break;
					default: System.out.print("Enter the valid option a,b,or c");
					}
					
				} while (check != 'c');
				break;
			case 3:
				do {
					System.out.println("~~~~~~~~");
					System.out.println("a.Peek Value From front");
					System.out.println("b.Peek Value From back");
					System.out.println("c.Exit");
					System.out.print("Enter your choice:");
					check = s.next().charAt(0);
					System.out.println("~~~~~~~~");
					switch (check) {
					case 'a':
						woh = is.peekA();
						if (woh == '$') {
							System.out.println("Stack is empty");
						} else {
							System.out.println("Top Value From A is :" + woh);
						}
						break;
					case 'b':
						woh = is.peekB();
						if (woh == '$') {
							System.out.println("Stack is empty");
						} else {
							System.out.println("Top Value From B is :" + woh);
						}
						break;
					case 'c':
						break;
					default: System.out.print("Enter the valid option a,b,or c");
					}
					
				} while (check != 'c');
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
