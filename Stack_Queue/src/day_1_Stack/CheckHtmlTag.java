package day_1_Stack;

import java.util.Scanner;

public class CheckHtmlTag {
private String exp;

public CheckHtmlTag(String exp) {
this.exp=exp;
}
public boolean match(String p1,String p2) {
	if((p1=="div")&&(p2=="/div"))
		return true;
	if((p1=="html")&&(p2=="/html"))
		return true;
	
	return false;
}
public boolean check(String exp) {
	String s1,s2;
	StringStack s=new StringStack();
	for(int i=0;i<exp.length();i++) {
		s1=exp;
		if((s1=="html")||(s1=="div"))
			s.push(s1);
		if((s1=="/html")||(s1=="/div")) {
			if(s.isEmpty()) {
				System.out.println("clossing tag is more than opening tag");
				return false;
			}
			s2=s.pop();
			if(!(match(s2, s1))) {
				System.out.println("misMatched");
				return false;
			}
		}
		
	}
	if (s.isEmpty()) {
		return true;
	}
	else {
		System.out.println("opening tag is more than closing");

	return false;
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the exp");
	String exp = sc.next();
CheckHtmlTag ch=new CheckHtmlTag(exp);
	if (ch.check(exp)) {
		System.out.println("Valid Exp");
	} else {
		System.out.println("invalid Exp");
	}

}
}
