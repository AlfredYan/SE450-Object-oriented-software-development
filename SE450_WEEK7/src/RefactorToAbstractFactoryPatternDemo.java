/**
 * Abstract Factory Pattern
 * 
 * Since Abstract Factories have instances, 
 * you can pass them around as method or constructor parameters.
 * 
 * @author kaichengyan
 *
 */


/*refactor the static factory to abstract factory*/

//public class IShapeFactory { 
//	public static IShape createCircle(){ 
//		return new Circle(); 
//	} 
//	public static IShape createSquare(){ 
//		return new Square(); 
//	} 
//	public static IShape createTriangle(){ 
//		return new Triangle(); 
//	} 
//}

public class RefactorToAbstractFactoryPatternDemo {

}

interface IShapeFactory {
	IShape createCircle();
	IShape createSquare();
	IShape createTriangle();
}

class ShapeFactory implements IShapeFactory {

	@Override
	public IShape createCircle() {
		return new Circle();
	}

	@Override
	public IShape createSquare() {
		return new Square();
	}

	@Override
	public IShape createTriangle() {
		return new Triangle();
	}
	
}

class SomeOtherShapeFactory implements IShapeFactory {

	@Override
	public IShape createCircle() {
		return new OtherCircle();
	}

	@Override
	public IShape createSquare() {
		return new OtherSquare();
	}

	@Override
	public IShape createTriangle() {
		return new OtherTriangle();
	}
	
}

interface IShape{}

class Circle implements IShape{}
class Square implements IShape{}
class Triangle implements IShape{}

class OtherCircle implements IShape{}
class OtherSquare implements IShape{}
class OtherTriangle implements IShape{}
