package StackLinkedList;

import java.util.Scanner;

public class ManagerMain {
	
	public static void main(String[] args) {
		ManagerStackLinkedlist sl=new ManagerStackLinkedlist();
		sl.push(new Manager(1, "abhi", 100000));
		sl.push(new Manager(2, "harsh", 20000));
		sl.push(new Manager(3, "mayuresh", 20980));
		sl.push(new Manager(4, "sarvesh", 7800));  
		
		System.out.println("~~~~~ Manager using Stack ~~~~~");
		System.out.println("~~~ Before ~~~");
		sl.display();
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(sl.pop());
		System.out.println("~~~ After ~~~");
		sl.display();
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(sl.pop());
		System.out.println("~~~ After ~~~");
		sl.display();
		
		ManagerLLQueue mq=new ManagerLLQueue();
		mq.push(new Manager(1, "Minal", 100000));
		mq.push(new Manager(2, "Neha", 20000));
		mq.push(new Manager(3, "Archana", 20980));
		mq.push(new Manager(4, "Nikita", 7800)); 
		
		System.out.println("~~~~~ manager using Queue ~~~~~~~");
		System.out.println("~~~ Before ~~~");
		mq.display();
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(mq.pop());
		System.out.println("~~~ After ~~~");
		mq.display();
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(mq.pop());
		System.out.println("~~~ After ~~~");
		mq.display();
		
		
		
	}

}
