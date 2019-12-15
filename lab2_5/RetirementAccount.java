package lab2_5;

public class RetirementAccount extends Account {
	public RetirementAccount(Employee emp){		
		super(emp);
	}
	public RetirementAccount(double balance, Employee emp){		
		super(balance, emp);		
	}
	public AccountType getAccType() {		
		return AccountType.RETIREMENT;
	}
}
