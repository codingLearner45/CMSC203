/*
 * Class: CMSC203 


 * Instructor: Gary Thai
 * Description: (Classes Lab 9A).
 * Classes created to set up information about production worker.
 * Due: 4/15/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class ProductionWorker extends Employee{
	
	private int shift;
	private double payRate;
	public final static int DAY_SHIFT = 1;
	public final static int NIGHT_SHIFT = 2;
	public ProductionWorker(String n, String num, 
			String date, int sh, double rate)
	{
		super(n, num, date);
		shift = sh;
		payRate = rate;
		
		
	}
	public ProductionWorker()
	{
		super();
	}
	public int getShift() { //obtains shift
		return shift;
	}
	public void setShift(int shift) { //changes shift
		this.shift = shift;
	}
	public double getPayRate() { //obtains pay rate
		return payRate;
	}
	public void setPayRate(double payRate) { //changes pay rate
		this.payRate = payRate;
	}
	public String toString() //displays message
	{
		return super.toString() + "\n" + "Shift:" + shift + "\n" 
				+ "payRate: " + payRate;
	}
}
