package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program_08_66 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X");
		x.sideA = sc.nextDouble();
		x.sideB = sc.nextDouble();
		x.sideC = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y");
		y.sideA = sc.nextDouble();
		y.sideB = sc.nextDouble();
		y.sideC = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		/*
		 * SOLUÇÃO SEM ORIENTAÇÄO A OBJETOS:
		 * 
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); double xA,
		 * xB, xC, yA, yB, yC;
		 * 
		 * System.out.println("Enter the measures of triangle X"); xA = sc.nextDouble();
		 * xB = sc.nextDouble(); xC = sc.nextDouble();
		 * 
		 * System.out.println("Enter the measures of triangle Y"); yA = sc.nextDouble();
		 * yB = sc.nextDouble(); yC = sc.nextDouble();
		 * 
		 * double p = (xA + xB + xC) / 2.0; double areaX = Math.sqrt(p *
		 * (p-xA)*(p-xB)*(p-xC));
		 * 
		 * p = (yA + yB + yC) / 2.0; double areaY = Math.sqrt(p * (p-yA)*(p-yB)*(p-yC));
		 * 
		 * System.out.printf("Triangle X area: %.4f%n", areaX);
		 * System.out.printf("Triangle Y area: %.4f%n", areaY);
		 * 
		 * if (areaX > areaY) { System.out.println("Larger area: X"); } else {
		 * System.out.println("Larger area: Y"); } sc.close();
		 */

		sc.close();
	}

}
