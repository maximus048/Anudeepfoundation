package assignments;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserTaskOperation {

	public static void main(String[] args) {
		// Obtain a Hibernate SessionFactory
				SessionFactory factory = HibernateUtil.getSessionFactory();
				// Open a new session
				Session session = factory.openSession();

				// Begin a transaction
				Transaction transaction = session.beginTransaction();

				// Create a user
				User user = new User();
				user.setUsername("john_doe");

				// Create tasks and associate them with the user
				Task task1 = new Task();
				task1.setTitle("Complete project A");
				task1.setUser(user);

				Task task2 = new Task();
				task2.setTitle("Review documentation");
				task2.setUser(user);

				List<Task> tasks=new ArrayList<Task>();
				tasks.add(task1);
				tasks.add(task2);
				
				user.setTasks(tasks);

				// Save the user and associated tasks
				session.save(user);
				session.save(task1);
				session.save(task2);

			
				
				// Close the Session
				session.close();

				// Close the Session Factory
				factory.close();
	}

}
