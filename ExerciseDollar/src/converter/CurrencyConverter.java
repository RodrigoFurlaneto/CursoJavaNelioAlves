package converter;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double amount(double dollar, double bought) {
		return dollar * bought * (1.0 + IOF);
	}
}
