package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFeatch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("shivani");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, 91);
		
		if(employee!=null) {
			System.out.println(employee);
		}
		else {
			System.out.println("Employee with given id not Found!");
		}
	}

}
