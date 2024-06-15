package day_3_LinkedList;

import java.util.Scanner;

import day_1_Stack.StringStack;

public class htmlTagValidation {
	private static boolean match(String c1, String c2) {
		return (c1.equals(c2))?true:false;	
	}
	public static boolean check(String str) {
		StringStack tagNameStack = new StringStack();
		StringStack Stack = new StringStack();
		String s1,s2;
		while(str.length()!=1) {
			if(str.charAt(0)=='<'&& str.charAt(1)!='/') {
				s1=str.substring(0,1);
				System.out.println(s1);
				Stack.push(s1);
				str= str.substring(1);
				System.out.println(str);
				s1= str.substring(0,str.indexOf("[^a-zA-Z]"));
				System.out.println(s1);
				tagNameStack.push(s1);
				str= str.substring(str.indexOf("[^a-zA-Z]"));
				System.out.println(str);
			}
		}
		return true;
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter html statement :");
		String str=sc.nextLine();
		
		if(check(str))
			System.out.println("Statement is valid.");
		else
			System.out.println("Statement is invalid.");
	}


}
