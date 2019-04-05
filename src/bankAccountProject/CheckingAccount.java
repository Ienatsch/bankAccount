/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 * Code Created by Dalan
 */
package bankAccountProject;

public class CheckingAccount extends BankAccount {
// Data Fields

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

// Methods
    /**
     * The toString method Purpose: calculates the total value of all accounts
     *
     * @return double sum of all accounts values
     */
    @Override
    public String toString() {
        return "This is Checking Account " + this.getAccountNumber() + " and it currently has a balance of - " + this.getValue();
    }

}
