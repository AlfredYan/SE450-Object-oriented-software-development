/***
 * Factory Method Pattern
 * 
 * 1.create an interface with a single factory method(e.g. getIterator())
 * 2.Have classes that you want to create related objects implement that interface.
 * 
 * It allows us to be able to add an interface to a class in order to 
 * allow it be able to create a related object.
 * 
 * @author kaichengyan
 *
 */
public class FactoryMethodPatternDemo {

}

// factory method pattern
interface IIteratorFactoryMethod {
	IIterator getIterator();
}

class ArrayList implements IIteratorFactoryMethod {

	@Override
	public IIterator getIterator() {
		return new ArrayListIterator();
	}
	
}

class LinkedList implements IIteratorFactoryMethod {

	@Override
	public IIterator getIterator() {
		return new LinkedListIterator();
	}
	
}

interface IIterator { }
class ArrayListIterator implements IIterator { }
class LinkedListIterator implements IIterator { }

class SampleClient {
	private final IIteratorFactoryMethod _list;
	
	public SampleClient(IIteratorFactoryMethod list) {
		_list = list;
	}
	
	void callToString() {
		IIterator iterator = _list.getIterator();
		// do something with iterator
	}
}
