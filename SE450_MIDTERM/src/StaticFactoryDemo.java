// CAN NOT RUN
public class StaticFactoryDemo {

}

public interface IShape { };
class Circle implements IShape {
	public Circle(int radius) { }
}
class Square implements IShape {
	public Square(int sideLength) { }
}
class Rectangle implements IShape {
	public Rectangle(int width, int height) { }
}

class ShapeFactory {
	public static IShape createCircle(int radius) {
		return new Circle(radius);
	}
	
	public static IShape createSquare(int sideLength) {
		return new Square(sideLength);
	}
	
	public static IShape createRectangle(int width, int height) {
		return new Rectangle(width, height);
	}
}