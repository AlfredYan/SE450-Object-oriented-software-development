import java.util.ArrayList;
/***
 * Singleton Pattern
 * 
 * 1.Make the constructor of the Singleton Object private.
 * 2.Have publicly accessible static methods for getting the object or calling the methods on the object.
 * 
 * 
 * When you have a single instance of an object and other instances can't be initialized.
 * The single instance can be accessed statically.
 * Only create a single instance of an object and all clients use the same object in the heap.
 * Create an instance when the class is used for the first time or via lazy loading.
 * 
 * Several ways of implementing singleton:
 * 1.public accessor
 * 2.public read-only instance
 * 3.lazy loading
 * 
 * 
 * @author kaichengyan
 *
 */
public class SingletonObjectDemo {

	public static void main(String[] args) {
		ArrayList<SomeClass> list = new ArrayList<SomeClass>();
		for(int i=0; i<20; i++) {
			list.add(new SomeClass(NullObject.getInstance()));
		}
	}
}

interface ISomeBehavior {
	void doBehavior();
}

class SomeBehavior implements ISomeBehavior {
	public void doBehavior() {
		// do something
	}
}

// Singleton Pattern
class NullObject implements ISomeBehavior {
	private NullObject() { }

	@Override
	public void doBehavior() {
		// do something
	}
	
	/**
	 * Public accessor
	 * 
	 * add a public accessor(getInstance) to allow client code full access to any public methods on the class.
	 */
	private final static NullObject instance = new NullObject();
	
	public static NullObject getInstance() {
		return instance;
	}
	
	/**
	 * Lazy Loading
	 * 
	 * Only load the single instance upon first access and the cache the result.
	 */
//	private static NullObject instance;
//	public static NullObject getInstance() {
//		if(instance == null)
//			instance = new NullObject();
//		return instance;
//	}
	
	/**
	 * Public read-only instance
	 * 
	 * Make the instance public, but make sure it's read-only.
	 */
//	public static final NullObject instance = new NullObject();
	
}

class SomeClass {
	private ISomeBehavior _behavior;
	
	public SomeClass(ISomeBehavior behavior) {
		_behavior = behavior;
	}
	
	public void doSomething() {
		_behavior.doBehavior();
	}
}
