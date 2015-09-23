/**
 * 
 */
package main;

import java.util.Date;

/**
 * @author GE60
 *
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new java.util.Date();

	/**
	 * 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
		id = 0;;
		balance = 0;
		annualInterestRate = 0;
	}
	public Account(int specId, double specBalance) {
		id = specId;
		balance = specBalance;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	/**
	 * @return the monthly interst rate(annualInterestRate/12)
	 */
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	/**
	 * returns and subtracts the double cash from balance
	 */
	double withdraw(double cash) {
		if(cash <= balance){
			return balance -= cash;
		}
		else {
			System.out.println("You tried wo withdraw $" + cash +" ,but you only have $" + balance + " in your account.");
			return balance;
			}
		}
	
	/**
	 *returns and adds the double cash to balance
	 */
	double deposit(double cash) {
		return balance += cash;
	}
}
