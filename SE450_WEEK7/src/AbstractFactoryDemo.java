/***
 * Abstract Factory Pattern
 * 
 * 1.Create an interface(ICarFactory) with several related creational methods.
 * 2.Create concrete factories that implement those creational methods
 * 
 * Use an Abstract Factory Pattern, when there is a whole suite of related class, that each needs factories. 
 * 
 * @author kaichengyan
 *
 */
public class AbstractFactoryDemo {

}

// Abstract factory pattern
interface ICarFactory {
	IEngine createEngine();
	ICarBody createCarBody();
	IWheels createWheels();
}

class NissanFactory implements ICarFactory {

	@Override
	public IEngine createEngine() {
		return new NissanEngine();
	}

	@Override
	public ICarBody createCarBody() {
		return new NissanCarBody();
	}

	@Override
	public IWheels createWheels() {
		return new NissanWheels();
	}
}

class ToyotaFactory implements ICarFactory {

	@Override
	public IEngine createEngine() {
		return new ToyotaEngine();
	}

	@Override
	public ICarBody createCarBody() {
		return new ToyotaCarBody();
	}

	@Override
	public IWheels createWheels() {
		return new ToyotaWheels();
	}
}


interface IEngine{}
interface ICarBody{}
interface IWheels{}

class NissanEngine implements IEngine{}
class NissanCarBody implements ICarBody{}
class NissanWheels implements IWheels{}

class ToyotaEngine implements IEngine{}
class ToyotaCarBody implements ICarBody{}
class ToyotaWheels implements IWheels{}
