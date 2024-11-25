package Utilities;

public class Product {
	String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice () {
		return price;
	}
	
	public int getQuantity () {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price*quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity; 
	}
	
	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+", $ "
				+ String.format("%.2f", price)
				+", "
				+quantity
				+" units, Total: $ "
				+ String.format("%.2f",totalValueInStock());
	}
}

