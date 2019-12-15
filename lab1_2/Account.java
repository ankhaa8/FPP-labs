package lab1_2;

public class Account {
	private double balance;
	private AccountType accountType;
	private Employee employee;
	
	Account(AccountType accountType, Employee employee){
		this.accountType = accountType;
		this.employee = employee;
	}
	Account(double balance, AccountType accountType, Employee employee){
		this.accountType = accountType;
		this.employee = employee;
		this.balance = balance;
	}
	public String getBalance() {		
		return Double.toString(balance);
	}
	public String toString() {
		
		return "AccountType:" + accountType + "\n"+ "Balance:" + balance;
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
	}
	public boolean makeWithdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			return true;
		} else return false;		
	}
}
