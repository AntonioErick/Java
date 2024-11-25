package Entities;

public class Register {
	
	private String name;
	private int id;
	private double balance;

	public Register(String name, int id, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withDraw(double withdraw) {
		balance -= (withdraw + 5); 
	} 
	
	public void Deposit(double deposit) {
		balance += deposit; 
	} 
	
	public String toString() {
		return "Account "+id+", Holder: "+name+", Balance: $ "+String.format("%.2f", balance); 
	}
}
