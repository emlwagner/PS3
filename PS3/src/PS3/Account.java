package PS3;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date(); 
	
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public int getID() {
		return this.id;
	}
	
	public int setID(int new_id) {
		this.id = new_id;
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double setBalance(double new_balance) {
		this.balance = new_balance;
		return this.balance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public double setAnnualInterestRate(double new_rate) {
		this.annualInterestRate = new_rate/100;
		return this.annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	public double getMontlyInterestRate() {
		return this.annualInterestRate/12;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException {
		if(amount <= this.balance) {
			return this.balance -= amount;
			
		}
		else {
			throw new InsufficientFundsException(amount);
		}
	}
	
	public double deposit(double amount) {
		return this.balance += amount;
	}

}
