package lab2_5;

public abstract class Account {
	private double balance;	
	private Employee employee;
	
	public Account(Employee employee){		
		this.employee = employee;
	}
	public Account(double balance, Employee employee){		
		this.employee = employee;
		this.balance = balance;
	}
	public String getBalance() {		
		return Double.toString(balance);
	}
	public String toString() {
		
		return "Balance:" + balance;
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
	public abstract AccountType getAccType();
}
