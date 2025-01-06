package Utilities;

public class Employee {
	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double porcentage) {
		GrossSalary += (porcentage/100)*GrossSalary;
	}
	
	public String toString() {
		return "Employee: "+name+", $ "+String.format("%.2f%n", NetSalary());
	}
}
