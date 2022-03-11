package entities;

public class Student {
	
	public String name;
	public double n1, n2, n3;
	
	public double sum() {
		return n1 + n2 + n3;
	}
	
	public String toString() {
		return String.format("%.2f", sum());
	}
	
	public double failed() {
		return 60 - sum();
	}
	
	public String toStringFailed() {
		return String.format("%.2f", failed());
	}
}
