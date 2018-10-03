package com.capgemini.bank;

/** this comment is documentation based comment
 * 
 * @author likhgm
 * @since  03-10-18
 */
public class BankAccount {
	
	int accountNo;
	String accountHolderName;
	double accountBalance;
    static int autoAccountNoGen;
	
	
	public BankAccount() {
		accountNo=++autoAccountNoGen;
		accountHolderName="Unknown";
		accountBalance=0;
	}



	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		accountNo=++autoAccountNoGen;
         this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	public void withdraw(double amount) {
		accountBalance-=amount;
	}
	
	public void deposit(double amount) {
		accountBalance-=amount;
	}
	
	
	
	
 public int getAccountNo() {
		return accountNo;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}



	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}



	
}
