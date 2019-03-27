/** File Prologue
 * Name: Jacob Maughan & Dolan Lenatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

public class CheckingAccount extends BankAccount {
// Data Fields
	private int accountNumber = 00001;
	private double interestRate = .01;
	private double value = 0;
	
// Constructors
	/**	
	 * The CheckingAcoount default constructor method
	 * Purpose: Creates a CheckingAccount object that inherits the super data fields
	 * @param void
	 * @return void
	 */
	public CheckingAccount() {
		super();
	}
	
	/**	
	 * The CheckingAcoount constructor method
	 * Purpose: Creates a CheckingAccount object with parameters
	 * @param int
	 * @param double
	 * @param double
	 * @return void
	 */
	public CheckingAccount(int accountNumber, double interestRate, double value) {
		this.accountNumber = accountNumber;
		this.interestRate = interestRate;
		this.value = value;
	}
	
	/**	
	 * The CheckingAcoount constructor method
	 * Purpose: Creates a CheckingAccount object that with specified data fields
	 * @param String
	 * @param int
	 * @param double
	 * @param int
	 * @param double 
	 * @param double
	 * @return void
	 */
	public CheckingAccount(String bankName, int routingNumber, double totalValue, int accountNumber, double interestRate, double value) {
		super();
		this.accountNumber = accountNumber;
		this.interestRate = interestRate;
		this.value = value;
	}
// Methods
	/**	
	 * The getRoutingNumber method
	 * Purpose: gets the routingNumber
	 * @param void
	 * @return routingNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/**	
	 * The getInterestRate method
	 * Purpose: gets the interestRate
	 * @param void
	 * @return interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**	
	 * The getValue method
	 * Purpose: gets the value
	 * @param void
	 * @return value
	 */
	public double getValue() {
		return value;
	}
	
	/**	
	 * The setRoutingNumber method
	 * Purpose: sets the routingNumber
	 * @param int
	 * @return void
	 */
	public void setRoutingNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**	
	 * The setInterestRate method
	 * Purpose: sets the interestRate
	 * @param double
	 * @return void
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	/**	
	 * The setValue method
	 * Purpose: sets the value
	 * @param double
	 * @return void
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/**	
	 * The calculateInterest method
	 * Purpose: calculates the interest of the account
	 * @param void
	 * @return double
	 */
	public double calculateInterest() {
		return value * interestRate;
	}
	
	/**	
	 * The writeToFile method
	 * Purpose: writes the account information to a file
	 * @param void
	 * @return void
	 */
	public void writeToFile() {
		
	}
	
	/**	
	 * The writeToFile method
	 * Purpose: writes the account information to a specified file
	 * @param void
	 * @return void
	 */
	public void writeToFile(String fileLocation) {
		
	}

}
