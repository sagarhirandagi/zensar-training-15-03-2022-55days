package com.zensar;





import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;
import com.zensar.util.JPAUtil;




public class App {



	public static void loadTesting() {
		// write code here to load employee object
		EntityManager em=JPAUtil.createEntityManager("PU");
		Employee e=em.find(Employee.class, 1);
		System.out.println(e);
		
		JPAUtil.shutDown();



	}



	public static void insertTesting() {
		// write the code here to persist employee object
		Address address = new Address("vijayapur","586101");
		
		



		BankAccount account = new BankAccount(123,"1234567890");
		

		Skill skill= new Skill("Java",5);
		


		Employee employee = new Employee();
		employee.setName("Sagar");
		employee.setBasicSalary(28000.00);
		employee.setAddress(address);
		employee.setAccount(account);



		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}



	public static void main(String[] args) {
		insertTesting();
		
	}
}