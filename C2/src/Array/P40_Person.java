package Array;

public class P40_Person {
	private String lastName;
	private String firstName;
	private int age;
	
	public P40_Person(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.println("lastName: " + lastName + " ,FristName: " + firstName + " age: " + age);
	}
	
	public String getLast() {
		return lastName;
	}
	
}
