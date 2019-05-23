package Models;

import Interfaces.Addable;
import Interfaces.CheckInable;
import Interfaces.CheckOutable;
import Interfaces.Removeable;
import Interfaces.Updateable;

public class Book extends Item implements Updateable, CheckOutable, CheckInable, Addable, Removeable {

	private static int bookRefID = 222;
	private static int incBookID = 100;

	@Override
	public void update(int ID) {
		System.out.println("something");

	}

	public static int getBookRefID() {
		return bookRefID;
	}

	public static int getIncBookID() {
		return incBookID;
	}

	public static void setIncBookID(int incBookID) {
		Book.incBookID = incBookID;
	}

}
