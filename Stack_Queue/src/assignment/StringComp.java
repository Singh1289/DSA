package assignment;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringComp {
	
	public static String compare(String str)
	{
		Queue q=new LinkedList();
		int i;
		for(i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			q.add(str.charAt(i));
			if(str.charAt(i)==':')
				break;
		}
		System.out.println();
		i++;q.remove();
		int equal=1;
		int k;
		for( k=i;k<str.length() && (!q.isEmpty());k++)
		{
			
			char c=(char) q.remove();
			System.out.println(c+" "+str.charAt(k));
			if(c!=str.charAt(k))
				equal=0;
			
		}
		if(equal==0)
			System.out.println("not match");
		else
			System.out.println("match ");
		if(q.isEmpty() && k==str.length())
			return"Same length";
		
		return "diffrent length";
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(compare(str)); 
	}

}
