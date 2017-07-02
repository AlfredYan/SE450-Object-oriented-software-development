/***
 * Late Binding
 * The actual method being called is determined at runtime, based on the Object's actual type.
 * @author KYAN4
 *
 */
interface Colored{
	String getColor();
}
interface Point{
	double getX();
	double getY();
}
final class CartesianPoint implements Colored, Point{
	private double x;
	private double y;
	private String color;
	
	CartesianPoint(double x, double y, String color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	public String getColor(){
		System.out.println("CartesianPoint color is " + this.color);
		return this.color;
	}
}

final class PolarPoint implements Colored, Point{
	private double x;
	private double y;
	private String color;
	
	PolarPoint(double x, double y, String color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	public String getColor(){
		System.out.println("PolarPoint color is " + this.color);
		return this.color;
	}
}

public class LateBinding {
	public static void main(String[] args){
		CartesianPoint cp = new CartesianPoint(100.5, 100.2, "RED");
		PolarPoint pp = new PolarPoint(200.4, 200.0, "YELLOW");
		printColor(cp);
		printLocation(cp);
		printColor(pp);
		printLocation(pp);
		
	}
	
	public static void printColor(Colored colorObject){
		colorObject.getColor();
	}
	
	public static void printLocation(Point pointObject){
		double x = pointObject.getX();
		double y = pointObject.getY();
		System.out.println("Location is " + "(" + x + ", " + y + ")");
	}
}
