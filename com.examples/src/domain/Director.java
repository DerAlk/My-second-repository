package domain;

public class Director extends Employee{
	private double budget;
	 
	public Director (int empId, String name, String Ssn, String string, double budget) {
	super ();
	 this.budget = budget;
	}
	public void setBudget(double budget) {
	this.budget = budget;
	}
	public double getBudget() {
		return budget;
	}
public void  print() {
	super.print();
	System.out.println("Budget :" + this.budget);
	
	}
}
