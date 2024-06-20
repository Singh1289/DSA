package day_10_Hashing;

import java.util.Scanner;

class Record_Sep_Node {
	Employee employee;
	Record_Sep_Node next;
}

class Hash_Seperate_Chaining {
	Record_Sep_Node table[];

	public Hash_Seperate_Chaining() {
		table = new Record_Sep_Node[10];
		for (int i = 0; i < 10; i++)
			table[i] = new Record_Sep_Node();
	}

	public void insert(Employee emprec) {
		int h, key;
		Record_Sep_Node tmp;

		key = emprec.getEmpId(); /* Extract the key from the record */

		if (search(key) != -1) {
			System.out.print("Duplicate key\n");
			return;
		}
		h = hash(key);
		/* Insert in the beginning of list h */
		tmp = new Record_Sep_Node();
		tmp.employee = emprec;
		tmp.next = table[h];
		table[h] = tmp;
	}

	public int search(int key) {
		int h;
		Record_Sep_Node ptr;
		h = hash(key);
		ptr = table[h];
		while (ptr != null && ptr.employee != null) {
			if (ptr.employee.getEmpId() == key)
				return h;
			ptr = ptr.next;
		}
		return -1;
	}

	int hash(int key) {
		return (key % 10);
	}/* End of hash() */

	public void del(int key) {
		int h;
		Record_Sep_Node tmp, ptr;
		h = hash(key);

		if (table[h] == null) {
			System.out.print(key + "not found\n");
			return;
		}
		if (table[h].employee.getEmpId() == key) {
			tmp = table[h];
			table[h] = table[h].next;
			return;
		}
		ptr = table[h];
		while (ptr.next != null) {
			if (ptr.next.employee != null && 
					ptr.next.employee.getEmpId() == key) {
				tmp = ptr.next;
				ptr.next = tmp.next;
				return;
			}
			ptr = ptr.next;
		}
		System.out.print(key + "not found\n");
	}

	public void display() {
		int i;
		Record_Sep_Node ptr;
		for (i = 0; i < 10; i++) {
			// System.out.print(" "+i);
			if (table[i] != null) {
				ptr = table[i];
				while (ptr != null && ptr.employee != null) {
					System.out.println(ptr.employee.getEmpId() + "  " + ptr.employee.getName() + "   " + ptr.employee.getSalary());
					ptr = ptr.next;
				}
			}
		}
		System.out.print("\n");
	}/* End of display() */

	public void display_rec(int loc) {
		Record_Sep_Node tmp, ptr;
		ptr = table[loc];
		while (ptr != null && ptr.employee != null) {
			System.out.println(ptr.employee.getEmpId() + "  " + ptr.employee.getName() + "   " + ptr.employee.getSalary());
			ptr = ptr.next;
		}
	}

}

public class Hash_Seperate_Chaining_Main {

	public static void main(String[] args) {
		Employee e;
		int eno, age;
		String name;
		float s;
		int i;
		Scanner sc = new Scanner(System.in);
		Hash_Seperate_Chaining hl = new Hash_Seperate_Chaining();

		/*
		 * for(i=0;i<5;i++) {
		 * System.out.println("\n Enter empno name salary age of employee: ");
		 * eno=sc.nextInt(); name = sc.next(); age=sc.nextInt(); s=sc.nextFloat(); e =
		 * new Employee(eno,name,s,age); hl.insert(e); }
		 */

		hl.insert(new Employee(1009, "Janhavi", 25000));
		hl.insert(new Employee(9889, "Pooja", 45000));
		hl.insert(new Employee(1999, "Jayant", 40000));
		hl.insert(new Employee(2334, "Jaya", 35000));
		hl.insert(new Employee(1994, "Sonal", 21000));
		hl.display();
		System.out.println("search for key =" + hl.search(1999));
		hl.display_rec(hl.search(1999));
		hl.del(9889);
		hl.display();
		hl.insert(new Employee(9889, "Palu", 56000));
		System.out.println("\n\n");
		hl.display();
		sc.close();

	}

}
