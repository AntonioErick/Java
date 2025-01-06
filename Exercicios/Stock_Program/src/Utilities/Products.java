package Utilities;

public class Products {
	public String name;
	public int quantity;
	public double price;
	
	public double TotalValueStock() {
		return quantity * price;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Name: "
				+name
				+", Price: $ "
				+String.format("%.2f", price)
				+", "+quantity+" units, Total: $ "
				+ String.format("%.2f",TotalValueStock());
				
	}
	
}
