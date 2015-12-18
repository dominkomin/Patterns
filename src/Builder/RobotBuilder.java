package Builder;

//Defines the methods needed for creating parts 
//for the robot
public interface RobotBuilder {
	
	public RobotBuilder buildRobotHead();
	
	public RobotBuilder buildRobotTorso();
	
	public RobotBuilder buildRobotArms();
	
	public RobotBuilder buildRobotLegs();
	
	public Robot getRobot();
	
}