package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsert {
	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setId(3);
		employee.setName("Shivani");
		employee.setAddress("Pune");
		employee.setEmail("s@mail");
		employee.setPhone(9876598765l);
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("shivani");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(employee);
		
		entityTransaction.commit();
	}

}
