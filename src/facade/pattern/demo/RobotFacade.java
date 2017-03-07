package facade.pattern.demo;

public class RobotFacade {
	RobotColor rColor;
	RobotBody rBody;
	RobotMetal rMetal;
	
	public RobotFacade() {
		rColor = new RobotColor();
		rBody = new RobotBody();
		rMetal = new RobotMetal();
	}
	
	public void ConstructRobot(String color,String metal){
		System.out.println("Creation of the robot start");
		rColor.SetColor(color);
		rMetal.SetMetal(metal);
		rBody.CreateBody();
		System.out.println("\nRobot creation end");
		System.out.println();
		
	}
	
}
