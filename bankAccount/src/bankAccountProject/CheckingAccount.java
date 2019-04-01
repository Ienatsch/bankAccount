/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

public class CheckingAccount extends BankAccount {
// Data Fields
    private final int MAX_ACCOUNT = 5000000;
    private final int MIN_ACCOUNT = 1000000;
    private int accountNumber = (int) (Math.random() * MAX_ACCOUNT) + MIN_ACCOUNT;
    
    
// Constructors
    /**
     * The CheckingAcoount default constructor method Purpose: Creates a
     * CheckingAccount object that inherits the super data fields
     *
     * @param void
     * @return void
     */
    public CheckingAccount() {
        super();
    }

    /**
     * The CheckingAcoount constructor method Purpose: Creates a CheckingAccount
     * object with parameters
     *
     * @param int
     * @return void
     */
    public CheckingAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

// Methods
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
     * The getValue method Purpose: gets the value
     *
     * @param void
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * The setValue method Purpose: sets the value
     *
     * @param double
     * @return void
     */
    public void setValue(double value) {
        this.value = value;
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
