package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione_eventi");

	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
};
