package day_2;

import java.util.Scanner;

import day_1.charStack;

public class CheckExp {
	private static boolean match(char c1, char c2) {
		if((c1=='{')&&(c2=='}')) return true;
		if((c1=='[')&&(c2==']')) return true;
		if((c1=='(')&&(c2==')')) return true;
		return false;	
	}
	
	public static boolean check(String exp) {
		char ch1, ch2;
		int i;
		charStack st = new charStack();
		for(i=0;i<exp.length();i++) {
			ch1= exp.charAt(i);
			if((ch1=='[')||(ch1=='{')||(ch1=='('))
			{st.push(ch1);}
			
			if((ch1==']')||(ch1=='}')||(ch1==')'))
			{
				if(st.isEmpty()) {
					System.out.println("closing parenthesis are more..!!");
					return false;
				}
				ch2= st.pop();
				if(!(match(ch2,ch1))) {
					System.out.println("Mismatch...!!!");
					return false;
				}
			}
			
		}
		if(st.isEmpty()) {
			return true;}
			else 
			{
			System.out.println("opening parenthesis are more...!!");
			return false;
			}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Exp :");
		String str=sc.nextLine();
		
		System.out.println(check(str));
	}
}
