package app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entities.Event;
import entities.EventType;
import dao.EventDAO;
import util.JPAutil;


public class Main {
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	private static EntityManagerFactory emf = JPAutil.getEntityManagerFactory();

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();

		EventDAO sd = new EventDAO(em);
		
		Event dinner = new Event("Gala Dinner", LocalDate.of(2023, 6, 06), "Beneficienza", EventType.PUBBLICO, 300);
		sd.save(dinner);
		logger.info(dinner.getTitle() + " has been saved");
		
		Event luncheon = new Event("Hollywood Luncheon", LocalDate.of(2023, 12, 23), "Beneficienza", EventType.PRIVATO, 800);
		sd.save(luncheon);
		logger.info(luncheon.getTitle() + " has been saved");
		
		Event brunch = new Event("BYOD Brunch", LocalDate.of(2023, 6, 06), "Festa privata", EventType.PRIVATO, 150);
		sd.save(brunch);
		logger.info(brunch.getTitle() + " has been saved");
		
		sd.refresh(2);
		
		sd.findByIdAndDelete(5);


		em.close();
		emf.close();

	}

}