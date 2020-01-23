import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	static BankAccount bankaccount;
	@BeforeAll
	public static void setUp() throws Exception {
		bankaccount = new BankAccount(123,5000);
	}
	
	@Test
	void testgetbalance() {
		assertEquals(bankaccount.getbalance(),5000);
	}
	
	@Test
	void testdeposit() {
		bankaccount.deposit(1000);
		assertEquals(bankaccount.getbalance(),6000);
	}
	
	@Test
	void testwithdraw() {
		bankaccount.withdraw(1000);
		assertEquals(bankaccount.getbalance(),5000);
	}
}
