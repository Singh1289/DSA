package for_DSA;

import java.util.Scanner;

enum type_of_record {EMPTY, DELETED, OCCUPIED};

class Record {
	Employee info;
	type_of_record status;
}

class Hash_LinearProbing{
	Record table[];
	
	public Hash_LinearProbing()
	{
		table = new Record[10];
		for(int i=0;i<10;i++)
		{
			table[i] = new Record();
			table[i].status = type_of_record.EMPTY;
		}
			
		
		for(int i=0;i<10;i++)
			System.out.print("  "+table[i].status);
	}
	public Hash_LinearProbing(int size)
	{
		table = new Record[size];
		for(int i=0;i<size;i++)
		{
			table[i] = new Record();
			table[i].status = type_of_record.EMPTY;
		}
	}
	
	public void insert(Employee emprec)
	{
		int i, location, h;
		
		int key = emprec.getEmpno();	/*Extract key from the record*/
		h = hash(key);				
		
		location = h;	
		for( i=1; i<=9; i++ )
		{
			if(table[location].status == type_of_record.EMPTY || table[location].status == type_of_record.DELETED)
			{
				table[location].info = emprec;
				table[location].status = type_of_record.OCCUPIED;	
				System.out.print("Record inserted\n\n");
				return;
			}
			if(table[location].info.getEmpno() == key)
			{
				System.out.print("Duplicate key\n\n");
				return;
			}
	        location = ( h + i ) % 10;				
		}
		System.out.print("Record can't be inserted : Table overFlow\n\n");
	}
	
	int search(int key)
	{
		int i, h, location;
	    h = hash(key);				

		location = h;
		for( i=1; i<=9; i++ )
		{
			if( table[location].status == type_of_record.EMPTY  ) 
				return -1;
			if( table[location].info.getEmpno() == key)
				return location;
			location = ( h + i ) % 10;								
		}
		return -1;
	}
	public void del(int key)
	{
		int location = search(key);
		if(location == -1)
			System.out.print("Key not found\n");
		else
			table[location].status = type_of_record.DELETED;
	}/*End of del()*/
	
	
	public int hash(int key) 
	{
		return (key%10);	
	}
	
	public void display()
	{
		int i;
		for(i=0; i<10; i++)
		{
			System.out.print(" \n\n  "+i );
			if(table[i].status== type_of_record.OCCUPIED) 
			{
				System.out.print("Occupied "+table[i].info.getEmpno()+"  " +table[i].info.getEname());
				
				System.out.print("   "+ table[i].info.age);
			}
			else if(table[i].status== type_of_record.DELETED)
				System.out.print("Deleted\n");
			else
				System.out.print("Empty\n");
	}
  }
}

public class Hash_LinearProbing_Main {

	public static void main(String[] args) {
		Employee e;
		int eno,age;
		String name;
		float s;
		int i;
		Scanner sc=new Scanner(System.in);
		Hash_LinearProbing hl = new Hash_LinearProbing();
		/*for(i=0;i<5;i++)
		{
			System.out.println("\n Enter empno name salary age of employee: ");
			eno=sc.nextInt();
			name = sc.next();
			age=sc.nextInt();
			s=sc.nextFloat();
			e = new Employee(eno,name,s,age);
			hl.insert(e);
		}*/
		hl.insert(new Employee(1009,"Janhavi",55000f,51));
		hl.insert(new Employee(9889,"Pooja",45000f,52));
		hl.insert(new Employee(1999,"Jayant",45000f,54));
		hl.insert(new Employee(2334,"Jaya",35000f,54));
		hl.insert(new Employee(1994,"Sonal",25000f,54));
		hl.display();
		System.out.println("\n\nsearch for key ="+hl.search(9889));
		
		hl.del(9889);
		hl.display();
		hl.insert(new Employee(9889,"Palu",56000f,56));
		System.out.println("\n\n");
		hl.display();
        sc.close();
	}

}
