/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Project 6).
 * Class that represent the customer.
 * Due: 5/6/2022 & 5/13/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class Customer {
	private String name;
	private int age;
	
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
		
	}

	public Customer(Customer c) {
		this.age = c.age;
		this.name = c.name;
	}

	// String representation of the Customer including the name and age.
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

	// Several getters and setters.
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
