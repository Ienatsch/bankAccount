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

    private final int MONTHS_PER_YEAR = 12;
    private final int INITIAL_YEAR = 2012;
    private final int INITIAL_MONTH = 1;
    private double interestRate = .02;
    private double originalAmount = 0;

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
     * The SavingsAccount constructor method purpose: Creates a SavingsAccount
     * object with specified parameters
     *
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
     * The setOriginalAmount method Purpose: gets the original amount deposited when accounts where opened
     *
     * @param double
     * @return void
     */
    public void setOriginalAmount(double originalAmount) {
    	this.originalAmount = originalAmount;
    }

    /**
     * The calcTimePassed method Purpose: calculate the time passed since
     * initial deposit
     *
     * @param int
     * @param int
     * @return numMonths
     */
    public void calcTimePassed(int month, int year) {
        if (year > INITIAL_YEAR && month > 0 && month <= MONTHS_PER_YEAR) {
            int initialTime = 0;
            int yearsToMonths = this.INITIAL_YEAR * MONTHS_PER_YEAR;
            initialTime = yearsToMonths + this.INITIAL_MONTH;

            int currentTime = 0;
            int currentYearsToMonths = year * MONTHS_PER_YEAR;
            currentTime = currentYearsToMonths + month;

            int timePassed = currentTime - initialTime;
            this.setNumMonths(timePassed);
        } else {
            this.setNumMonths(0);
        }
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
        return this.originalAmount * this.interestRate * this.getNumMonths();
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
     * The write method purpose: writes specified data fields to a file
     *
     * @param PrintWriter
     * @return void
     */
    @Override
    public void write(PrintWriter pw) {
        pw.println("S"); // mark this as a savings account
        pw.println(getAccountNumber());
        pw.println(calcValue());
        pw.println(calculateInterest());
        super.write(pw);
    }

}
