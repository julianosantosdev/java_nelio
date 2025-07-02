package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program_s08_71 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter radius: ");
//		double radius = sc.nextDouble();
//
//		double c = Calculator.circumference(radius);
//		double v = Calculator.volume(radius);
//
//		System.out.printf("Circumference: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		System.out.printf("PI value: %.2f%n", Calculator.PI);

		double dolarPrice;
		System.out.println("What is the dollar price?");
		dolarPrice = sc.nextDouble();

		System.out.println("How many dollar will be bought?");
		double ammount = sc.nextDouble();

		System.out.printf("Amount to be pain in reais: R$ %.2f%n", CurrencyConverter.converted(dolarPrice, ammount));

		sc.close();
	}

}
