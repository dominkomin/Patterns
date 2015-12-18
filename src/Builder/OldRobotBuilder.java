package Builder;

//The concrete builder class that assembles the parts 
//of the finished Robot object

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {
		
		this.robot = new Robot();
		
	}
	
	public OldRobotBuilder buildRobotHead() {
		
		robot.setRobotHead("Tin Head");
		return this;
	}

	public OldRobotBuilder buildRobotTorso() {
		
		robot.setRobotTorso("Tin Torso");
		return this;
	}

	public OldRobotBuilder buildRobotArms() {
		
		robot.setRobotArms("Blowtorch Arms");
		return this;
	}

	public OldRobotBuilder buildRobotLegs() {
		
		robot.setRobotLegs("Rollar Skates");
		return this;
		
	}

	public Robot getRobot() {
		
		return this.robot;
	}
	
	
	
}