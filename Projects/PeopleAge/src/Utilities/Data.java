package Utilities;

public class Data {
	
	private String name;
	private int age;
	private double high;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHigh() {
		return high;
	}

	public Data(String name, int age, double high) {
		this.name = name;
		this.age = age;
		this.high = high;
	}
}
