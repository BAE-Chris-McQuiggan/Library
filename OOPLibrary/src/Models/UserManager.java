package Models;

import java.util.ArrayList;

import Interfaces.Registerable;

public class UserManager implements Registerable {
	public ArrayList<Person> userList = new ArrayList<Person>();

	@Override
	public void addUser(String firstName, String lastName, int age) {
		Person newUser = new Person(firstName, lastName, age);
		this.userList.add(newUser);

	}

	@Override
	public String toString() {
		return "User List- " + userList;
	}

}
