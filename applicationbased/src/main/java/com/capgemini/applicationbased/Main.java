package com.capgemini.applicationbased;


public class Main {
	
	
	public static void main(String[] args){
		
		
        CreateAccount account = new CreateAccount(1234,"yashu","ICIC09");
        System.out.println("you have created account : " +account);
       
        try {
        	
            account.WithdrawMoney();
            
        } catch (InsufficientBalException | MinimumAmountDeposit e) {
           
            e.printStackTrace();
        }
    }

}
