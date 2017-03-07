package factory.pattern.demo;

public class FactoryPatternEx {

	/***
	 * Advantage:
	 * Factory pattern is useful when our classes shift the responsibility of 
	 * objects creation to its subclasses
	 * This pattern is also useful when implement parallel class hierarchies
	 * and when making a system with loose coupling is possible
	 * 
	 * Disadvantage:
	 * Need to address is that making too many objects often can decrease
	 * performance
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("***Factory Pattern Demo***");
		AnimalFactory animalFactory = new ConcreateFactory();
		
		IAnimal duckType;
		try {
			duckType = animalFactory.GetAnimalType("Duck");
			duckType.Speak();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		IAnimal tigerType;
		try {
			tigerType = animalFactory.GetAnimalType("Tiger");
			tigerType.Speak();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		IAnimal lionType;
		try {
			lionType = animalFactory.GetAnimalType("Lion");
			lionType.Speak();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
