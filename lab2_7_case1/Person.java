package lab2_7_case1;

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
		if(!(p instanceof Person)) return false;
		Person person = (Person) p;
		boolean isEqual = this.name.equals(person.name) && this.getDateOfBirth().equals(person.getDateOfBirth());
		return isEqual;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person("Joe", 2018, 10, 21);
		Person p1 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		Person p2 = new PersonWithJob("Joe", 2018, 10, 21, 800);
		
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.getClass());
		System.out.println(p1.getClass().getName());
		System.out.println(p1.getClass().getSimpleName());

	}

}
