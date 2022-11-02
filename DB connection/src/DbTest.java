import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

             public class DbTest { 

	          public static void main(String[] args) {
		     
			   String  jdbcURL = "jdbc:mysql://localhost:3306/javamysoul";
			   List <Employees>empList = new ArrayList< >();
			   Connection con = null;
			   Statement st = null;
			   ResultSet rs = null;
			   
//		    try { 
//		    	
//			      con = DriverManager.getConnection(jdbcURL, "root", "Rootpass123");
//			      st = con.createStatement();
//			      rs = st.executeQuery ("Select * from employee");
//			   
//			   while (rs.next()) {
//				   
//				   int id = rs.getInt("EMP_ID");
//				   String name = rs. getString("EMP_NAME");
//				   double salary = rs.getDouble("SALARY");
//				   int depId = rs.getInt("DEPT_ID");
//				   String Manager = rs. getString("Manager_Name");
//				   empList.add(new Employees(id, name, salary, depId, Manager));
//				   
//			   }
//				   
//				    }
//			 catch (SQLException e) {
//				   System.out.println (e.toString());
//			   }
//		   
//	 
//           finally {
//            	 
//            try {	 
//            	rs.close();
//             	st.close();
//            	con.close();
//            }
//            
//            catch (SQLException e) {
//			   System.out.println (e.toString());
//			   }
//   	 empList.forEach(e->System.out.println(e));
//             }
//           }
//             }
//	          
             
			   
             
      Employees emp = new Employees (6, "Dere" , 4500, 102, "Nitin");

             try {
        	 con = DriverManager.getConnection(jdbcURL, "root", "Rootpass123");
			      st = con.createStatement();
         	 String query  = "INSERT  INTO employee  values ("+emp.getId()+", '"+emp.getName()+ "'," +emp.getSalary()+","+emp.getDeptId()+",'"+emp.getManagerN()+"') ";
          	 int n = st.executeUpdate(query);
            	 if (n ==1) {
           		 System.out.println ( "Hi" + emp.getName() + ", You are registered successfully");
           		 }
             }
            	 catch (SQLException s) {
           		 
         		 System.out.println(s);
          		 }
             
           	finally  {
           		try {
           			st .close();
           			con .close();
           		}
            	catch (SQLException s) {
           		System.out.println(s);
            			}	
           		}
            		
            	   try  { 
			    	
			      con = DriverManager.getConnection(jdbcURL, "root", "Rootpass123");
			      st = con.createStatement();
			      rs = st.executeQuery ("Select * from employee");
			   
			   while (rs.next()) {
				   
				   int id = rs.getInt("EMP_ID");
				   String name = rs. getString("EMP_NAME");
				   double salary = rs.getDouble("SALARY");
				   int depId = rs.getInt("DEPT_ID");
				   String Manager = rs. getString("Manager_Name");
				   empList.add(new Employees(id, name, salary, depId, Manager));
				   
			   }
				   
				    }
			 catch (SQLException e) {
				   System.out.println (e.toString());
			   }
        	 empList.forEach(e->System.out.println(e));

			     }
             }
             
//***Other way we can avoid the "finally" stament to close connections. Try with resource statement.
//
//try(Connection con = getConnection();
//		Statement st = con.createStatement();
//		Resultset rs = st.executeQuery("Select * from employees"))
//		 {
//	while (rs.next()) {
//		   
//		   int id = rs.getInt("EMP_ID");
//		   String name = rs. getString("EMP_NAME");
//		   double salary = rs.getDouble("SALARY");
//		   int depId = rs.getInt("DEPT_ID");
//		   String Manager = rs. getString("Manager_Name");
//		   empList.add(new Employees(id, name, salary, depId, Manager));
//		   
//	   }
//	
//	
//		 }catch (SQLException s) {
//       		 
//     		 System.out.println(s);
//






