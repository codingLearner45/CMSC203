/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Classes Lab 9A).
 * Classes that set up information about the employee.
 * Due: 4/15/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;
	
	public Employee(String n, String num, String date)
	{
		name = n;
		employeeNumber = num;
		hireDate = date; 
	}
	public Employee()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	private boolean isValidEmpNum(String e) //ensures the employee number is valid
	{
		if(e.length() == 5 && Character.isDigit(e.charAt(0)) && Character.isDigit(e.charAt(1)) 
				&& Character.isDigit(e.charAt(2)) && e.contains("-") && Character.isLetter(e.charAt(4)))
		{
			return true;
		}
		return false;
	}
	
	
	public String toString() //displays message
	{
		return "Hiredate: " + hireDate + "\n" + "Name: " + name + "\n"
				+ "EmployeeNumber: " + employeeNumber;
	}
	
	
}
