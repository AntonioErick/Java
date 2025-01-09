package Entities;

//BusinessAccount é chamada 'subclasse' pois deriva de outra classe
//herança é uma associaçao entre classes e nao objetos

public class BusinessAccount extends Account { //extend permitite usar os atributos da classe Account

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
}
