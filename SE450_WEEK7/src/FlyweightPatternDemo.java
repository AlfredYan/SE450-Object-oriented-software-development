import java.awt.Color;
/***
 * Flyweight Pattern
 * 
 * Encapsulate what doesn't vary.
 * Put the parts that do vary into their own object with a reference to the one object that doesn't vary.
 * 
 * @author kaichengyan
 *
 */
public class FlyweightPatternDemo {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		
		CarFlyweight newCar = factory.createCar();
		CarFlyweight newSuv = factory.createSuv();
		CarFlyweight newTruck = factory.createTruck();
	}
}

class Car {
	public Color color;
	public int length;
	public Color getColor() {
		return color;
	}
}

// Flyweight Pattern
class CarFlyweight {
	private int _position;
	private int _velocity;
	private Car _car;
	
	public void setCar(Car car) {
		_car = car;
	}
	
	public int getPosition() {
		return _position;
	}
	
	public int getVelocity() {
		return _velocity;
	}
	
	public Color getColor() {
		return _car.getColor();
	}
}

class CarFactory {
	private final Car car = new Car();
	private final Car suv = new Car();
	private final Car truck = new Car();
	
	public CarFactory() {
		car.color = Color.BLUE;
		car.length = 8;
		suv.color = Color.GREEN;
		suv.length = 10;
		truck.color = Color.RED;
		truck.length = 25;
	}
	
	public CarFlyweight createCar() {
		CarFlyweight newCar = new CarFlyweight();
		newCar.setCar(this.car);
		return newCar;
	}
	
	public CarFlyweight createSuv() {
		CarFlyweight newSuv = new CarFlyweight();
		newSuv.setCar(this.suv);
		return newSuv;
	}
	
	public CarFlyweight createTruck() {
		CarFlyweight newTruck = new CarFlyweight();
		newTruck.setCar(this.truck);
		return newTruck;
	}
}
