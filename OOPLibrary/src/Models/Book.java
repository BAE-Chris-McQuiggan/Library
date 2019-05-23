package Models;

import Interfaces.CheckInable;
import Interfaces.CheckOutable;
import Interfaces.Removeable;
import Interfaces.Updateable;
import Interfaces.idGenerator;

public class Book extends Item implements Updateable, CheckOutable, CheckInable, Removeable, idGenerator {

	private static int refBookID = 222;
	private static int indiBookID = 100;
	int iD;
	String title;

	public int getID() {
		return iD;
	}

	public void setID() {
		this.iD = idGen();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book(int iD, String title) {
		super();
		this.title = title;
	}

	@Override
	public void update(int ID) {

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

}
