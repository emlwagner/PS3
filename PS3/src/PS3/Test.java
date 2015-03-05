package PS3;

import java.util.Scanner;

public class Test extends Account {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id = 1122;
		double balance = 20000;
		Account account = new Account(id, balance);
		double newBalance = balance;
		
		// Prompt user to enter the annual interest rate
		System.out.println("Enter the annual interest rate: ");
		double annualInterestRate = account.setAnnualInterestRate(input.nextDouble());

		// Prompt user to enter withdrawal amount
		System.out.println("Enter the amount you would like to withdraw: ");
		double withdrawal_amount = input.nextDouble();
		
		// test to see if there are sufficient funds in the account

		try {
			newBalance = account.withdraw(withdrawal_amount);
		} catch (InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

		// Prompt user to enter the deposit amount
		System.out.println("Enter the amount you would like to deposit: ");
		double deposit_amount = input.nextDouble();
		
		// deposit the desired amount

		newBalance = account.deposit(deposit_amount);
		
		// display the account balance, the monthly interest rate, and the date when the account was created

		System.out.printf("The balance is $%4.2f\r", newBalance);
		System.out.println("The monthly interest rate is "
				+ account.getMontlyInterestRate());
		System.out.println("The account was created on "
				+ account.getDateCreated());

	}

}
