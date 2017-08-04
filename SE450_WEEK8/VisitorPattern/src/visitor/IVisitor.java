package visitor;

public interface IVisitor {

	int visit(Leaf leaf);
	int visit(Composite composite);
	int visit(DoubleLeaf doubleLeaf);
}
