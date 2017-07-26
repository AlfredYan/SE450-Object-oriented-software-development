
public interface IKeyboardCommandHandler {
	void registerObserver(IKeyboardObserver observer);
	void deregisterObserver(IKeyboardObserver observer);
	void readInput(String input);
}
