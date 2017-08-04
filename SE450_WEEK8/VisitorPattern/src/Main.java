import visitor.CompositeFactory;
import visitor.IComposite;
import visitor.IVisitor;
import visitor.VisitorFactory;
/***
 * Visitor Pattern
 * 
 * 1.The object structure you will be operating on should be implement a common interface ('IComposite' in this demo).
 * 2.Each visitor will implements a common interface('IVisitor' in this demo).The interface will
 * 	 specify a visit method for each concrete element you want to support('visit(Leaf leaf)'... in this demo).
 * 3.The element's interface('IComposite') will define an accept method('accept(IVisitor visitor)' in this demo) that accepts a visitor
 *   interface as a parameter.Inside each concrete element's accept method, the element will call the visit method and pass 'this' as
 *   its argument.
 * 
 * The Visitor Pattern uses Double Dynamic Dispatch to choose the right method based on 
 * both the type calling the method and the type being passed in as an argument.
 * Use Visitor Pattern when you want to add functionality to an Element structure without wanting update the Elements.
 * 
 * benefits:
 * 1. Add operations to structured objects easily.
 * 2. Adding new operations is relatively easy and aided by the compiler.
 * 
 * shortcomings: 
 * 1.Tight coupling between the visitor and the concrete elements.(the parameter of visit() is concrete type).
 * 2.Difficult with adding a new type of Element.
 * 
 * 
 * @author kaichengyan
 *
 */

public class Main {

	public static void main(String[] args) {
		IComposite composite = CompositeFactory.BuildComposite();
		IVisitor sumVisitor = VisitorFactory.getSumVisitor();
		IVisitor multVisitor = VisitorFactory.getMutiVisitor();
		
		
		/**
		 *  the accept() depends on two different concrete types
		 *  It's double dispatch
		 */
		int sumResult = composite.accept(sumVisitor);
		int multResult = composite.accept(multVisitor);
		System.out.println("sum: " + sumResult);
		System.out.println("multiplication: " + multResult);
	}
}
