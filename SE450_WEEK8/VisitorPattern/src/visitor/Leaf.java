package visitor;

public class Leaf implements IComposite {
	
	public int payload;
	
	public Leaf(int payload) {
		this.payload = payload;
	}

	@Override
	public int accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
