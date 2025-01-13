package Entities;

public class NaturalPerson extends Person{
	
	private Double HealthExpenses;

	public NaturalPerson() {
		super();
	}

	public NaturalPerson(String name, Double income, Double healthExpenses) {
		super(name, income);
		HealthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return HealthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		HealthExpenses = healthExpenses;
	}

	@Override
	public double calTax() {
		double tax = 0;
		
		if(income < 20.000) {
			if(HealthExpenses != 0) {
				tax += income / 100 * 15 - HealthExpenses/2;
			}
			else {
				tax += income / 100 * 15;
			}
		}
		else {
			if(HealthExpenses != 0) {
				tax += income / 100 * 25 - HealthExpenses/2;
			}
			else {
				tax += income / 100 * 25;
			}
		}
		
		return tax;
	}
	
}
