package lab2_6;

public class SavingsAccount extends Account {
	public SavingsAccount(Employee emp){		
		super(emp);
	}
	public SavingsAccount(double balance, Employee emp){		
		super(balance, emp);		
	}
	public AccountType getAccType() {		
		return AccountType.SAVINGS;
	}
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (0.25/100)*baseBalance;
		return baseBalance + interest;

	}
}
