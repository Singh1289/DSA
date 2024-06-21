package assignment;

import day_1_Stack.StringStack;

public class StingPalindrom {

	public static void main(String[] args) {
		String str = "abc xyz xyz abc";
		//charStack st = new charStack(200);
		StringStack ss = new StringStack(30);
		boolean ch=true;
		String s1[] = str.split(" ");
		for(int i=0;i<s1.length;i++)
			ss.push(s1[i]);
	
		for(int i=0;i<s1.length;i++) {
			if(!s1[i].equals(ss.pop()))
				ch=false;
		}
		
		if(ch)
			System.out.println("palindrom..!!");
		else
			System.out.println("sorry ..!!");
		
		
	}
}

