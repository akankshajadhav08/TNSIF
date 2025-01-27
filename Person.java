package day5TNSIF.MultilevelInheritance;

import java.time.LocalDate;

public class Person {
	
	private  String name;
	private long contactNo;
	private LocalDate dateOfBirth;
	
	public Person(String name, long contactNo, LocalDate dateOfBirth2)
	{
		super();
		this.name = name;
		this.contactNo= contactNo;
		this.dateOfBirth = dateOfBirth2;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", contactNo=" + contactNo + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
}



