package lab2_7_case2;

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
		PersonWithJob personWJob = (PersonWithJob) p;
		if(personWJob.getClass() != this.getClass()) return false;
		boolean isEqual = super.getName().equals(personWJob.getName()) && 
				super.getDateOfBirth().equals(personWJob.getDateOfBirth()) &&
				this.salary == personWJob.getSalary();
		return isEqual;
	}
}
