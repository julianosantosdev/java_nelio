package application;

public class Program_s10_97 {

	public static void main(String[] args) {
		String[] vector = new String[] {"Maria", "Bob", "Alex"};
		
		// WITH FOR
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		
		// FOR EACH
		for (String name : vector) {
			System.out.println(name);
		}
	}
}
