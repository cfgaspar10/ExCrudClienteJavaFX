package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {
	
	private JPAFactory() {
		// garante que nunca vai instanciado
	}
	
	private static EntityManagerFactory emf = 	Persistence.createEntityManagerFactory("CrudClienteJavaFX");
	
	public static EntityManager geEntityManager() {
		return emf.createEntityManager();
	}
}
