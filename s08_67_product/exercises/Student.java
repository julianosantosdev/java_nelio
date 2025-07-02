package exercises;

public class Student {
	public double n1, n2, n3;

	public void finalGrade() {
		double gradesSum = n1 + n2 + n3;
		if (gradesSum > 60) {
			System.out.println("FINAL GRADE = " + gradesSum + "\n" + "PASS");
		} else {
			System.out.println("FINAL GRADE = " + gradesSum + "\n" + "FAILED" + "\n" + "MISSING " + (60 - gradesSum) + " POINTS.");
		}
		
	}
}
