package visitor;


public class DoubleLeaf implements IComposite {

	int payload;
	
	public DoubleLeaf(int payload) {
		payload *= 2;
		this.payload = payload;
		System.out.println(this.payload);
	}
	
	@Override
	public int accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
