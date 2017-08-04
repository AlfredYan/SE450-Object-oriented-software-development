package visitor;

import java.util.ArrayList;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators.ChildrenIterator;

public class Composite implements IComposite {
	public int payload;
	public ArrayList<IComposite> children = new ArrayList<IComposite>();
	
	public Composite(int payload) {
		this.payload = payload;
	}
	
	public void addChild(IComposite child) {
		children.add(child);
	}

	@Override
	public int accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
