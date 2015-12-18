package Bridge;

//Implementor
//With the Bridge Design Pattern you create 2 layers of abstraction
//In this example I'll have an abstract class representing
//different types of devices. I also have an abstract class
//that will represent different types of remote controls

//This allows me to use an infinite variety of devices and remotes

abstract class EntertainmentDevice {
	
	public int deviceState;
	
	public int maxSetting;
	
	public int volumeLevel = 0;
	
	public abstract void increaseChannel();
	
	public abstract void decreaseChannel();
	
	public void deviceFeedback() {
		
		if(deviceState > maxSetting || deviceState < 0) { deviceState = 0; }
		
		System.out.println("On Channel " + deviceState);
		
	}
	
	public void increaseVolume() {
		
		volumeLevel++;
		
		System.out.println("Volume at: " + volumeLevel);
		
	}
	
	public void decreaseVolume() {
		
		volumeLevel--;
		
		System.out.println("Volume at: " + volumeLevel);
		
	}
	
}
