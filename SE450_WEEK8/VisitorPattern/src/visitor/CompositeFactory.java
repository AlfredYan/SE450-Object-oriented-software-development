package visitor;

public class CompositeFactory {

	public static IComposite BuildComposite() {
    	Composite composite = new Composite(34);
        composite.addChild(new Leaf(22));
        composite.addChild(new Leaf(46));
        composite.addChild(new Leaf(83));
        Composite composite1 = new Composite(78);
        composite.addChild(composite1);
        composite1.addChild(new Leaf(38));
        composite1.addChild(new Leaf(12));
        composite1.addChild(new Leaf(7));
        composite1.addChild(new Leaf(75));
        Composite composite2 = new Composite(84);
        composite.addChild(composite2);
        composite2.addChild(new Leaf(5));
        composite2.addChild(new Leaf(49));
        composite2.addChild(new DoubleLeaf(2));
        return composite;
        //sum: 537
        //multiplication: 508553216
    }
}
