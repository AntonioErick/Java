package Utilities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary() {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void increseSalary(double percentage) {
		salary += salary * percentage / 100; 
	}
	
	public String toString() {
		return id+", "+name+", "+ String.format("%.2f", salary);
	}
}
