/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

import java.util.*;
import java.io.*;

public class BankAccountTest {

	public static void main(String[] args) {
		// Declare the scanner
		Scanner input = new Scanner(System.in);

		// Create an ArrayList of references to BankAccount objects
		ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

		// Create one CheckingAccount object and store the reference to it in the
		// ArrayList
		CheckingAccount myChecking = new CheckingAccount(123456, 125.00);
		bankAccounts.add(myChecking);

		// Create two SavingsAccount objects and store references to them in the
		// ArrayList
		SavingsAccount savings1 = new SavingsAccount(234567, 300.00);
		SavingsAccount savings2 = new SavingsAccount(245678, 150.00);
		bankAccounts.add(savings1);
		bankAccounts.add(savings2);

		// Display a summary of the accounts so that the user can access them
		System.out.println("-- Account Name ---- Account Number ---- Value ");
                bankAccounts.forEach(x -> System.out.format(" %-23s%-17s%s%n", x.getBankName(), x.getAccountNumber(),
				x.getValue()));

		// Ask the user for the day of their deposit
		System.out.format("%nPlease enter today's date: (MM/DD/YYYY)");
		String[] todaysDate = input.next().split("");
		int todaysMonth = Integer.parseInt(todaysDate[0] + todaysDate[1]);
		int todaysYear = Integer.parseInt(todaysDate[6] + todaysDate[7] + todaysDate[8] + todaysDate[9]);

		int selection = 0;
		do {
			System.out.println("Press 1 to Deposit");
			System.out.println("Press 2 to Withdraw");
			System.out.println("Press 3 to Exit");

			selection = input.nextInt();

			switch (selection) {
			case 1: // Deposit money in an account
				// ask the user to enter the account number and deposit amount
				System.out.println("Please enter the account number (123456) and deposit amount (350.00)");
				int depositAccountNumber = input.nextInt();
				double deposit = input.nextDouble();

                                bankAccounts.forEach(x -> {
                                    if(x.getAccountNumber() == depositAccountNumber) {
                                        x.deposit(deposit);
                                        x.printValue();
                                    }
                                });
				break;

			case 2: // Withdraw money out of an account
				// ask the user to enter the account number and withdraw amount
				System.out.println("Please enter the account number (123456) and withdraw amount (350.00)");
				int withdrawAccountNumber = input.nextInt();
				double withdraw = input.nextDouble();

                                bankAccounts.forEach(x -> {
                                    if(x.getAccountNumber() == withdrawAccountNumber) {
                                        x.withdraw(withdraw);
                                        x.printValue();
                                    }
                                });
				break;
			}

		} while (selection < 3);

		System.out.println("The total value of all of your accounts is: " + BankAccount.calcValue(bankAccounts));
          
		// Create a file on disk and for each account in the list write out
		// The account name
		// The account number
		// The account balance
		// The interest earned
		// Close the file
		// Open the file
		// Output the headings on the console for the bank report
		// Read in the data from the file on disk for each account
		// Write the data for each account on the console

	}

}