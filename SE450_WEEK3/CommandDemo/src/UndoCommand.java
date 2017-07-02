
public class UndoCommand implements ICommand {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		CommandHistory.undo();
	}

}
