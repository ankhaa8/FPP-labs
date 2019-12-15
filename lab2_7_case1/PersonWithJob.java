package lab2_7_case1;


public class PersonWithJob extends Person {
	
	private double salary;
	PersonWithJob(String name, int year, int month, int dayOfMonth, double salary) {
		super(name, year, month, dayOfMonth);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public boolean equals(Object p) {
		if(p == null) return false;
		if(!(p instanceof PersonWithJob)) return false;
		PersonWithJob personWJob = (PersonWithJob) p;
		boolean isEqual = super.getName().equals(personWJob.getName()) && 
				super.getDateOfBirth().equals(personWJob.getDateOfBirth()) &&
				this.salary == personWJob.getSalary();
		return isEqual;
	}
}
