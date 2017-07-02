
// command classes
public class DisplayBalanceCommand implements ICommand {
	// receiver object
	private final BankAccount _bankAccount;
	
	public DisplayBalanceCommand(BankAccount ba){
		_bankAccount = ba;
	}
	
	@Override
	// command
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(_bankAccount.getBalance());
	}

}
