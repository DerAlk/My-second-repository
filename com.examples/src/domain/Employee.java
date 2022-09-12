package domain;

public class Employee {
	private int empId;
	private String name;
	private String Ssn;
	private double salary;
	
	/*public Employee (int empId, String name, String Ssn, double salary) 
	  {
		this.empId = empId;
		this.name = name;
		this.Ssn = Ssn;
        this.salary = salary;
		}
	*/
	 public void setEmpId(int empId) {
   	  this.empId = empId;
     }
	  public void getEmpId() {
		  return;
	  }
	
	 public void setName(String name) {
    	  this.name = name;
      }
	  public void getName() {
		  return;
	  }
	  
	  public void setSsn(String Ssn) {

       this.Ssn = Ssn;
}
     public void getSsn() {
	  return ;
}

public void raiseSalary(double amount) {
	  this.salary = salary+= amount;
}

public void print ()
{
	    System.out.println ("Employee id:         "    +  emp.getEmpId());
        System.out.println ("Employee name:       " +  emp.getName());
        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println ("Employee salary:     " +   emp.raiseSalary());
}

}





