
public class BankAccount {

	private int accountno;
	private int balance;

	public BankAccount(int accountno, int balance) {
		// TODO Auto-generated constructor stub
		this.accountno = accountno;
		this.balance = balance;
	}

	public int getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void deposit(int amount) {
		// TODO Auto-generated method stub
		this.balance=this.balance+amount;
	}

	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		this.balance=this.balance-amount;
	}

}
