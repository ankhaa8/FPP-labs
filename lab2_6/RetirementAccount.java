package lab2_6;

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
	public void setBalance(double bal) {
		super.setBalance(bal);
	}
	@Override
	public boolean makeWithdraw(double amount) {

		double bal = super.getBalance();

		double penalty = bal * (2 / 100);
		bal = bal - amount - penalty;
		if (bal < 0) {
			return false;
		}
		setBalance(bal);
		return true;
	}
}
