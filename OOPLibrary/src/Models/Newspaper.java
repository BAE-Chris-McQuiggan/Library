package Models;

import Interfaces.Addable;
import Interfaces.CheckInable;
import Interfaces.CheckOutable;
import Interfaces.Removeable;
import Interfaces.Updateable;
import Interfaces.idGenerator;

public class Newspaper extends Item implements Updateable, CheckOutable, CheckInable, Addable, Removeable, idGenerator {

	private static int refPaperID = 444;
	private static int indiPaperID = 100;
	int iD;
	String paperName;
	String datePublished;

	public Newspaper(int iD, String paperName, String datePublished) {
		super();
		this.iD = iD;
		this.paperName = paperName;
		this.datePublished = datePublished;
	}

	public int getID() {
		return iD;
	}

	public void setID() {
		this.iD = idGen();
	}

	@Override
	public void update(int ID) {
		// TODO Auto-generated method stub

	}

	public static int getRefPaperID() {
		return refPaperID;
	}

	public static int getIndiPaperID() {
		return indiPaperID;
	}

	public static void setIndiPaperID() {
		Newspaper.indiPaperID++;
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub

	}

	@Override
	public int idGen() {
		indiPaperID++;
		return Integer.parseInt(Integer.toString(getItemRefID()) + Integer.toString(getRefPaperID())
				+ Integer.toString(getIndiPaperID()));
	}

}
