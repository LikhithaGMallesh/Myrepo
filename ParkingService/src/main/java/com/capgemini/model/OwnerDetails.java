package com.capgemini.model;




public class OwnerDetails {
	

	String ownerName;
	String phoneNo;
	String entryTime;
	
   public OwnerDetails(String ownerName, String phoneNo, String entryTime) {
		super();
		this.ownerName = ownerName;
		this.phoneNo = phoneNo;
		this.entryTime = entryTime;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "OwnerDetails [ownerName=" + ownerName + ", phoneNo=" + phoneNo + ", entryTime=" + entryTime + "]";
	}

	public BuildingDetails getId() {
		// TODO Auto-generated method stub
		return null;
	}

	

	


	
	
}


