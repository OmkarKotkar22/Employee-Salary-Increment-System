/*2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
*/

package Salary;

import java.util.*;
public class Employee_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		
		Employee emp[] = new Employee[size];
		
		String Name =" ", Department = " ";
		int Id = 0, Salary = 0;
		
		for(int i = 0; i < emp.length; i++)
		{
			emp[i] = new Employee();
			System.out.println("Enter the Name: ");
			Name = sc.next();
			
			System.out.println("Enter the Salary: ");
			Salary = sc.nextInt();
			
			System.out.println("Enter the Department: ");
			Department = sc.next();
			
			emp[i].setName(Name);
			emp[i].setSalary(Salary);
			emp[i].setDepartment(Department);
			
			System.out.println(emp[i].getId() + "\t" + emp[i].getName() + "\t" + emp[i].getSalary() + "\t"+ emp[i].getDepartment());
		}
		
		for(int i = 0; i < emp.length; i++)
		{
			int incSalary = Salary + (Salary * 10/100);
			System.out.println("Increase the employee's salary by 10%:" + incSalary);
		}
	}
}
