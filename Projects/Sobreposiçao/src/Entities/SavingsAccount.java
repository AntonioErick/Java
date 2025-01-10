package Entities;

//public final class SavingsAccount extends Account
//a palavra final indica que a a classe SavingsAccounts nao pode ter subclasses
public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//SOBREPOSIÇAO
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	//public final void withdraw(double amount)
	//nesse caso, a palavra final indica que esse metodo nao pode ser sobreposto
}
