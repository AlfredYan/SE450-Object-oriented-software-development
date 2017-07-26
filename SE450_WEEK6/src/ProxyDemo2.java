
/***
 * Proxy Pattern
 * 
 * @author kaichengyan
 *
 */
public class ProxyDemo2 {

}

interface IProcessor {
	void getItem();
	void processItem(Object o);
}

class Processor implements IProcessor {

	@Override
	public void getItem() {
		// do something
	}

	@Override
	public void processItem(Object o) {
		// do something
	}
	
}

class ProcessorProxy implements IProcessor {

	private Processor _processor;
	
	public ProcessorProxy(Processor processor) {
		_processor = processor;
	}
	
	@Override
	public void getItem() {
		Logger.log("before get");
		_processor.getItem();
		Logger.log("before get");
	}

	@Override
	public void processItem(Object o) {
		Logger.log("before get");
		_processor.processItem(o);
		Logger.log("before get");
	}
	
}
