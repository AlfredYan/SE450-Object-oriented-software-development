/***
 * Open-closed Principle
 * @author KYAN4
 *
 */

interface Shape{
	String getShape();
}

class Circle implements Shape{
	Circle(int radius){ /* ... */}
	public String getShape(){
		return "Circle";
	}
}

class Rectangle implements Shape{
	Rectangle(int height, int width){ /* ... */}
	public String getShape(){
		return "Rectangle";
	}
}

class Triangle implements Shape{
	Triangle(int a, int b, int c){ /* ... */}
	public String getShape(){
		return "Triangle";
	}
}

public class OpenClosedPrinciple {
	
	public static void main(String[] args){
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(1);
		shapes[1] = new Rectangle(1, 2);
		shapes[2] = new Triangle(1, 2, 3);
		writeShapes(shapes);
	}
	
	public static void writeShapes(Shape[] shapes){
		
		for(Shape shape : shapes){
			System.out.println(shape.getShape());
		}
		
		//violate OCP, when add a new shape, the writeShapes() must to be modified.
//		for(Shape shape : shapes){
//			if(shape instanceof Circle) System.out.println("Circle");
//			else if(shape instanceof Rectangle) System.out.println("Rectangle");
//			else if(shape instanceof Triangle) System.out.println("Triangle");
//		}
	}
}
