package StackLinkedList;

public class ManagerCircularMain {

	public static void main(String[] args) {
		
		ManagerCircularLL cl=new ManagerCircularLL();
		
		cl.insert_first(new Manager(1, "minu", 1200));
		cl.insert_first(new Manager(3, "sonu", 129));
		cl.insert_last(new Manager(4, "abhi", 19800));
		cl.insert_last(new Manager(2, "archu", 1700));
		System.out.println(cl);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		cl.display();
		
		System.out.println(cl.delete_byid(4));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		cl.display();
		
		
	}
}
