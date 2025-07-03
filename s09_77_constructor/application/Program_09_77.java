package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product02;

public class Program_09_77 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product02 product = new Product02(name, price, quantity);
		
		product.setName("computer");
		System.out.println(product.getName());
		
		product.setPrice(1200.00);
		System.out.println(product.getPrice());
		
		System.out.println(product.getQuantity());

		product.toString();

		System.out.println("Product Data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("Updated Data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated Data: " + product);

		sc.close();
	}
}
