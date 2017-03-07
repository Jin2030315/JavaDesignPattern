package factory.pattern.demo;

public abstract class AnimalFactory {
	/**
	 * If we cannot instantiate in late stage, we'll throw exception
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public abstract IAnimal GetAnimalType(String type) throws Exception;
}
