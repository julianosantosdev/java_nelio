package renting_rooms;

import java.util.Locale;
import java.util.Scanner;

public class RentProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Rent[] rentList = new Rent[10];
		
		System.out.print("How many Rooms? ");
		int rentQty = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= rentQty; i++) {
			System.out.println();
			System.out.printf("Rent #%d: ", i);
			System.out.println();
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Email: ");
			String email = scanner.nextLine();
			
			System.out.print("Room number: ");
			int roomNumber = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println();	
			
			rentList[roomNumber] = new Rent(name, email);			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");		
		for (int i = 0; i < rentList.length; i++) {
			if (rentList[i] != null) {
				System.out.println(i + ": " + rentList[i]);
			}
		}
		
		scanner.close();
		
	}
}
