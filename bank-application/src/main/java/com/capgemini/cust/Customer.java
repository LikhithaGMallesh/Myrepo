package com.capgemini.cust;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.SavingAccVer2;
import com.capgemini.bank.SavingsAccount;

public class Customer {
	
	
	public static void main(String[] args) {
		

            SavingAccVer2 acc=null;
            acc = new SavingAccVer2(null, 0);
            acc.withdraw(2000);
            acc.deposit(4000);
            acc.display();
            
           /* acc=new SavingAccount();
            acc.withdraw(5000);
            
            
            
		  BankAccount acc2=new BankAccount();
		  BankAccount acc3=acc;
		   acc2.deposit(2000);
		 
		 System.out.println("Bank Account 1"+acc);
		 System.err.println("Bank Account 2"+acc2);
		 System.out.println("Bank Account 3"+acc3);

		 */
	 }
		

}
