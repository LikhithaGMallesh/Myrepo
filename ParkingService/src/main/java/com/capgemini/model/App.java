package com.capgemini.model;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ParkingService park=new ParkingService();
    	OwnerDetails owner=new OwnerDetails("Latha", "1564361", "11:11");
    	park.addCar(new OwnerDetails("Leesha","9685421745", "10:00"));
    	park.addCar(new OwnerDetails("Likhi","9880493656", "8:00"));
    	park.addCar(new OwnerDetails("Soumya","8954563248", "8:00"));
    	park.addCar(new OwnerDetails("Deepu","6987455627", "9:00"));
    	park.addCar(new OwnerDetails("Yash","8288811768", "9:30"));
    	park.addCar(new OwnerDetails("kala","9611544862", "9:00"));
    	park.addCar(new OwnerDetails("abc","9856787829", "7:00"));
    	park.addCar(new OwnerDetails("anu","9880493896", "8:00"));
    	park.addCar(new OwnerDetails("hema","9731806278", "3:00"));
    	park.addCar(new OwnerDetails("manu","9707896587", "11:00"));
    	park.addCar(new OwnerDetails("disha","8288811768", "11:00"));
    	park.addCar(owner);
    	park.getAllCars();
    	for(Map.Entry e: park.getAllCars() ) {
    	System.out.println(e.getKey()+" " + e.getValue());
    	}
    	System.out.println(park.getCarById(owner.getId()));
    	}

    
    
    	

    }

