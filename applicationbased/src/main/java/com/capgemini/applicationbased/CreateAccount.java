package com.capgemini.applicationbased;

	
	
	
	
	
	
import java.util.Scanner;

public class CreateAccount {
  private   int accountId;  
  private  String accountantName;
   private String IFSCcode;

   public CreateAccount(int accountId,String accountantName,String IFSCcode){
    this.accountId = accountId;
    this.accountantName = accountantName;
    this.IFSCcode = IFSCcode;
   }

   
      public void setAccountantName(String accountantName) {
	this.accountantName = accountantName;
}


	public int getAccountId() {
	return accountId;
}


public String getAccountantName() {
	return accountantName;
}


public String getIFSCcode() {
	return IFSCcode;
}


	public void WithdrawMoney() throws InsufficientBalException, MinimumAmountDeposit{

	   double Currentbalance = 0.00;
	           Scanner deposit = new Scanner(System.in);
	           System.out.println("please enter the deposit amount");
	           double Depositamount = deposit.nextDouble();
	           Currentbalance += Depositamount ;
	           System.out.println("your currentbalance="+Currentbalance);
	           final double setDailyLimit = 2500.00;     

	            Scanner withDraw = new Scanner(System.in);
	            System.out.println("please enter the withdraw amount");
	            double WithdrawMoney =withDraw.nextDouble();


	        if(Currentbalance < WithdrawMoney)
	            System.out.println("you have less amount : your current balance is="+Currentbalance);

	        else if (WithdrawMoney > setDailyLimit)
	            System.out.println("you have entered amount exceed than daily limit : your dailyLimit="+setDailyLimit);

	        else 
	            Currentbalance -= WithdrawMoney;
	            System.out.println("your current balance is="+Currentbalance);

	    }
   
   
   public String toString(){

       return "accountId="+this.accountId + " " + "accountantname="+this.accountantName +  " " +"IFSCcode="+this.IFSCcode;
   }
}

	
	
	
	
	
	
	
	
	
	



