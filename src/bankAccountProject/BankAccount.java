/** File Prologue
 * Name: Jacob Maughan & Dolan Lenatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

public class BankAccount {
// Data Fields
	private String accountName = "default";
	private int routingNumber = 123456;
	private double value = 0;
	private String fileLocation = "";
	
// Constructors
	/**	
	 * The default BankAccount constructor method
	 * Purpose: create a default BankAccount object
	 * @param void
	 * @return void
	 */
	public BankAccount() {
	}
	
	/**	
	 * The BankAccount constructor method
	 * Purpose: create a BankAccount object that takes parameters
	 * @param String
	 * @param int
	 * @param double
	 * @return void
	 */
	public BankAccount(String accountName, int routingNumber, double value) {
		this.accountName = accountName;
		this.routingNumber = routingNumber;
		this.value = value;
	}
	
// Methods
	/**	
	 * The getBankName method
	 * Purpose: returns the bankName to the user
	 * @param void
	 * @return String
	 */
	public String getBankName() {
		return accountName;
	}
	
	/**	
	 * The getRoutingNumber method
	 * Purpose: returns the routingNumber to the user
	 * @param void
	 * @return int
	 */
	public int getRoutingNumber() {
		return routingNumber;
	}
	
	/**	
	 * The get value method
	 * Purpose: returns the value to the user
	 * @param void
	 * @return double
	 */
	public double value() {
		return value;
	}
	
	/**	
	 * The getFileLocation method
	 * Purpose: returns the fileLocation to the user
	 * @param void
	 * @return String
	 */
	public String getFileLocation() {
		return fileLocation;
	}
	
	/**	
	 * The setBankName method
	 * Purpose: sets the accountName
	 * @param String
	 * @return void
	 */
	public void setBankName(String accountName) {
		this.accountName = accountName;
	}
	
	/**	
	 * The setAccountNumber method
	 * Purpose: sets the accountNumber
	 * @param int
	 * @return void
	 */
	public void setAccountNumber(int accountNumber) {
		this.routingNumber = accountNumber;
	}
	
	/**	
	 * The set value method
	 * Purpose: sets the value
	 * @param double
	 * @return void
	 */
	public void value(double value) {
		this.value = value;
	}
	
	/**	
	 * The setFileLocation method
	 * Purpose: sets the fileLocation
	 * @param String
	 * @return void
	 */
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	
	/**	
	 * The deposit method
	 * Purpose: adds money to value
	 * @param BankAccount - where the money is going
	 * @param double - how much is going in the account
	 * @return void
	 */
	public void deposit(BankAccount account, double deposit) {
		account.value += deposit;
	}
	
	/**	
	 * The withdraw method
	 * Purpose: subtracts money from an account
	 * @param BankAccount - where the money is coming from
	 * @param double - how much is being withdrawn
	 * @return void
	 */
	public void withdraw(BankAccount account, double withdraw) {
		account.value -= withdraw;
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
	
	/**	
	 * The readFromFile method
	 * Purpose: reads the account information from a file
	 * @param void
	 * @return void
	 */
	public void readFromFile() {
		
	}
	
	/**	
	 * The readFromFile method
	 * Purpose: reads the account information from a specified file
	 * @param void
	 * @return void
	 */
	public void readFromFile(String fileLocation) {
		
	}
	
	/**	
	 * The toString method
	 * Purpose: displays the account information correctly
	 * @param void
	 * @return void
	 */
	public String toString() {
		return "";
	}
}
