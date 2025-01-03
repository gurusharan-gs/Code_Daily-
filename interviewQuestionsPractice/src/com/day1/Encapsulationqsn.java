package com.day1;import java.awt.AlphaComposite;

class BankAccount{
	
	 // Private fields (Encapsulation)
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    
	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}
	
	
	  // Public method to deposit money
    public void deposit(double amount) {
    	if(amount > 0) {
    		balance += amount;
    		System.out.println("Deposited: $" + amount);
    	}else {
    		System.out.println("Invalid deposit amount");
    	}
    }
    
    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
     
}



public class Encapsulationqsn {
	
	public static void main(String[] args) {
		
		// Create a bank account
        BankAccount account = new BankAccount("John Doe", "123456789", 500.00);
        
        // Access account details using getters
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit money
        account.deposit(500.00);
        System.out.println("Updated Balance: $" + account.getBalance());
        
        // Withdraw money
        account.withdraw(300.00);
        System.out.println("Updated Balance: $" + account.getBalance());
        
        // Attempt to withdraw more than the balance
        account.withdraw(1500.00);
        
	}

}
