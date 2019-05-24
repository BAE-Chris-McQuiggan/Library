package Models;

import Interfaces.CheckInable;
import Interfaces.CheckOutable;
import Interfaces.Removeable;
import Interfaces.Updateable;
import Interfaces.idGenerator;

public class Map extends Item implements Updateable, CheckOutable, CheckInable, Removeable, idGenerator {

	private static int refMapID = 333;
	private static int indiMapID = 100;
	int iD;
	String Location;
	int year;

	public Map(String location, int year) {
		super();
		this.iD = idGen();
		this.Location = location;
		this.year = year;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getID() {
		return iD;
	}

	public void setID() {
		this.iD = idGen();
	}

	public static int getRefMapID() {
		return refMapID;
	}

	public static int getIndiMapID() {
		return indiMapID;
	}

	@Override
	public void update(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public int idGen() {
		indiMapID++;
		return Integer.parseInt(
				Integer.toString(getItemRefID()) + Integer.toString(getRefMapID()) + Integer.toString(getIndiMapID()));
	}

}
