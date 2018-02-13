package ua.logos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
        for (int i = 1; i <= 20; i++) {
        	CarModel model = new CarModel("Model #" + i);
        	em.persist(model);
		}
        
//        for (int i = 1; i <= 50; i++) {
//        	CarModel model = em.createQuery("SELECT m FROM CarModel m WHERE m.id = :id", CarModel.class)
//        			.setParameter("id", new Long(i))
//        			.getSingleResult();	
//        	CarMake make = new CarMake("Make " + i, new Date(2, 2, 1998));
//        	make.setCarModel(model);
//        }
        
        for (int i = 1; i < 20; i++) {
        	CarSeller carSeller = new CarSeller("name-" + i, "last name-" + i, 25, 380984786700L + i);
        	em.persist(carSeller);   	
		}
        
        for (double i = 1.6; i <= 2.8; i += 0.2) {
        	CarEngineCapacity engineCapacity = new CarEngineCapacity(new BigDecimal(i));
        	em.persist(engineCapacity);
		}
        
        for (int i = 1; i < 10; i++) {
        	CarColor color = new CarColor("Color #" + i);
        	em.persist(color);
        }
        
        for (int i = 1; i < 10; i++) {
        	CarFuelType fuelType = new CarFuelType("Fuel #" + i);
        	em.persist(fuelType);
        }
        
        for (double i = 100000.0; i <= 200000.0; i += 5000.0) {
        	Car car = new Car(new BigDecimal(i));
        	em.persist(car);
		}
        
        em.getTransaction().commit();
        
        em.close();
        factory.close();
    }
}
