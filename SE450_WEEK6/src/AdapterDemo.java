/***
 * Adapter Pattern
 * 
 * It is used to make some other code that you can't modify work with your application as you need it to.
 * Wrap what you need into your own class/interfaces, and your application uses the class you created.
 * 
 * @author kaichengyan
 *
 */
package ThirdPartyPackage;
public interface IShape {
	int getCircumference();
	int getArea();
}
public class ShapeFactory {
	public static IShape createTriangle() { };
	public static IShape createCircle() { };
	public static IShape createSquare() { };
}



package MyPackage;

//Adapter interface
public interface IShape {
	Color getColor();
	int getCircumference();
	int getArea();
}

// Adapter class
public class Triangle implements MyPackage.IShape {
	private Color color;
	private ThirdPartyPackage.IShape shape;
	
	public Triangle(Color color) {
		this.color = color;
		shape = ShapeFactory.createTriangle();
	}
	
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public int getCircumference() {
		return shape.getCircumference();
	}

	@Override
	public int getArea() {
		return shape.getArea();
	}
}

//Adapter class
public class Circle implements MyPackage.IShape {
	private Color color;
	private ThirdPartyPackage.IShape shape;
	
	public Circle(Color color) {
		this.color = color;
		shape = ShapeFactory.createCircle();
	}
	
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public int getCircumference() {
		return shape.getCircumference();
	}

	@Override
	public int getArea() {
		return shape.getArea();
	}
}

//Adapter class
public class Square implements MyPackage.IShape {
	private Color color;
	private ThirdPartyPackage.IShape shape;
	
	public Square(Color color) {
		this.color = color;
		shape = ShapeFactory.createSquare();
	}
	
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public int getCircumference() {
		return shape.getCircumference();
	}

	@Override
	public int getArea() {
		return shape.getArea();
	}
}

public class Client {
	public void processShape(MyPackage.IShape shape) {
		int randomNumber = shape.getCircumference() + shape.getArea();
		System.out.println(shape.getColor() + randomNumber);
	}
}


public class AdapterDemo {

}
