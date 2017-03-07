package facade.pattern.demo;

public class FacadePatternEx {

	/***
	 * 1.Facade pattern to represent a simple interface instead of a complex subsystem.
	 * 2.Not only make the system easier to use but also reduce the number of objects that
	 *   the clients need to deal with.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("****Facade Pattern Demo****");
		RobotFacade rFacade = new RobotFacade();
		rFacade.ConstructRobot("Green", "Iron");
		
		RobotFacade rFacade2 = new RobotFacade();
		rFacade2.ConstructRobot("Blue", "Steel");
	}

}
