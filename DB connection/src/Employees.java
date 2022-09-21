
public class Employees {
	
	private int id;
	private String name;
	private double salary;
	private int deptId;
	private String Manager_Name;
	
	public Employees(int id, String name, double salary, int deptId, String Manager_Name) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
		this.Manager_Name = Manager_Name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public String getManagerN() {
		return Manager_Name;
	}
	public void setManagerN(String Manager_Name) {
		this.Manager_Name = Manager_Name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptId=" + deptId + ", Manager_Name = "+ Manager_Name + "]" ;
	}

	
}



