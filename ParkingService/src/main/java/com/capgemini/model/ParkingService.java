package com.capgemini.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParkingService {

//HashMap<BuildingDetails,OwnerDetails> vech=new HashMap<BuildingDetails,OwnerDetails>();
   static int floors=1;
   static int sections=1;
   static int compartments=1;

   
   Map<BuildingDetails,OwnerDetails> vech;

public ParkingService() {
	vech=new HashMap<>();

}
	
	
	public BuildingDetails  addCar(OwnerDetails car)
	{
		if(compartments>10)
		{
			sections++;
			compartments=1;
			
			
			if(sections>4)
			{
				floors++;
				sections=1;
				compartments=1;
		}
	}
		BuildingDetails key=new BuildingDetails(compartments,sections,floors);
		
	vech.put(key,car);
	compartments++;
	
	return  key;
	}
	public Set<Map.Entry<BuildingDetails,OwnerDetails>> getAllCars(){
		  return vech.entrySet();
		  
		}
		public OwnerDetails getCarById(BuildingDetails id) {
		return vech.get(id);
		}

		}

		

  

