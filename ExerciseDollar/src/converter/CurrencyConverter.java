package converter;

public class CurrencyConverter {
	
	public static double amount(double dollar, double bought) {
		return dollar * bought * 1.06;
	}
}
