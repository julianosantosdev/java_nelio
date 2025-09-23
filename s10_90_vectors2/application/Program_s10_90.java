package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_s10_90;

public class Program_s10_90 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		Product_s10_90[] productVector = new Product_s10_90[n];
		
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			
			productVector[i] = new Product_s10_90(name, price);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += productVector[i].getPrice();
		}
		
		double avg = sum/n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		scanner.close();
		
		
	}

}
