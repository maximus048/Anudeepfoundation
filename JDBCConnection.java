package JavaPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*JDBC Interface:
	 * 1. Driver Interface
	 * 2. Connection Interface
	 * 3. Statement Interface
	 * 4. PreparedStatment Interface
	 * 5. Callable Interface
	 * 6. ResultSet Interface
	 * 7.ResultSetMetaData Interface
	 * 8. DatabaseMetaData Interface
	 
	 *  steps to connect java application to database:
	 * 1.Register Driver Class
	 * 2.Create connection
	 * 3. Create Statment
	 * 4. Execute query
	 * 5.Close Connection
	 */ 
public class JDBCConnection {

	public static void main(String[] args) {
		try {
   //1.Register Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");//oracle:oracle.jdbc.driver.OracleDriver
		// 2.Create connection
		Connection con=null;
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anp_d1485","root","manali");
		   //3. Create Statment
		   Statement stmt=con.createStatement();
		   // 4. Execute query
		   ResultSet rs=stmt.executeQuery("select * from customer");
		   while(rs.next())
		   {
			   
			   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+""+rs.getString(5));
		   }
		   // 5.Close Connection
		   con.close();
		
		}catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
