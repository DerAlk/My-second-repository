package com.examples;

import domain.Admin;
import domain.Director;
import domain.Employee;
import domain.Engineer;
import domain.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee ();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSsn ("012-34-5678");
        emp.raiseSalary(120_345.27);
        emp.print();
        
        Engineer Eng = new Engineer (101, "Jane Smith", "012-345-5678, 120_345.27");
        super.print();
        
       Manager Mng = new Manager( 207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing" );                            );
        Mng.print();
        
        Admin Adm = new Admin (304, "Bill Munroe", 108-23-6509, 75_000);
        super.print();
        
        Director Dir = new Director  (12, "Susan Wheeler", "099-45-2340", "Global Marketing", 100_000.00);                                                                            );
        Dir.print();
        

	}

	}


