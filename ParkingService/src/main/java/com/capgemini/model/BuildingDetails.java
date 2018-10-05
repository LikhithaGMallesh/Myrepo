package com.capgemini.model;

public class BuildingDetails{

int compartments;
int sections;
int floors;

/**
 * 
 * default constructor**/
public  BuildingDetails() {
	
}


public BuildingDetails(int compartments, int sections, int floors) {
	super();
	this.compartments = compartments;
	this.sections = sections;
	this.floors = floors;
}

//getters and setters


public int getCompartments() {
	return compartments;
}

public void setCompartments(int compartments) {
	this.compartments = compartments;
}

public int getSections() {
	return sections;
}

public void setSections(int sections) {
	this.sections = sections;
}

public int getFloors() {
	return floors;
}

public void setFloors(int floors) {
	this.floors = floors;
}

//ToString method
@Override
public String toString() {
	return "BuildingDetails [compartments=" + compartments + ", sections=" + sections + ", floors=" + floors + "]";
}



	

}