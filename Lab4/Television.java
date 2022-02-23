/*
 * Class: CMSC203 

 * Instructor: Gary Thai
 * Description: (Classes Lab 4).
 * Declaring a new class, creating a constructor and writing instance methods.
 * Due: 2/25/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
public class Television {
	//stores brand name	
	private String Manufacturer;
	//stores size of television screen
	private int screenSize;
	//stores true or false based on if power is on or off
	private boolean powerOn;
	//stores value of the station
	private int channel;
	//stores a number that represents the loudness of the television
	private int volume;
	
	//constructor for this class
	public Television(String manufacturer, int screenSize) {
		this.Manufacturer = manufacturer;
		this.screenSize = screenSize;
		this.volume = 20;
		this.channel = 2;
		this.powerOn = false;
	}
	
	public String getManufacturer() {
		return Manufacturer; //returns the value of the manufacturer variable
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;//sets the value of the manufacturer variable
	}

	public int getScreenSize() {
		return screenSize; //returns the value of the screenSize variable
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize; //sets the value of the screenSize variable
	}

	public boolean isPowerOn() {
		return powerOn; //returns the boolean of the power variable
	}

	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn; //sets the boolean of the powerOn variable
	}

	public int getChannel() {
		return channel; //returns the value of the channel variable
	}

	public void setChannel(int channel) {
		this.channel = channel; //sets the value of the boolean variable
	}

	public int getVolume() {
		return volume; //returns the value of the volume variable
	}

	public void setVolume(int volume) {
		this.volume = volume; //sets the value of the channel variable
	}

	public void power() {
		// If on -> turn off
		if (powerOn)
			this.powerOn = false;
		// If off -> turn on
		if (!powerOn)
			this.powerOn = true;
	}
	
	public void increaseVolume() {
		// Increment volume
		if(volume >= 100)
			return;
		else
			volume++;
	}
	
	public void decreaseVolume() {
		// Decrement volume
		if(volume <= 0)
			return;
		else
			volume--;
	}
}
