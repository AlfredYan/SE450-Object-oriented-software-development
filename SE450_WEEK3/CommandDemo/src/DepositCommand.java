import java.io.BufferedReader;
import java.io.InputStreamReader;

//command classes
public class DepositCommand implements ICommand, IUndoable {
	// receiver object
	private final BankAccount _bankAccount;
	private int depositAmount;
	
	public DepositCommand(BankAccount ba) {
		_bankAccount = ba;
	}
	
	@Override
	// command
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter a deposit amount: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		try{
			input = br.readLine();
			depositAmount = Integer.parseInt(input);
			_bankAccount.deposit(depositAmount);
			CommandHistory.add(this);
			
		} catch(Exception ex) {}
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		_bankAccount.withdraw(depositAmount);
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		_bankAccount.deposit(depositAmount);
	}

}
