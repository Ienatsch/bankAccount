/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

public class SavingsAccount extends BankAccount {
// Data Fields

    private final int MAX_ACCOUNT = 5000000;
    private final int MIN_ACCOUNT = 1000000;
    private int accountNumber = (int) (Math.random() * MAX_ACCOUNT) + MIN_ACCOUNT;
    private final double INTEREST_RATE = .02;
    private double interestEarned = 0;
    private int monthsPassed = 0;
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
     * The SavingsAcoount constructor method Purpose: Creates a SavingsAccount
     * object with parameters
     *
     * @param int 
     * @return void
     */
    public SavingsAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * The getRoutingNumber method Purpose: gets the routingNumber
     *
     * @param void
     * @return routingNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * The getInterestRate method Purpose: gets the interestRate
     *
     * @param void
     * @return interestRate
     */
    public double getInterestRate() {
        return this.INTEREST_RATE;
    }

    /**
     * The getValue method Purpose: gets the value
     *
     * @param void
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * The setRoutingNumber method Purpose: sets the routingNumber
     *
     * @param int
     * @return void
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * The calculateInterest method Purpose: calculates the interest of the
     * account
     *
     * @param void
     * @return double
     */
    public double calculateInterest() {
        return this.value * INTEREST_RATE;
    }

    /**
     * The readFromFile method Purpose: reads the account information from a file
     *
     * @param void
     * @return void
     */
    public void readFromFile() {
        
    }
    
    /**
     * The writeToFile method Purpose: writes the account information to a file
     *
     * @param void
     * @return void
     */
    public void writeToFile() {

    }

}
