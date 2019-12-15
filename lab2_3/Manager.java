package lab2_3;

public class Manager extends Employee{
	private double bonus;
	public Manager( String aName,double aSalary, int aYear, int aMonth, int aDay) {
		super(aName,aSalary,aYear, aMonth,aDay);
	}
	public void setBonus(double b) {
		bonus = b;
	}
	public double getSalary() {
		return super.getSalary();
	}
}
