package lab2_7_case2;

import java.time.LocalDate;

public class Person {

	private String name;
	private LocalDate dateOfBirth;
	
	Person(String name, int year, int month, int dayOfMonth) {
		this.name = name;
		dateOfBirth = LocalDate.of(year, month, dayOfMonth);
	}
	public String getName() {
		return name;
	}
		
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public boolean equals(Object p) {
		if(p == null) return false;
		Person person = (Person) p;
		if(person.getClass() != this.getClass()) return false;
		boolean isEqual = this.name.equals(person.name) && 
				this.getDateOfBirth().equals(person.getDateOfBirth());
		return isEqual;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Joe", 2018, 10, 21);
		Person p1 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		Person p2 = new PersonWithJob("Joe", 2018, 10, 21, 800);
		
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));

	}

}
