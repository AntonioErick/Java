package Utilities;

public class Account {
	private String holder;
	private int account;
	private double balance;
	
	
	public Account(String holder, int account) {
		this.holder = holder;
		this.account = account;
	}

	public Account(String holder, int account, double initial_deposit) {
		this.holder = holder;
		this.account = account;
		Deposit(initial_deposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}
	
	public void Deposit(double initial_deposit) {
		balance += initial_deposit;
	}
	
	public void withDraw(double withdraw) {
		balance -= (withdraw + 5);
	}
	
	public String toString() {
		return "Account: "+account+", Holder: "+holder+", Balance: $ "+String.format("%.2f", balance);
	}

}
