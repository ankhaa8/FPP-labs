package solution.prog2_7_equals.case3;

import java.util.GregorianCalendar;

public class PersonWithJob  {
	private Person person;
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		this.salary = salary;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return person.getDateOfBirth();
	}
	public double getSalary() {
		return salary;
	}
	
	//Can use either same classes or instanceof strategy here
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(getClass() != ob.getClass()) return false;
		PersonWithJob p = (PersonWithJob)ob;
		return p.person.equals(person) && p.salary == salary;
	}
}
