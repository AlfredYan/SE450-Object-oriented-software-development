/***
 * Liskvo Substitution Principle
 * Function that use pointers or references to base classes must be able
 * to use objects of derived classes without knowing it.
 * @author KYAN4
 *
 */
//Origin Code
//class Rectangle { 
//	private double height; 
//	private double width; 
//	public setHeight(double newHeight) { height = newHeight; } 
//	public setWidth(double newWidth) { width = newWidth; } 
//	public double getHeight() { return height; } 
//	public double getWidth() { return width; } 
//} 
//public class Main { 
//	public static void main (String[] args) { 
//		Rectangle r = new Rectangle(); 
//		setInitialHeightAndWidth(r); 
//	} 
//	public static void setInitialHeightAndWidth(Rectangle r){ 
//		r.setHeight(5); r.setWidth(10); 
//	} 
//} 


interface Quadrilateral{
	void setInitialHeightAndWidth();
}

class LSPSquare implements Quadrilateral{
	private double sideLength;
	public void setInitialHeightAndWidth(){
		sideLength = 10;
	}
}

class LSPRectangle implements Quadrilateral{ 
	private double height; 
	private double width; 
	public void setHeight(double newHeight) { height = newHeight; } 
	public void setWidth(double newWidth) { width = newWidth; } 
	public double getHeight() { return height; } 
	public double getWidth() { return width; } 
	public void setInitialHeightAndWidth(){
		setHeight(5);
		setWidth(10);
	}
} 

public class LiskvoSubstitutionPrinciple {
	public static void main (String[] args) { 
		Quadrilateral r = new LSPRectangle(); 
		r.setInitialHeightAndWidth();
	} 
}
