
public class BankAccount {

	private int balance;

	public BankAccount() {
		balance = 0;
	}

	public BankAccount(int i) {
		balance = i;
	}

	public void deposit(int i) {
		balance += i;
	}

	public void withdraw(int i) {
		balance -= i;
		balance = (balance < 0) ? balance - 5 : balance;
	}

	public int getBalance() {
		return balance;
	}

}
