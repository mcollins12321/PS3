/**
 * 
 */
package main;
import java.util.Date;
/**
 * @author GE60
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account test = new Account();
		test.setId(1122);
		test.setBalance(20000);
		test.setAnnualInterestRate(4.5);
		test.withdraw(2500);
		test.deposit(3000);
		System.out.println("The balance is $" + test.getBalance());
		System.out.println("The monthly interst rate is " + test.getMonthlyInterestRate() +"%");
		System.out.println("The account was created on: " + test.getDateCreated());
		test.withdraw(30000);
		System.out.println("The balance is $" + test.getBalance());
	}

}
