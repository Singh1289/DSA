package day_5_Recursion;

import java.util.Scanner;

public class Re_Daimond {
	// pattern triangle

		public static void fun02(int n,int line) {
			
//			for(int i=line;i>=n;i--) {
//				System.out.print(" ");}
//			for(int i=1;i<=n;i++) {
//				System.out.print("* ");}
//			System.out.println();
//			if(n>line)return;
//			
//			fun02(n+1,line);
//			for(int i=line;i>=n;i--) {
//				System.out.print(" ");}
//			for(int i=1;i<=n;i++) {
//				System.out.print("* ");}
//			System.out.println();
//			
			
			for(int i=line;i>=n;i--) {
				System.out.print(" ");}
			
			System.out.print("*");
			for(int i=1;i<=n;i++) {
				System.out.print(" ");}
			System.out.print("*");
			System.out.println();
			if(n>line)return;
			
			fun02(n+1,line);
			for(int i=line;i>=n;i--) {
				System.out.print(" ");}
			
			System.out.print("*");
			for(int i=1;i<=n;i++) {
				System.out.print(" ");}
			System.out.print("*");
			System.out.println();
			
			return;
		}
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number of lines : ");
			int l=sc.nextInt();
			fun02(1,l);
			
			System.out.println("~~~ Thank you ~~~");
		}
}
