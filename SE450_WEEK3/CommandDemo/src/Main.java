import java.io.*;
/***
 * 1.Create an interface and create command classes that implement that interface
 * 2.These command classes should have receiver objects.
 * @author KYAN4
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Alfred Yan's \'Super-legit\' Bank");
		System.out.println("This ATM offers the following options:");
		System.out.println("Withdraw");
		System.out.println("Deposit");
		System.out.println("Balance");
		System.out.println("Undo");
		System.out.println("Redo");
		System.out.println("Exit");
		System.out.println("What would you like to do?");
		
		BankAccount account = new BankAccount(500);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		while(!(input = br.readLine()).toLowerCase().equals("exit")) {
			ICommand command;
			
			switch(input.toLowerCase()) {
				case "withdraw": 
					command = new WithdrawCommand(account);
					break;
				case "deposit":
					command = new DepositCommand(account);
					break;
				case "balance":
					command = new DisplayBalanceCommand(account);
					break;
				case "undo":
					command = new UndoCommand();
					break;
				case "redo":
					command = new RedoCommand();
					break;
				default: 
					throw new Exception();
			}
			
			command.run();
		}
		
	}
}
