package lab1_3;

import java.time.LocalDate;

public class Employee {
	private Account savingAcc;
	private Account checkingAcc;
	private Account retirementAcc;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public String getFormattedAccountInfo() {
		String result = "\nACCOUNT INFO FOR " + getName() + ":" + "\n";
		result += (savingAcc == null) ? "no savingAcc"+"\n" :savingAcc.toString()+"\n";
		result += (checkingAcc == null) ? "no savingAcc"+"\n" :checkingAcc.toString()+"\n";
		result += (retirementAcc == null) ? "no savingAcc"+"\n" : retirementAcc.toString()+"\n";
		return result;
	}

	public void deposit(AccountType type, double amount) {
		switch(type) {
			case CHECKING: checkingAcc.makeDeposit(amount); break;
			case SAVINGS: savingAcc.makeDeposit(amount); break;
			case RETIREMENT: retirementAcc.makeDeposit(amount);break;			
		}
	}

	public boolean withdraw(AccountType type, double amount) {		
		switch(type) {
			case CHECKING: 
				return checkingAcc.makeWithdraw(amount);				
			case SAVINGS: 				
				return savingAcc.makeWithdraw(amount); 
			case RETIREMENT: 				
				return retirementAcc.makeWithdraw(amount);		
			default: return false;
		}	
	
	}

	public void createNewSavings(double startingBalance) {
		
		savingAcc = new Account(startingBalance, AccountType.SAVINGS, this);
	}

	public void createNewChecking(double startingBalance) {
		checkingAcc = new Account(startingBalance, AccountType.CHECKING, this);
	}

	public void createNewRetirement(double startingBalance) {
		retirementAcc = new Account(startingBalance, AccountType.RETIREMENT, this);
	}
}
