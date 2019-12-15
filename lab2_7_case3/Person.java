package lab2_7_case3;

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
		if(person.getClass() != this.getClass()) return false;
		boolean isEqual = this.name.equals(person.name) && 
				this.getDateOfBirth().equals(person.getDateOfBirth());
		return isEqual;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Person p = new Person("Joe", 2018, 10, 21);		
		PersonWithJob p1 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		PersonWithJob p2 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p));
	}

}
