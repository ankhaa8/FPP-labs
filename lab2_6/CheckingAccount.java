package lab2_6;

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
	@Override
	public double getBalance() {
		double bal = super.getBalance()-5.0;
		super.setBalance(bal);
		return bal;
	}
}
