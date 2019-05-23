package Models;

import Interfaces.Updateable;

public class Person implements Updateable {

	private static int personRefID = 111;

	@Override
	public void update(int ID) {
		// TODO Auto-generated method stub

	}

	public static int getPersonRefID() {
		return personRefID;
	}

}
