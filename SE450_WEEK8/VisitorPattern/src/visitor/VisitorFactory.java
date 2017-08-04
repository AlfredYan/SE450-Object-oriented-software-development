package visitor;

public class VisitorFactory {

	public static IVisitor getSumVisitor() {
		return new SumVisitor();
	}
	
	public static IVisitor getMutiVisitor() {
		return new MultiplicatioVisitor();
	}
}
