CREATE TABLE Student(stud_id int PRIMARY KEY,Name varchar(10)NOT NULL,Address varchar(10)NOT NULL,Age int NOT NULL);
Query OK, 0 rows affected (0.07 sec)

desc Student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| stud_id | int         | NO   | PRI | NULL    |       |
| Name    | varchar(10) | NO   |     | NULL    |       |
| Address | varchar(10) | NO   |     | NULL    |       |
| Age     | int         | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

INSERT INTO Student(stud_id,Name,Address,Age)VALUES(01,'Janvi','NaviMumbai',20);
Query OK, 1 row affected (0.01 sec)

INSERT INTO Student VALUES(02,'Samruddhi','Panvel',21),(03,'Niraj','Panvel',22),(04,'Shaurya','Panvel',23),(05,'Maximus','Nalasopara',22);
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

 Select * from Student
    -> ;
+---------+-----------+------------+-----+
| stud_id | Name      | Address    | Age |
+---------+-----------+------------+-----+
|       1 | Janvi     | NaviMumbai |  20 |
|       2 | Samruddhi | Panvel     |  21 |
|       3 | Niraj     | Panvel     |  22 |
|       4 | Shaurya   | Panvel     |  23 |
|       5 | Maximus   | Nalasopara |  22 |
+---------+-----------+------------+-----+
5 rows in set (0.06 sec)

mysql> SELECT SUM(Age) FROM Student;
+----------+
| SUM(Age) |
+----------+
|      108 |
+----------+
1 row in set (0.01 sec)

mysql> SELECT AVG(Age) FROM Student;
+----------+
| AVG(Age) |
+----------+
|  21.6000 |
+----------+
1 row in set (0.00 sec)

mysql> SELECT MIN(Age) FROM Student;
+----------+
| MIN(Age) |
+----------+
|       20 |
+----------+
1 row in set (0.00 sec)

mysql> SELECT MAX(Age) FROM Student;
+----------+
| MAX(Age) |
+----------+
|       23 |
+----------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(*) FROM Student;
+----------+
| COUNT(*) |
+----------+
|        5 |
+----------+
1 row in set (0.01 sec)