package domain;

public class Director extends Employee{
	private double budget;
	 
	public Director (int empId, String name, String Ssn, double salary, String department,double budget ) {
	super (empId, name,Ssn, salary);
	 this.budget = budget;
	}
	public void setBudget(double budget) {
	this.budget = budget;
	}
	public double getBudget() {
		return budget;
	}
	@Override
public void  print() {
	super.print();
	System.out.println("Budget :" + this.budget);
	
	}
}
