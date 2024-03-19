package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("shivani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, 3);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			System.out.println("Employee Deleted");
		}
		else {
			System.out.println("Employee with given id is not found");
		}
		
		
		
	}
	

}
