package Utilities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public void setId() {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary() {
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "ID: "+id+", NAME: "+name+", SALARY: R$ "+String.format("%.2f%n", salary);
	}
	
	public Double salaryIncrese(double percentage) {
		return salary += salary * percentage / 100;
	}
}
