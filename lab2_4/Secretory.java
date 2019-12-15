package lab2_4;

public class Secretory extends Employee{
	private double overTimeHour;
	public Secretory(String aName, double aSalary, int aYear, int aMonth, int aDay, int numPub){
		super(aName,aSalary,aYear, aMonth,aDay);
		overTimeHour = numPub;
	}
	public double getOverTimeHour() {
		return overTimeHour;
	}
	public void setOverTimeHour(int num) {
		overTimeHour = num;
	}
	//@override
	public double computeSalary() {
		return super.computeSalary() + overTimeHour*12;
	}
	
}

