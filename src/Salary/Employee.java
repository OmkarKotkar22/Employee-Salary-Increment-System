package Salary;

public class Employee {
	private static int counter= 0;
	private int id;
	private String name;
	private int salary;
	private String department;
	
	public Employee()
	{
		counter++;
		id = counter;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int sal)
	{
		salary = sal;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public void setDepartment(String depart)
	{
		department = depart;
	}
	public String getDepartment()
	{
		return department;
	}
}
