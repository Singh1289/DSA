package day_5_Recursion;

public class Re_Daimond {
	// pattern triangle

		public static void fun02(int n) {
			
			for(int i=5;i>=n;i--) {
				System.out.print(" ");}
			for(int i=1;i<=n;i++) {
				System.out.print("* ");}
			System.out.println();
			if(n>5)return;
			
			fun02(n+1);
			for(int i=5;i>=n;i--) {
				System.out.print(" ");}
			for(int i=1;i<=n;i++) {
				System.out.print("* ");}
			System.out.println();
			
			return;
		}
		
		
		public static void main(String[] args) {
			
			fun02(1);
			
			System.out.println("~~~ Thank you ~~~");
		}
}
