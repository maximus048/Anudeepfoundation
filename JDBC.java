1.Write a JDBC program to insert a record into a database (Table:Student: id,name,age,phone_no,email) 

java code:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) {
		try {
			//1.Register Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");//oracle:oracle.jdbc.driver.OracleDriver
			// 2.Create connection
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anp_d1485","root","se");
			//3. Create Statment
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into Student values(1,'Rahul',20,'9876543210','rahul@gmail.com')");
			stmt.executeUpdate("insert into Student values(2,'Anita',21,'9876543211','anita@gmail.com')");
			stmt.executeUpdate("insert into Student values(3,'Vikas',22,'9876543212','vikas@gmail.com')");
			stmt.executeUpdate("insert into Student values(4,'Priya',20,'9876543213','priya@gmail.com')");
			stmt.executeUpdate("insert into Student values(5,'Amit',23,'9876543214','amit@gmail.com')");
			System.out.println("5 row inserted sucessfully");

			// 5.Close Connection
			con.close();

		}catch(Exception e)
		{
			System.out.println(e);

		}


	}
}

sql code: 
CREATE TABLE Student(
    -> id INT PRIMARY KEY,
    -> name VARCHAR(50),
    -> age INT,
    -> phone_no VARCHAR(15),
    -> email VARCHAR(50)
    -> );

+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| id       | int         | NO   | PRI | NULL    |       |
| name     | varchar(50) | YES  |     | NULL    |       |
| age      | int         | YES  |     | NULL    |       |
| phone_no | varchar(15) | YES  |     | NULL    |       |
| email    | varchar(50) | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
5 rows in set (0.07 sec)

output:

5 row inserted sucessfully

+----+-------+------+------------+-----------------+
| id | name  | age  | phone_no   | email           |
+----+-------+------+------------+-----------------+
|  1 | Rahul |   20 | 9876543210 | rahul@gmail.com |
|  2 | Anita |   21 | 9876543211 | anita@gmail.com |
|  3 | Vikas |   22 | 9876543212 | vikas@gmail.com |
|  4 | Priya |   20 | 9876543213 | priya@gmail.com |
|  5 | Amit  |   23 | 9876543214 | amit@gmail.com  |
+----+-------+------+------------+-----------------+