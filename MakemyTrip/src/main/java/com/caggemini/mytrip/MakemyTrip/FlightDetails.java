package com.caggemini.mytrip.MakemyTrip;

import java.util.ArrayList;

public class FlightDetails {

	
ArrayList<Details>  flightdetails;



public FlightDetails() {
	flightdetails =  new ArrayList<Details>();
}
	


public void addFlightDetails(Details) {
	flightdetails.addAllDetailsOfFlight(mmt);
}

public ArrayList<Details> removeBankAccountById(int flightNo) {	
	flightdetails.remove(flightNo);
	 return flightdetails;
}


public ArrayList<Details> updateDetails(String arrivalTime,String destination ) {
	 for(Details acc: flightdetails) {
{
		
		 }
	 }
	 throw new RuntimeException("no flight available");
}








public static void main(String[] args) {

	
	FlightDetails list1 = new FlightDetails();	
	list1.addAllDetailsOfFlight(new  Details(123,1500,"IndianAirlines","Bangalore","2am","10am","Delhi");
	list1.addAllDetailsOfFlight(new  Details(123,1500,"IndianAirlines","Bangalore","6am","10am","Shimla");
	list1.addAllDetailsOfFlight(new  Details(123,1500,"IndianAirlines","Bangalore","8am","11am","Kerala");
	


}



private void addAllDetailsOfFlight(Details details) {
	// TODO Auto-generated method stub
	
}
}