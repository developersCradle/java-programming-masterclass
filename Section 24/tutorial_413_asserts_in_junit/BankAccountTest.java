package tutorial_413_asserts_in_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	   @Test
	    public void deposit() throws Exception {
	        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
	        double balance = account.deposit(200.00, true);
	        assertEquals(1200.00, balance, 0);
	    }

	    @Test
	    public void withdraw() throws Exception {
	        fail("This test has yet to be implemented");
	    }

	    @Test
	    public void getBalance_deposit() throws Exception {
	        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
	        account.deposit(200.00, true);
	        assertEquals(1200.00, account.getBalance(), 0);
	    }

	    @Test
	    public void getBalance_withdraw() throws Exception {
	        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
	        account.withdraw(200.00, true);
	        assertEquals(800.00, account.getBalance(), 0);
	    }

	    @Test
	    public void isChecking_true() {
	        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
	        assertTrue("The account is NOT a checking account", account.isChecking());

	    }

}
