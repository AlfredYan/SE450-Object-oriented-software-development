
public interface ISpacebarHandler extends IKeyboardObserver{
	void registerObserver(ISpacebarObserver observer);
	void deregisterObserver(ISpacebarObserver observer);
}
