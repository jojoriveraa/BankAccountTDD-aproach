import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void test() {
		BankAccount account = new BankAccount();
		account.deposit(50);
		assertEquals(account.balance, 50);
		
		account.withdraw(30);
		assertEquals(account.balance, 20);
	}

}
