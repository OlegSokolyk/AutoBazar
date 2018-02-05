package ua.logos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.entity.CarSeller;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
        EntityManager em = factory.createEntityManager();
        
        
//        em.getTransaction().begin();
//        for (int i = 1; i < 10; i++) {
//        	
//        	CarSeller carSeller = new CarSeller("name-" + i, "last name-" + i, 25, "38098478678" + i);
//        	em.persist(carSeller);
//        	
//		}
//        em.getTransaction().commit();
        
        em.close();
        factory.close();
    }
}
