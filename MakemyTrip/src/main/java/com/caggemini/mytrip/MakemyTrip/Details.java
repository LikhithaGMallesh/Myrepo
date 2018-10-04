package com.caggemini.mytrip.MakemyTrip;

public class Details {


	int flightNo;
      int cost;
	String airline;
	String originalCity;
	String arrivalTime;
	String depatureTime;
	String destination;
	
public Details(){
	
	
}
	
		
public Details(int flightNo, int cost, String airline, String originalCity, String arrivalTime,
		String depatureTime, String destination) {
		super();
		this.flightNo = flightNo;
		this.cost= cost;
		this.airline = airline;
		this.originalCity = originalCity;
		this.arrivalTime = arrivalTime;
		this.depatureTime = depatureTime;
		this.destination = destination;
	}


public int getFlightNo() {
	return flightNo;
}


public void setFlightNo(int flightNo) {
	this.flightNo = flightNo;
}


public int getCost() {
	return cost;
}


public void setCost(int cost) {
	this.cost = cost;
}


public String getAirline() {
	return airline;
}


public void setAirline(String airline) {
	this.airline = airline;
}


public String getOriginalCity() {
	return originalCity;
}


public void setOriginalCity(String originalCity) {
	this.originalCity = originalCity;
}


public String getArrivalTime() {
	return arrivalTime;
}


public void setArrivalTime(String arrivalTime) {
	this.arrivalTime = arrivalTime;
}


public String getDepatureTime() {
	return depatureTime;
}


public void setDepatureTime(String depatureTime) {
	this.depatureTime = depatureTime;
}


public String getDestination() {
	return destination;
}


public void setDestination(String destination) {
	this.destination = destination;
}
	
	
@Override
public String toString() {
	return "details [flightNo=" + flightNo + ", cost=" + cost + ", airline=" + airline + ", originalCity="
			+ originalCity + ", arrivalTime=" + arrivalTime + ", depatureTime=" + depatureTime + ", destination="
			+ destination + "]";
}

	
	
	
	
	
}
