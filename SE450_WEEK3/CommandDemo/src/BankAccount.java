
public class BankAccount {
	private int balance;
	
	public BankAccount(int initialBalance) {
		balance = initialBalance;
	}
	
	public void withdraw(int withdrawAmount) {
		balance -= withdrawAmount;
	}
	
	public void deposit(int depositAmount) {
		balance += depositAmount;
	}
	
	public int getBalance() {
		return balance;
	}
}
