package day_1;

import java.util.Scanner;

public class EmployeeStackMain {

	public static void main(String[] args) {

		EmployeeStack is = new EmployeeStack(5);
		Employee woh;
		int choice;
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
				System.out.print("Enter EmployeeId:");
				int id= s.nextInt();
				System.out.print("\nEnter Employee name :");
				String name = s.next();
				System.out.print("\n Enter Salary:");
				int sal= s. nextInt();
				Employee e1 =new Employee(id, name, sal);
				is.push(e1);
				break;
			case 2:
				woh = is.pop();
				if (woh.getEmpId()==0) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Popped Value is " + woh);
				}
				break;
			case 3:
				woh = is.peek();
				if (woh.getEmpId()==0) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Top Value is :" + woh);
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
