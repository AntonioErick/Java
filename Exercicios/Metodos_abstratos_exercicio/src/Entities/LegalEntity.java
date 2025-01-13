package Entities;

public class LegalEntity extends Person{

	private Integer employees;
	
	public LegalEntity() {
		super();
	}
	
	public LegalEntity(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double calTax() {
		double tax = 0;
		
		if(employees < 10) {
			tax += income / 100 * 16;
		}
		else {
			tax += income / 100 * 14;
		}
		
		return tax;
	}

}
