package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	      cfg.configure("hibernate.cfg.xml");
	      SessionFactory sf = cfg.buildSessionFactory();
	      Session session = sf.openSession();
	        Transaction transaction = session.beginTransaction();
	        Car car = new Car();
	        car.setName("Sedan");
	        car.setType("Car");
	        car.setMaxSpeed(180);
	        car.setColor("Red");
	        car.setNumberOfDoors(4);

	        Truck truck = new Truck();
	        truck.setName("Heavy Loader");
	        truck.setType("Truck");
	        truck.setMaxSpeed(120);
	        truck.setColor("Blue");
	        truck.setLoadCapacity(15000);

	        session.save(car);
	        session.save(truck);

	        transaction.commit();
	        session.close();

	        System.out.println("Records inserted successfully!");   

	}
}
