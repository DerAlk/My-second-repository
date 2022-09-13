package domain;

public class Admin extends Employee {
	
   public Admin(int empId, String name, String Ssn, double salary) {
	super (empId, name,Ssn, salary);	
	}

public void  print() {
	super.print();
	}
   
}

