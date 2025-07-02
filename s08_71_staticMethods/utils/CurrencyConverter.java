package utils;

public class CurrencyConverter {
	public static double converted(double price, double amount) {
		return (price * amount) * 1.06;
	}
}
