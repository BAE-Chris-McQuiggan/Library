package Models;

import Interfaces.Addable;
import Interfaces.CheckInable;
import Interfaces.CheckOutable;
import Interfaces.Removeable;
import Interfaces.Updateable;

public class Map extends Item implements Updateable, CheckOutable, CheckInable, Addable, Removeable {

	private static int mapRefID = 333;
	private static int incMapID = 100;

	@Override
	public void update(int ID) {
		// TODO Auto-generated method stub

	}

	public static int getMapRefID() {
		return mapRefID;
	}

	public static int getIncMapID() {
		return incMapID;
	}

	public static void setIncMapID() {
		Map.incMapID++;
	}

}
