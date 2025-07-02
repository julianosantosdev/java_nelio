package exercises;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary += (grossSalary * (percentage / 100));
		System.out.println(netSalary());
//		System.out.println("Updated data: " + name + ", $ " + netSalary());		
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", grossSalary);
	}
}
