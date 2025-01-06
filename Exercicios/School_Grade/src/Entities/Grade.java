package Entities;

public class Grade {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double FinalPoints(){
		return n1+n2+n3;
	}
	
	public String Score() {
		double score = FinalPoints();
		if(score >= 60) {
			return "PASS";
		}
		else {
			return String.format("FAILED\nMISSING %.2f POINTS", 60 - FinalPoints());
		}
	}
	
	public String toString() {
		return "FINAL GRADE = "+String.format("%.2f%n", FinalPoints())+Score();
	}

}

