package testpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PS3.Account;
import PS3.InsufficientFundsException;
public class PS3_JUnit {
	
	Account a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new Account(1122, 20000);
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void Account() {
		double balance = 20000;
		int id = 1122;
		double account_balance = a.getBalance();
		int account_id = a.getID();
		assertTrue((balance == account_balance) && (id == account_id));
	}
	
	@Test
	public void ut_withdraw() throws InsufficientFundsException {
		double amount = 2500;
		a.withdraw(amount);
		double new_balance = 17500;
		assertTrue(new_balance == a.getBalance());
		
		
		
	}
	
	@Test
	public void ut_deposit() {
		int amount = 3000;
		double new_balance = 23000;
		a.deposit(amount);
		assertTrue(new_balance == a.getBalance()); 
	}
	

}
