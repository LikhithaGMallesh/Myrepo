package com.capgemini.bank;



public class SavingAccVer2 extends SavingsAccount implements  Insurance {

public SavingAccVer2(String string, double d) {
		super(string, d);
		// TODO Auto-generated constructor stub
	}

	/*	public void withdraw(double amount) {
   System.out.println("Withdraw amount");
		
	}
*/
	public void deposit(double amount) {
		
		System.out.println("Withdraw amount");
	}

	public void display() {
		System.out.println("hello");
		
	}

}
