package lab2_5;

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
}
