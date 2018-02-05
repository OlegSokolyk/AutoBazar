package ua.logos;

import java.math.BigDecimal;
import java.util.Date;

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
        for (int i = 1; i < 10; i++) {
        	
        	CarSeller carSeller = new CarSeller("name-" + i, "last name-" + i, 25, "38098478678" + i);
        	em.persist(carSeller);
        	
		}
        
        for (double i = 1.6; i <= 2.8; i += 0.2) {
        	CarEngineCapacity engineCapacity = new CarEngineCapacity(new BigDecimal(i));
        	em.persist(engineCapacity);
		}
        
        CarColor colorBlack = new CarColor("Black");
        CarColor colorWhite = new CarColor("White");
        CarColor colorRed = new CarColor("Red");
        CarColor colorYellow = new CarColor("Yellow");
        CarColor colorGray = new CarColor("Gray");
        
        em.persist(colorBlack);
        em.persist(colorWhite);
        em.persist(colorRed);
        em.persist(colorYellow);
        em.persist(colorGray);
        
        CarFuelType fuelType = new CarFuelType("Diesel");
        CarFuelType fuelType2 = new CarFuelType("Gasoline");
        CarFuelType fuelType3 = new CarFuelType("Methanol");

        em.persist(fuelType);
        em.persist(fuelType2);
        em.persist(fuelType3);
        
        CarModel carModel = new CarModel("X6");
        CarModel carModel2 = new CarModel("A8");
        CarModel carModel3 = new CarModel("Fiesta");
        CarModel carModel4 = new CarModel("1191");
        
        em.persist(carModel);
        em.persist(carModel2);
        em.persist(carModel3);
        em.persist(carModel4);
        
        CarMake make = new CarMake("BMW", new Date(1943, 3, 22));
        CarMake make2 = new CarMake("Audi", new Date(1956, 7, 6));
        CarMake make3 = new CarMake("Mersedes-Benz", new Date(1935, 9, 26));
        CarMake make4 = new CarMake("LADA", new Date(1969, 1, 1));
        
        em.persist(make);
        em.persist(make2);
        em.persist(make3);
        em.persist(make4);
        
        for (double i = 100000.0; i <= 120000.0; i += 5000.0) {
        	Car car = new Car(new BigDecimal(i));
        	em.persist(car);
		}
        
        em.getTransaction().commit();
        
        em.close();
        factory.close();
    }
}
