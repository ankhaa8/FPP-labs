package lab2_5;

public class CheckingAccount extends Account {
	public CheckingAccount(Employee emp){		
		super(emp);
	}
	public CheckingAccount(double balance, Employee emp){		
		super(balance, emp);		
	}
	public AccountType getAccType() {				
		return AccountType.CHECKING;
	}
}
