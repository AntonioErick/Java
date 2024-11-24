import java.util.Locale; 

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %nComputer, which price is $%.2f %n", price1);
		System.out.printf("Office desk, which price is $%.2f %n", price2);
		System.out.println("Record: "+ age +" years old, code "+ code +", and gender: "+ gender);
		System.out.printf("Measure with decimal places: %f %nRouded(Three decimal places): %.3f%n", measure, measure);
		System.out.println("Measure with decimal places:"+measure+" %nRouded(Three decimal places):"+measure);
	}

}
