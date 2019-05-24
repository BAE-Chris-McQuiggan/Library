package Models;

import Interfaces.idGeneratorable;

public class Map extends Item implements idGeneratorable {

	private static int refMapID = 333;
	private static int indiMapID = 100;
	String location;
	int year;

	public Map(String location, int year) {
		setiD(idGen());
		this.location = location;
		this.year = year;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// public int getID() {
	// return iD;
	// }
	//
	// public void setID() {
	// this.iD = idGen();
	// }

	public static int getRefMapID() {
		return refMapID;
	}

	public static int getIndiMapID() {
		return indiMapID;
	}

	@Override
	public int idGen() {
		indiMapID++;
		return Integer.parseInt(
				Integer.toString(getItemRefID()) + Integer.toString(getRefMapID()) + Integer.toString(getIndiMapID()));
	}

	@Override
	public String toString() {
		return "Map [ID= " + getiD() + ", Location= " + location + ", Year= " + year + "]";
	}

}
