package JavaPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertStatment {

	public static void main(String[] args) {
		try {
			   //1.Register Driver Class
					Class.forName("com.mysql.cj.jdbc.Driver");//oracle:oracle.jdbc.driver.OracleDriver
					// 2.Create connection
					Connection con=null;
					   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anp_d1485","root","manali");
					   //3. Create Statment
					   Statement stmt=con.createStatement();
				
					   String q="insert into customer values(8,'sonali','J.M.Road','Mumbai','India')";
					   // 4. Execute query
					   int row=stmt.executeUpdate(q);
					   System.out.println(row+" row inserted sucessfully");
					   // 5.Close Connection
					   con.close();
					
					}catch(Exception e)
					{
						System.out.println(e);
						
					}


	}

}
