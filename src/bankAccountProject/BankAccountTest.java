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
		Scanner input =  new Scanner(System.in);

		// Create an ArrayList of references to BankAccount objects
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        
		// Create one CheckingAccount object and store the reference to it in the ArrayList
        CheckingAccount myChecking = new CheckingAccount(123456, 125.00);
        bankAccounts.add(myChecking);
        
		// Create two SavingsAccount objects and store references to them in the ArrayList
        SavingsAccount savings1 = new SavingsAccount(234567, 300.00);
        SavingsAccount savings2 = new SavingsAccount(245678, 150.00);
        bankAccounts.add(savings1);
        bankAccounts.add(savings2);
        
        // Ask the user for the day of their deposit
        System.out.println("What is today's date? (MM/DD/YYYY)");
        String todaysDate = input.next();
        String[] splitDate = todaysDate.split("");
        String month = splitDate[0]+splitDate[1];
        String year = splitDate[6] + splitDate[7] + splitDate[8] + splitDate[9];
        
        
        // Display a summary of the accounts so that the user can access them
        System.out.println("-- Account Name ---- Account Number ---- Value ");
        System.out.println("   " + myChecking.getBankName() + "           " + myChecking.getAccountNumber() + "              " + myChecking.getValue() + " ");
        System.out.println("   " + savings1.getBankName() + "           " + savings1.getAccountNumber() + "              " + savings1.getValue() + " ");
        System.out.println("   " + savings2.getBankName() + "           " + savings2.getAccountNumber() + "              " + savings2.getValue() + " ");
        
        int selection = 0;
		do {
            System.out.println("Press 1 to Deposit");
            System.out.println("Press 2 to Withdraw");
            System.out.println("Press 3 to Exit");

            selection = input.nextInt();
            int accountNumber = 0;

            switch (selection) {
                case 1: // Deposit money in an account
                    // ask the user to enter the account number and deposit amount
                    System.out.println("Please enter the account number (123456) and deposit amount (350.00)");
                    accountNumber = input.nextInt();
                    double deposit = input.nextDouble();
                    
                    // add the deposit amount to the value
                    if (accountNumber == 123456) {
                    	myChecking.deposit(deposit);
                    } else if (accountNumber == 234567) {
                    	savings1.deposit(deposit);
     
                    } else if (accountNumber == 245678) {
                    	savings2.deposit(deposit);
                    } else
                    	System.out.println("You did not enter a valid account number. Please try again.");
                    break;
                    
                case 2: // Withdraw money out of an account
                    // ask the user to enter the account number and withdraw amount
                	System.out.println("Please enter the account number (123456) and withdraw amount (350.00)");
                	accountNumber = input.nextInt();
                    double withdraw = input.nextDouble();
                    
                    // subtract the withdraw amount from the value
                    if (accountNumber == 123456) {
                    	myChecking.withdraw(myChecking, withdraw);
                    } else if (accountNumber == 234567) {
                    	savings1.withdraw(savings1, withdraw);
                    } else if (accountNumber == 245678) {
                    	savings2.withdraw(savings2, withdraw);
                    } else
                    	System.out.println("You did not enter a valid account number. Please try again.");
                    break;
            }
            
        } while (selection < 3);
		
		System.out.println("calcValue = " + myChecking.calcValue(myChecking, savings1, savings2));

			
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