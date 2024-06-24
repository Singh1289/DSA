package StackLinkedList;

public class Manager {
	
	private int manager_id;
	private String m_name;
	private int salary;
	
	public Manager()
	{
		
	}
	
	public Manager(int manager_id, String m_name, int salary) {
		super();
		this.manager_id = manager_id;
		this.m_name = m_name;
		this.salary = salary;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Manager [ " + manager_id + ",  " + m_name + ", " + salary + " ]";
	}
	
	
	
	

}
