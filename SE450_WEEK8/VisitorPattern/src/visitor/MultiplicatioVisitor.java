package visitor;

public class MultiplicatioVisitor implements IVisitor {

	@Override
	public int visit(Leaf leaf) {
		return leaf.payload;
	}

	@Override
	public int visit(Composite composite) {
		int sum = composite.payload;
		for(IComposite child : composite.children) {
			System.out.println("payload: " + child.accept(this));
			sum *= child.accept(this);
			System.out.println("multi: " + sum);
		}
		
		return sum;
	}

	@Override
	public int visit(DoubleLeaf doubleLeaf) {
		return doubleLeaf.payload;
	}

}
