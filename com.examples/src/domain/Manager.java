package domain;

public class Manager extends Employee {
	   private String deptName;
	  
	   public  Manager (int empId, String name, String Ssn, double salary,String deptName) {
	   super (empId, name,Ssn, salary);
	   this.deptName = deptName;
	   }
	   public void setDeptName(String deptName) {
	   this.deptName = deptName;
		  }
		public String getDeptName() {
		  return deptName;
	  }
		@Override
	  public void  print() {
			super.print();
			System.out.println("Department Name :" + this.deptName);
			
			}
}


