/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 * Code Created by Dalan
 */
package bankAccountProject;

import java.io.*;
public class SavingsAccount extends BankAccount {
// Data Fields
    private double interestRate = .02;
    private int numMonths = 0;

// Constructors
    /**
     * The SavingsAcoount default constructor method Purpose: Creates a
     * SavingsAccount object that inherits the super data fields
     *
     * @param void
     * @return void
     */
    public SavingsAccount() {
        super();
    }
    
    /**
     * The SavingsAccount constructor method 
     * purpose: Creates a SavingsAccount object with specified parameters
     * @param Sting
     * @param int
     * @param double
     * @return void
     */
    public SavingsAccount(String accountName, int accountNumber, double initialValue) {
    	super(accountName, accountNumber, initialValue);
    }

// Methods
    /**
     * The getInterestRate method Purpose: gets the interestRate
     *
     * @param void
     * @return interestRate
     */
    public double getInterestRate() {
        return this.interestRate;
    }

    /**
     * The getNumMonths method 
     * Purpose: gets the number of months since the last time the user had a transaction
     *
     * @param void
     * @return numMonths
     */
    public int getNumMonths() {
    	return this.numMonths;
    }
    
    /**
     * The setNumMonths method 
     * Purpose: sets the number of months since the last time the user had a transaction
     *
     * @param int
     * @return void
     */
    public void setNumMonths(int numMonths) {
    	this.numMonths = numMonths;
    }

    /**
     * The setInterestRate method Purpose: sets the interestRate
     *
     * @param double
     * @return void
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * The calculateInterest method Purpose: calculates the interest of the
     * account
     *
     * @param void
     * @return double
     */
    public double calculateInterest() {
    	return getValue() * this.interestRate * numMonths;
        
    }

    /**
     * The calcValue method Purpose: calculates the total value of this account
     *
     * @param void
     * @return double
     */
    public double calcValue() {
        return getValue() + calculateInterest();
    }

    /**
     * The toString method Purpose: calculates the total value of all accounts
     *
     * @return double sum of all accounts values
     */
    @Override
    public String toString() {
        return "This is Savings Account " + this.getAccountNumber() + " and it currently has a balance of - " + this.getValue() + " and it has earned " + this.calculateInterest();
    }
    
    /**
     * The write method 
     * purpose: writes specified data fields to a file
     * @param PrintWriter
     * @return void
     */
    @Override
    public void write(PrintWriter pw) {
    	pw.println("S"); // mark this as a savings account
    	pw.println(getAccountNumber());
    	pw.println(getValue());
    	pw.println(calculateInterest());
    	super.write(pw);
    }

}
