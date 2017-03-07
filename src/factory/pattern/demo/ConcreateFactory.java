package factory.pattern.demo;

public class ConcreateFactory extends AnimalFactory {

	@Override
	public IAnimal GetAnimalType(String type) throws Exception {
		switch (type) {
		case "Duck":
			return new Duck();
		case "Tiger":
			return new Tiger();
			
		default:
			throw new Exception("Animal type : "+ type +"cannot be instantiated");
		}
	}

}
