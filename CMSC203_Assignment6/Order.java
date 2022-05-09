/*
 * Class: CMSC203

 * Instructor: Gary Thai
 * Description: (Project 6).
 * Class that represent the order and its information. Implements OrderInterface, Comparable interface.
 * Due: 5/6/2022 & 5/13/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable{

	private int orderNumber;
	private int orderTime;
	private DAY orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages;
	private boolean weekend;
	
	public Order(int orderTime, DAY orderDay, Customer customer) {
		this.orderNumber = genOrderNo();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = customer;
		this.beverages = new ArrayList<>();
//		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)
//			this.weekend = true;
//		else 
//			this.weekend = false;
	}

	// Generates a random order Number.
	public int genOrderNo() {
		Random random = new Random();
		int orderNumber = random.nextInt(90_000 - 10_000) + 10_000;
		return orderNumber; 
	}
	
	public int getOrderNo() {
		return orderNumber;
	}

	public void setOrderNo(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}

	public void setBeverages(ArrayList<Beverage> beverages) {
		this.beverages = beverages;
	}

	@Override
	public boolean isWeekend() {
		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)
			return true;
		return weekend;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		return beverages.get(itemNo);
	}

	// Overriden method that adds a new type of beverage and returns it.
	@Override
	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);
		beverages.add(coffee);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size) {
		boolean isWeekend = false;
		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)
			isWeekend = true;
		Alcohol alcohol = new Alcohol(bevName, size, isWeekend);
		beverages.add(alcohol);
	}

	@Override
	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addProtien);
		beverages.add(smoothie);
	}
	
	// String representation of the Customer including the name and age.
	@Override
	public String toString() {
		return "Order [orderNumber=" + getOrderNo() + ", orderTime=" + orderTime + ", orderDay=" + orderDay
				+ ", customerName=" + customer.getName() + ", customerAge=" + customer.getAge() + ", beverages=" + beverages +  ", orderTotal=" + calcOrderTotal() + "]";
	}

	// Calculates the total of the order.
	@Override
	public double calcOrderTotal() {
		double orderTotal = 0.0;
		for(Beverage beverage : beverages) {
			orderTotal += beverage.calcPrice();
		}
		return orderTotal;
	}

	// Returns the next highest Beverage Tyoe, If the TYPE matches the one passed.
	@Override
	public int findNumOfBeveType(TYPE type) {
		int numBevType = 0;
		for(Beverage beverage : beverages) {
			if(beverage.getType() == type)
				numBevType++;
		}
		return numBevType;
	}

	// Based on the resutls of comparing the order number returns a 0, 1, or -1.
	@Override
	public int compareTo(Object o) {
		if (this.orderNumber == ((Order) o).getOrderNo())
		{
			return 0;
		}
		else if (this.orderNumber > ((Order) o).getOrderNo())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

	// Several getters and setters.
	public int getTotalItems() {
		return beverages.size();
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getOrderTime() {
		return orderTime;
	}

	public DAY getOrderDay() {
		return orderDay;
	}
}
