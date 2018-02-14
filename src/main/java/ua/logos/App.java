package ua.logos;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.entity.Car;
import ua.logos.entity.CarColor;
import ua.logos.entity.CarEngineCapacity;
import ua.logos.entity.CarFuelType;
import ua.logos.entity.CarMake;
import ua.logos.entity.CarModel;
import ua.logos.entity.CarSeller;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
        EntityManager em = factory.createEntityManager();
        
        
        em.getTransaction().begin();
        
//        for (int i = 1; i <= 20; i++) {
//        	CarSeller carSeller = new CarSeller("name-" + i, "last name-" + i, 25, 380984786700L + i);
//        	em.persist(carSeller);   	
//		}    
        
//        for (double i = 1.6; i <= 5.4; i += 0.2) {
//        	CarEngineCapacity engineCapacity = new CarEngineCapacity(new BigDecimal(i));
//        	em.persist(engineCapacity);
//		}
        
//        for (int i = 1; i <= 20; i++) {
//        	CarColor color = new CarColor("Color #" + i);
//        	em.persist(color);
//        }
//        
//        for (int i = 1; i <= 20; i++) {
//        	CarFuelType fuelType = new CarFuelType("Fuel #" + i);
//        	em.persist(fuelType);
//        }
        
//        for (int i = 1; i <= 20; i++) {
//        	        	
//        	CarColor color = em.createQuery("SELECT c FROM CarColor c WHERE c.id = :id", CarColor.class)
//        			.setParameter("id", new Long(i)).getSingleResult();
//        	
//        	CarFuelType fuelType = em.createQuery("SELECT f FROM CarFuelType f WHERE f.id = :id", CarFuelType.class)
//        			.setParameter("id", new Long(i)).getSingleResult();
//        	
//        	CarEngineCapacity engineCapacity = em.createQuery("SELECT cec FROM CarEngineCapacity cec WHERE cec.id = :id", CarEngineCapacity.class)
//        			.setParameter("id", new Long(i)).getSingleResult();
//        	 	
//        	CarModel model = new CarModel("Model #" + i);
//        	model.setCarColor(color);
//        	model.setEngineCapacity(engineCapacity);
//        	model.setFuelType(fuelType);
//        	em.persist(model);
//		}
        
//      for (int i = 1; i <= 20; i++) {
//    	CarModel model = em.createQuery("SELECT m FROM CarModel m WHERE m.id = :id", CarModel.class)
//    			.setParameter("id", new Long(i)).getSingleResult();	
//    	CarMake make = new CarMake("Make " + i, 1950 + i);
//    	make.setCarModel(model);
//    	em.persist(make);
//      }
//      
       double price = 100000.0;
        
       for (int i = 1; i <= 20; i++) {
        	CarMake make = em.createQuery("SELECT cm FROM CarMake cm WHERE cm.id = :id", CarMake.class)
        			.setParameter("id", new Long(i)).getSingleResult();
        	CarSeller seller = em.createQuery("SELECT s FROM CarSeller s WHERE s.id = :id", CarSeller.class)
        			.setParameter("id", new Long(i)).getSingleResult();
        	Car car = new Car(new BigDecimal(price));
        	car.setCarMake(make);
        	car.setCarSeller(seller);
        	em.persist(car);
        	price+=5000;
		}
        
        em.getTransaction().commit();
        
        em.close();
        factory.close();
    }
}
