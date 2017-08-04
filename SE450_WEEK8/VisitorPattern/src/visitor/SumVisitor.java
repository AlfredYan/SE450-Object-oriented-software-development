package visitor;

public class SumVisitor implements IVisitor{

	@Override
	public int visit(Leaf leaf) {
		return leaf.payload;
	}

	@Override
	public int visit(Composite composite) {
		int sum = composite.payload;
		for(IComposite child : composite.children) {
			sum += child.accept(this);
		}
		
		return sum;
	}

	@Override
	public int visit(DoubleLeaf doubleLeaf) {
		return doubleLeaf.payload;
	}

}
