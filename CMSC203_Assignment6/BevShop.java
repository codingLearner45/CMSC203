/*

 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: (Project 6).
 * This class represents a beverage shop and implements the BevShopInterface.
 * Contains several overridden functions.
 * Due: 5/6/2022 & 5/13/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class BevShop implements BevShopInterface{
	
	private int numberOfAlcohol;
	private ArrayList<Order> orders;
	private int currentOrderIndex;
	
	public BevShop()
	{
		orders = new ArrayList<>();
	}
	
	/*
	 * Boolean function that compares times and returns a true of the 
	 * passed in time is between MAX and MIN time.
	*/
	@Override
	public boolean validTime(int time) {
		if (time >= MIN_TIME && time <= MAX_TIME)
		{
			return true;
		}
		return false;
	}

	// Boolean function that returns true of false based on whether the number of Alcoholic 
	// drinks ordered is less than the MAX_ORDER_FOR_ALCOHOL (3).
	@Override
	public boolean eligibleForMore() {
		if(numberOfAlcohol < MAX_ORDER_FOR_ALCOHOL)
		{
			return true;
		}
		return false;
	}

	// Boolean function that checks for the MIN_AGE_FOR_ALCOHOL (21) and 
	// returns a true if the age is greater than 21 or else a false.
	@Override
	public boolean validAge(int age) {
		if(age > MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}
		return false;
	}

	// Starts a new order.
	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		Customer customer = new Customer(customerName, customerAge);
		Order order = new Order(time, day, customer);
		orders.add(order);
		currentOrderIndex = orders.indexOf(order);
		numberOfAlcohol = 0;
	}

	// Processes the coffee order.
	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}

	// Processes the alcohol order.
	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size);
		this.numberOfAlcohol++;
	}

	// Processes the smoothie order.
	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, numOfFruits, addProtien);
	}

	// Find and returns the order.
	@Override
	public int findOrder(int orderNo) {
		for(int i = 0; i < orders.size(); i++)
		{
			if(orders.get(i).getOrderNo() == orderNo)
			{
				return i;
			}
		}
		return -1;
	}

	// Computes the total price of the order.
	@Override
	public double totalOrderPrice(int orderNo) {
		double total = 0.0;
		for(Order order:orders)
		{
			if(order.getOrderNo() == orderNo)
			{
				for(Beverage beverage: order.getBeverages())
				{
					total += beverage.calcPrice();
				}
			}
		}
		return total;
	}

	// Computers the total monthly sale.
	@Override
	public double totalMonthlySale() {
		double total = 0.0;
		for(Order order:orders)
		{
				for(Beverage beverage: order.getBeverages())
				{
					total += beverage.calcPrice();
				}
		}
		return total;
	}

	// Sorts the orders.
	@Override
	public void sortOrders() {		
		for(int i = 0; i < orders.size() - 1; i++) {
			int min = i;
			for(int j = i + 1; j < orders.size(); j++) {
				if(orders.get(j).getOrderNo() < orders.get(min).getOrderNo()) {
					min = j;
				}
			}
			Order swap = orders.get(min);
			orders.set(min, orders.get(i));
			orders.set(i, swap);
		}
	}

	@Override
	public Order getOrderAtIndex(int index) {
		
		return orders.get(index);
	}

	public Order getCurrentOrder() {
		return orders.get(currentOrderIndex);
	}

	public Object totalNumOfMonthlyOrders() {
		return orders.size();
	}

	public int getNumOfAlcoholDrink() {
		return numberOfAlcohol;
	}

	public boolean isMaxFruit(int i) {
		return i > MAX_FRUIT;
	}

	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}

	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}

	// String representation of all the orders and the total monthly sale.
	@Override
	public String toString() {
		return "BevShop [orders=" + orders + ", totalSales="
				+ totalMonthlySale() + "]";
	}
	
	
}
