package Bridge;

//Abstraction

//This is an abstract class that will represent numerous
//ways to work with each device

public abstract class RemoteControl
{

	// A reference to a generic device using aggregation

	private EntertainmentDevice theDevice;

	public RemoteControl(EntertainmentDevice newDevice)
	{
		theDevice = newDevice;
	}

	public void buttonFivePressed()
	{
		theDevice.increaseChannel();
	}

	public void buttonSixPressed()
	{
		theDevice.decreaseChannel();
	}

	public void buttonSevenPressed()
	{
		theDevice.increaseVolume();
	}

	public void buttonEightPressed()
	{
		theDevice.decreaseVolume();
	}

	public void deviceFeedback()
	{
		theDevice.deviceFeedback();
	}

	public abstract void buttonNinePressed();
}
