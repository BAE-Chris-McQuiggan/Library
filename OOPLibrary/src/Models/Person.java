package Models;

import Interfaces.Updateable;

public class Person implements Updateable {

	private static int personRefID = 111;
	private static int incPersonID = 100;

	@Override
	public void update(int ID) {
		// TODO Auto-generated method stub

	}

	public static int getPersonRefID() {
		return personRefID;
	}

	public static int getIncPersonID() {
		return incPersonID;
	}

	public static void setIncPersonID() {
		Person.incPersonID++;
	}

}
