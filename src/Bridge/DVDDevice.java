package Bridge;

//Concrete Implementor

//Here is an implementation of the EntertainmentDevice
//abstract class. I'm specifying what makes it different
//from other devices

public class DVDDevice extends EntertainmentDevice
{

	public DVDDevice(int newDeviceState, int newMaxSetting)
	{

		super.deviceState = newDeviceState;

		super.maxSetting = newMaxSetting;

	}

	public void increaseChannel()
	{

		System.out.println("DVD Skips to Chapter");

		deviceState--;

	}

	public void decreaseChannel()
	{

		System.out.println("DVD Skips to Next Chapter");

		deviceState++;

	}

}
