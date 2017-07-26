import java.util.ArrayList;
import java.util.List;

public class keyboardCommandHandler implements IKeyboardCommandHandler{

	private final List<IKeyboardObserver> observers = new ArrayList<IKeyboardObserver>();
	
	@Override
	public void registerObserver(IKeyboardObserver observer) {
		observers.add(observer);
	}

	@Override
	public void deregisterObserver(IKeyboardObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void readInput(String input) {
		if(input.equals(" "))
			notifyObserver(input);
	}
	
	private void notifyObserver(String input) {
		for(IKeyboardObserver observer : observers) {
			observer.update(input);
		}
	}
}
