import java.util.ArrayList;
import java.util.List;

public class SpacebarHandler implements ISpacebarHandler{

	private final List<ISpacebarObserver> observers = new ArrayList<ISpacebarObserver>();
	
	@Override
	public void registerObserver(ISpacebarObserver observer) {
		observers.add(observer);
	}

	@Override
	public void deregisterObserver(ISpacebarObserver observer) {
		observers.remove(observer);
	}

	private void notifyObserver() {
		for(ISpacebarObserver observer : observers) {
			observer.update();
		}
	}

	// implement IKeyboardObserver
	@Override
	public void update(String input) {
		if(input.equals(" "))
			notifyObserver();
	}

}
