import java.io.*;

// command classes
public class WithdrawCommand implements ICommand, IUndoable {
	// receiver object
	private final BankAccount _bankAccount;
	private int withdrawalAmount;
	
	public WithdrawCommand(BankAccount ba) {
		_bankAccount = ba;
	}
	
	@Override
	// command
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter a withdrawal amount: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		try{
			input = br.readLine();
			withdrawalAmount = Integer.parseInt(input);
			_bankAccount.withdraw(withdrawalAmount);
			CommandHistory.add(this);
			
		} catch(Exception ex) {}
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		_bankAccount.deposit(withdrawalAmount);
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		_bankAccount.withdraw(withdrawalAmount);
	}

}
