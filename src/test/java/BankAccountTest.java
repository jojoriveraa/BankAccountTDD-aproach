import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testDeposit() {
		BankAccount account = new BankAccount();
		account.deposit(50);
		assertEquals(account.getBalance(), 50);
	}

	@Test
	public void testWithdraw() {
		BankAccount account = new BankAccount(75);
		account.withdraw(50);
		assertEquals(account.getBalance(), 25);
	}

	@Test
	public void testWithdrawWithPenalty() {
		BankAccount account = new BankAccount(10);
		account.withdraw(20);
		assertEquals(account.getBalance(), -15);
	}

	@Test
	public void testWithdrawWithInvalidValues() {
		BankAccount account = new BankAccount(100);
		assertFalse(account.withdraw(10000));
		assertEquals(account.getBalance(), 100);

		assertTrue(account.withdraw(1));
		assertEquals(account.getBalance(), 99);
	}

}
