package entities;

public class Student {
	
	public String name;
	public double n1, n2, n3;
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public String toString() {
		String grade;
		if(finalGrade() > 60.0) {
			grade = "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) 
			+ "PASS";
		} else {
			double missing = 60.0 - finalGrade();
			grade = "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) 
			+ "FAILED\n" + "MISSING " + String.format("%.2f", missing) + " POINTS";
		}
		return grade; 
	}
}
