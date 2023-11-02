package DBSQLWithJava;

import java.sql.*;


public class MySqlProgram {
       public static void main(String[] args) throws Exception {
		
    	   Class.forName("com.mysql.jdbc.Driver");
    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "qazwsx");
    	   System.out.println(con.isValid(10));
    	   Statement stmt = con.createStatement();
    	   
    	   // Create Table
			/*
			 * String query = "create table Automation(id integer, Name varchar(30) )" ; int
			 *  status = stmt.executeUpdate(query);
			 */
    	  // System.out.println("Status of the execution is: "+ status);
    	   
    	   // Update Query
			/*
			 * String UpdateQuery = "alter table Automation  modify Name varchar(25) "; int
			 * stat = stmt.executeUpdate(UpdateQuery);
			 * System.out.println("Status of the execution is: "+ stat);
			 */
    	               // Insert Query
			/*
			 * String InsertQuery =
			 * "insert into Automation values (1, 'Ravi'),(2, 'Niranjan')"; int status =
			 * stmt.executeUpdate(InsertQuery);
			 * 
			 * System.out.println("Status of the execution is: "+ status);
	
			 */
    	   
    	   // Update Query
    	   
//    	    String UpdateQuery =  "Update Automation set id =5 where name = 'ravi'"; 
//    	    int status =  stmt.executeUpdate(UpdateQuery);
//    				 
//    			System.out.println("Status of the execution is: "+ status);
    	   
    	   // SelectQuery
    	   
//    	   String SelectQuery = "select * from automation";
//    	   ResultSet res = stmt.executeQuery(SelectQuery);
//    	   while(res.next()) {
//    		   System.out.println("id:-"+res.getInt("id"));
//    		   System.out.println("name:-"+res.getString("name"));
//    	   }
    	//	stmt.close();
    		
    		String JoinQuery = "select employee.EmpId, employee.FirstName, employee.LastName, employee.salary, department.depId, department.deptName \r\n"
    				+ "from employee, department where employee.deptId= department.depId ";
    		
    		ResultSet res = stmt.executeQuery(JoinQuery);
    		
    		while(res.next()) {
     		   System.out.print("EmpId:-"+res.getInt("EmpId"));     		
     		   System.out.print("  FirstName:-"+res.getString("FirstName"));
     		  System.out.print("  LastName:-"+res.getString("LastName")); 
     		 System.out.print("  depId:-"+res.getInt("depId"));   
    		   System.out.println("  deptName:-"+res.getString("deptName"));
     		   
   	   }
     		stmt.close();
     		
	}
}