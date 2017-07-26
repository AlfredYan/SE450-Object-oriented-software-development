/***
 * Null Object Pattern
 * 
 * Provide default behavior that can be used in place of null in code.
 * Since the Null Object isn't null, it won't throw NullReferenceExceptions.
 * 
 * @author kaichengyan
 *
 */
public class NullObjectDemo {
	private ISomeBehavior _behavior;
	
	public NullObjectDemo(ISomeBehavior behavior) {
		// use a Null Object to check for null in one place
		if(behavior == null)
			_behavior = new NullSomeBehavior();
		else
			_behavior = behavior;
	}
}

interface ISomeBehavior {
	void doBehavior();
	void doDifferentBehavior();
	void doAnotherThing();
}

class SomeBehavior implements ISomeBehavior {
	@Override
	public void doBehavior() {
		// do something
	}
	@Override
	public void doDifferentBehavior() {
		// do something
	}
	@Override
	public void doAnotherThing() {
		// do something
	}
}

class NullSomeBehavior implements ISomeBehavior {
	@Override
	public void doBehavior() {
		// do nothing
	}
	@Override
	public void doDifferentBehavior() {
		// do nothing
	}
	@Override
	public void doAnotherThing() {
		// do nothing
	}
}
