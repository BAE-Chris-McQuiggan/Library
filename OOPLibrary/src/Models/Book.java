package Models;

import Interfaces.idGeneratorable;

public class Book extends Item implements idGeneratorable {

	private static int refBookID = 222;
	private static int indiBookID = 100;
	String title;

	public Book(String title) {
		setiD(idGen());
		this.title = title;
	}

	// public Book(String title) {
	// super();
	// this.iD = idGen();
	// this.title = title;
	// }

	// public int getID() {
	// return iD;
	// }

	// public void setID() {
	// this.iD = idGen();
	// }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static int getRefBookID() {
		return refBookID;
	}

	public static int getIndiBookID() {
		return indiBookID;
	}

	@Override
	public int idGen() {
		indiBookID++;
		return Integer.parseInt(Integer.toString(getItemRefID()) + Integer.toString(getRefBookID())
				+ Integer.toString(getIndiBookID()));
	}

	@Override
	public String toString() {
		return "Book [ID= " + getiD() + ", Title= " + title + "]";
	}

}
