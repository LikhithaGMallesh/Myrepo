package com.capgemini.bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class BankaccVer5 {
	

    HashSet<BankAccount> bankaccList ;
    
    public void BankAccountListVer3() {
  	  bankaccList =  new HashSet<BankAccount>();
	}
    
    

    public void addNewBankAccount(BankAccount acc) {
  	  bankaccList.add(acc);
	}
    
    public HashSet<BankAccount> getAllBankAccount() {
		  return bankaccList;	
	}
    
    public BankAccount getAccountById(int accountNo) {
  	  for(BankAccount acc: bankaccList) {
  		  if(acc.getAccountNo() == accountNo) {
  	  }
  	  return acc;
    }
  	  throw new RuntimeException("Account Doesn't Exist");
 }
    
   public HashSet<BankAccount> removeBankAccountById(int accountNo) {	
  	 bankaccList.remove(accountNo);
  	 return bankaccList;
	}
   
   public HashSet<BankAccount> updateBankAccount(int accountNo, String accountHolderName) {
  	 for(BankAccount acc: bankaccList) {
  		 if(acc.getAccountNo() == accountNo) {
  			 acc.setAccountHolderName(accountHolderName);
		          return bankaccList;
			 }
		 }
		 throw new RuntimeException("Account Supplied Doesn't Exist");
	}
   
   public HashSet<BankAccount> sortAccountByName() {
  	 Collections.sort(bankaccList, new Comparator<BankAccount>() {
  		    public int compare(BankAccount acc1, BankAccount acc2) {
  		        return acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName());
  		    }
  		});
		return bankaccList; 
   }
   
   
   public HashSet<BankAccount> sortAccountByNameV2() {
 	 Collections.sort(bankaccList, (BankAccount acc1, BankAccount acc2) -> acc1.getAccountHolderName()
  			 .compareTo(acc2.getAccountHolderName())); 	
		return bankaccList; 
  }
   

   
   


public static void main(String[] args) {
	   /*BankAccountList list = new BankAccountList();
	   list.addNewBankAccount(new SavingsAccount("likhitha",5000.0));
	   list.addNewBankAccount(new SavingsAccount("leesha",4000.0));
	   list.addNewBankAccount(new SavingsAccount("anu",4500.0));*/
	   
	   
	   BankAccountListVer2 list1 = new BankAccountListVer2();
	   list1.addNewBankAccount(new SavingsAccount("likhitha",5000.0));
	   list1.addNewBankAccount(new SavingsAccount("leesha",4000.0));
	   list1.addNewBankAccount(new SavingsAccount("anu",4500.0));
	   
	 /*  
	   for(BankAccount acc:list1.getAllBankAccount()) {
		   System.out.println(acc);
	   }
	   
	   System.out.println(list1.getAccountById(3)); */
	   
	   for(BankAccount acc:list1.updateBankAccount(3,"Neha")) {
		   System.out.println(acc);
	   }
	 /*  
	   for(BankAccount acc:list1.removeBankAccountById(3)) {
		   System.out.println(acc);
	   }*/
	   
	   list1.sortAccountByName();
}



}





