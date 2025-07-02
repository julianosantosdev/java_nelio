package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// RECTANGLE:
//		Rectangle rectangle = new Rectangle();
//		System.out.println("Enter rectangle width and heigth: ");
//		rectangle.height = sc.nextDouble();
//		rectangle.width = sc.nextDouble();
//		System.out.println(rectangle.toString());

		//EMPLOYEE:
//		Employee employee = new Employee();
//		
//		System.out.print("Name: ");
//		employee.name = sc.next();
//		System.out.println();
//		
//		System.out.print("Name: ");
//		employee.grossSalary = sc.nextDouble();
//		System.out.println();
//		
//		System.out.print("Name: ");
//		employee.tax = sc.nextDouble();
//		System.out.println();
//		
//		System.out.println(employee.toString());		
//		
//		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
//		employee.increaseSalary(10);
		
		//STUDENT:
		Student student = new Student();
		System.out.println("Grades:");
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		student.finalGrade();
		
		sc.close();
	}

}
