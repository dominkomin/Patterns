package AbstractFactory;

//Here is where you define the parts that are required
//if an object wants to be an enemy ship
public interface ESEngine{

	// User is forced to implement this method
	// It outputs the string returned when the 
	// object is printed
	
	public String toString();

}