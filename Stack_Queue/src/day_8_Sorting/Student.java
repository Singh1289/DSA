package day_8_Sorting;

public class Student {
	private int rollno;
	private String name;
	private int mrks1;
	private int mrks2;
	private int Total;
	public Student() {
		
		
	}
	public Student(int rollno, String name, int mrks1, int mrks2) {
	
		this.rollno = rollno;
		this.name = name;
		this.mrks1 = mrks1;
		this.mrks2 = mrks2;
		Total = mrks1+mrks2;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mrks1=" + mrks1 + ", mrks2=" + mrks2 + ", Total="
				+ Total + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMrks1() {
		return mrks1;
	}
	public void setMrks1(int mrks1) {
		this.mrks1 = mrks1;
	}
	public int getMrks2() {
		return mrks2;
	}
	public void setMrks2(int mrks2) {
		this.mrks2 = mrks2;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	
}
