package Models;

import Interfaces.idGeneratorable;

public class Newspaper extends Item implements idGeneratorable {

	private static int refPaperID = 444;
	private static int indiPaperID = 100;
	String paperName;
	String datePublished;

	public Newspaper(String paperName, String datePublished) {
		super();
		setiD(idGen());
		this.paperName = paperName;
		this.datePublished = datePublished;
	}

	// public int getID() {
	// return iD;
	// }
	//
	// public void setID() {
	// this.iD = idGen();
	// }

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
	public int idGen() {
		indiPaperID++;
		return Integer.parseInt(Integer.toString(getItemRefID()) + Integer.toString(getRefPaperID())
				+ Integer.toString(getIndiPaperID()));
	}

	@Override
	public String toString() {
		return "Newspaper [ID= " + getiD() + ", Paper Publisher Name= " + paperName + ", Date Published= "
				+ datePublished + "]";
	}

}
