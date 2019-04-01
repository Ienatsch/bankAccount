/** File Prologue
 * Name: Jacob Maughan & Dolan Lenatsch
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
        BankAccount myChecking = new BankAccount();
        bankAccounts.add(myChecking);
        
		// Create two SavingsAccount objects and store references to them in the ArrayList
        BankAccount savings1 = new SavingsAccount();
        BankAccount savings2 = new SavingsAccount();
        bankAccounts.add(savings1);
        bankAccounts.add(savings2);
        
        // Ask the user for the day of their deposit
        // Or should we just get the current date one the program starts and parse through that?
        
        // Display a summary of the accounts so that the user can access them
        System.out.println("-- Account Name ---- Account Number ---- Value ");
        System.out.println("   " + myChecking.getBankName() + "           " + myChecking.getRoutingNumber() + "              " + myChecking.getValue() + " ");
        System.out.println("   " + savings1.getBankName() + "           " + savings1.getRoutingNumber() + "              " + savings1.getValue() + " ");
        System.out.println("   " + savings2.getBankName() + "           " + savings2.getRoutingNumber() + "              " + savings2.getValue() + " ");
        
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
                    	myChecking.deposit(myChecking, deposit);
                    	// Test output
                    	System.out.println(myChecking.getValue());
                    } else if (accountNumber == 234567) {
                    	savings1.deposit(savings1, deposit);
     
                    } else if (accountNumber == 245678) {
                    	savings2.deposit(savings2, deposit);
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
                    	// Test output
                    	System.out.println(myChecking.getValue());
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