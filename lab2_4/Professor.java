package lab2_4;

public class Professor extends Employee {
	private int numberOfPublication;
	public Professor(String aName, double aSalary, int aYear, int aMonth, int aDay, int numPub){
		super(aName,aSalary,aYear, aMonth,aDay);
		numberOfPublication = numPub;
	}
	public int getNumberOfPublication() {
		return numberOfPublication;
	}
	public void setNumberOfPublication(int num) {
		 numberOfPublication = num;
	}
}
