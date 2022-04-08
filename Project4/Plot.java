import java.awt.geom.Rectangle2D;

/*
 * Class: CMSC203 


 * Instructor: Gary Thai
 * Description: Project 4.
 * Instance variables to represent the x and y coordinates of the upper left corner of the location, 
 * and depth and width to represent the vertical and horizontal extents of the plot.
 * Due: 4/8/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the project assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/

public class Plot {
	private int x;	
	private int y;
	private int width;
	private int depth;

	//no-arg constructor that creates the default plot
	public Plot()
	{
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	//Copy constructor that creates a new plot with new information
	public Plot(Plot p)
	{
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	//Parameterized constructor that creates a new plot with parameters
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	//checks if a plot overlaps with another plot
	public boolean overlaps(Plot plot)
	{
		Rectangle2D rectangle1 = new Rectangle2D.Double(this.x, this.y, this.width, this.depth);
		Rectangle2D rectangle2 = new Rectangle2D.Double(plot.x, plot.y, plot.width, plot.depth);
		return rectangle1.intersects(rectangle2);
		//return false;
	}
	
	//checks if a plot encompasses another plot
	public boolean encompasses(Plot plot)
	{
		//RectangularShape r1 = RectangularShape();
		Rectangle2D rectangle1 = new Rectangle2D.Double(this.x, this.y, this.width, this.depth);
		Rectangle2D rectangle2 = new Rectangle2D.Double(plot.x, plot.y, plot.width, plot.depth);
		return rectangle1.contains(rectangle2);
		//return false;
	}
	
	//gets the x-coordinate of a plot
	public int getX() {
		return x;
	}

	//changes the x-coordinate of a plot
	public void setX(int x) {
		this.x = x;
	}

	//gets the y-coordinate of a plot
	public int getY() {
		return y;
	}

	//changes the y-coordinate of a plot
	public void setY(int y) {
		this.y = y;
	}

	//gets the width of a plot
	public int getWidth() {
		return width;
	}

	//changes the width of a plot
	public void setWidth(int width) {
		this.width = width;
	}

	//gets the depth of a plot
	public int getDepth() {
		return depth;
	}

	//changes the depth of a plot
	public void setDepth(int depth) {
		this.depth = depth;
	}

	//prints the name of the city, owner, property name, and rent amount
	@Override
	public String toString() {
		return "Upper left: " + "(" + x + "," + y + "); Width: " + width + " " + "Depth: " + depth;
		//Upper left: (1,1); Width: 3 Depth: 3 
	}
	
	
}
