package Models;

import Interfaces.idGeneratorable;

public class Person implements idGeneratorable {

	private static int personRefID = 111;
	private static int indiPerID = 100;
	int iD;
	String firstName;
	String lastName;
	int age;

	public Person(String firstName, String lastName, int age) {
		super();
		this.iD = idGen();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public static int getPersonRefID() {
		return personRefID;
	}

	public static int getIndiPerID() {
		return indiPerID;
	}

	public static void setIndiPerID() {
		Person.indiPerID++;
	}

	@Override
	public int idGen() {
		indiPerID++;
		return Integer.parseInt(Integer.toString(getPersonRefID()) + Integer.toString(getIndiPerID()));
	}

	@Override
	public String toString() {
		return "User [ID= " + iD + ", First Name= " + firstName + ", Last Name= " + lastName + ", Age= " + age + "]";
	}

}
