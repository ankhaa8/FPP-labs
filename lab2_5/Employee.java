package lab2_5;

import java.time.LocalDate;
import java.util.*;

public class Employee {
	//private Account savingAcc;
	//private Account checkingAcc;
	//private Account retirementAcc;
	private String name;
	private LocalDate hireDate;
	private List<Account> accounts;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		this.name = name;
		accounts = new ArrayList<Account>();
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public String getFormattedAccountInfo() {
		String result = "\nACCOUNT INFO FOR " + getName() + ":" + "\n";
		for(Account a: accounts) {
			result += "AccountType: " + a.getAccType().toString() + "\n" ;
			result += "Balance: " + a.getBalance() + "\n" ;
		}
		return result;
	}

	public void deposit(int accountIndex, double amount) {
		Account selected= accounts.get(accountIndex);
		selected.makeDeposit(amount);		
	}

	public boolean withdraw(int accountIndex, double amount) {		
		Account selected= accounts.get(accountIndex);
		return selected.makeWithdraw(amount);
	}
	
	public List<Account> getAccounts(){ 
		return this.accounts;
	}
	public void createNewSavings(double startingBalance) {
		
		Account acct=new SavingsAccount(startingBalance, this);		
		accounts.add(acct);		
	}
	
	public void createNewChecking(double startingBalance) {
		Account acct=new CheckingAccount(startingBalance, this);		
		accounts.add(acct);
	}

	public void createNewRetirement(double startingBalance) {
		Account acct=new RetirementAccount(startingBalance, this);
		accounts.add(acct);
	}
}
