package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {
	public static void main(String[] args) {
		
//		Employee employee=new Employee();
//		employee.setName("Jalal");
//		employee.setPhone(8765);
//		employee.setAddress("kolkata");
//		employee.setEmail("JAlal@mail");
//		employee.setId(2);
//		
//		
//		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("shivani");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		
//		Employee employee2= entityManager.find(Employee.class, employee.getId());
//		if(employee2!=null) {
//			entityTransaction.begin();
//			entityManager.merge(employee);
//			
//			entityTransaction.commit();
//		}
//		else {
//			System.out.println("Employee with given id not Foun!");
//		}


//		Employee employee=new Employee();
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("shivani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee2= entityManager.find(Employee.class, 1);
		if(employee2!=null) {
			entityTransaction.begin();
			
			employee2.setName("Zoya");
			
			entityManager.merge(employee2);
			
			entityTransaction.commit();
		}
		else {
			System.out.println("Employee with given id not Foun!");
		}

	}

}
