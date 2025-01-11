package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProduct extends Product{

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UserProduct() {
		super();
	}

	public UserProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name+" (used) "+" $"+String.format("%.2f", price)+" (Manufacture date: "+sdf.format(manufactureDate)+")";
	}
}