package tutorial_413_asserts_in_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void deposit() {
		BankAccount account = new BankAccount("Tim", "Buchlka", 1000.0);
		double balance = account.deposit(200.00, true);
		assertEquals(1200.00, balance, 0);
		//Todo left 7:00
	}
	
	@Test
	public void withdraw() {
		fail("This test has not yet been implemented");
	}

	@Test
	public void getBalance() {
		fail("This test has not yet been implemented");
	}
	
	@Test
	public void dummyTest() {
	assertEquals(20, 21);
	}
}
