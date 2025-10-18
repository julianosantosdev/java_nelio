package heights;

import java.util.Locale;
import java.util.Scanner;

public class HeightProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		Person[] peopleList = new Person[n];
		
		double heightSum = 0;
		int lessThan16 = 0;
		
		
		for (int i = 0; i < peopleList.length; i++) {
			System.out.printf("Dados da %d pessoa: ", i+1);
			System.out.println();
			
			System.out.print("Nome: ");
			String name = scanner.nextLine();
			
			System.out.print("Idade: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Altura: ");
			double height = scanner.nextDouble();
			scanner.nextLine();
			System.out.println();
			
			peopleList[i] = new Person(name, age, height);
		}
		
		for (int i = 0; i < peopleList.length; i++) {
			heightSum += peopleList[i].getHeight();
			
			if (peopleList[i].getAge() <= 14) {
				lessThan16++;
			}			
		}
		
		System.out.println();
		System.out.printf("Altura Média: %.2f\n", heightSum/peopleList.length);
		System.out.printf("Pessoas com menos de 16 anos: %.2f %%\n", ((double)lessThan16/peopleList.length)*100);
		
		for (int i = 0; i < peopleList.length; i++) {
			if (peopleList[i].getAge() < 16) {
				System.out.println(peopleList[i].getName());
			}
		}
		
		scanner.close();
	}

}
