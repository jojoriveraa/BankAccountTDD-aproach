
public class BankAccount {

	private static final int DEBT_LIMIT = -1000;
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

	public boolean withdraw(int i) {
		if(balance - i < DEBT_LIMIT){
			return false;
		}
		balance -= i;
		balance = (balance < 0) ? balance - 5 : balance;
		return true;
	}

	public int getBalance() {
		return balance;
	}

}
