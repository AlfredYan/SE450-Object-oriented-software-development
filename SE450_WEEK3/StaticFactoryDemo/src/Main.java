import FactoryDemo.*;

/***
 * Static Factory demo
 * 1.Make interface that classes implement public
 * 2.Make those class package-private
 * 3.Provide a public class(factory) which do actual creation of the objects
 * 
 * static factory decouple the dependency between consumer and concrete classes.
 * When add a new class, just update the factory.
 * @author KYAN4
 *
 */

public class Main {

	public static void main(String[] args) {
		String shapeType = "triangle";
		
		// only know declared type, not expose the actual type
		IShape shape = ShapeFactory.createShape(shapeType);
		
		System.out.println(shape.getString());
	}

}
