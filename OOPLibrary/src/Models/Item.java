package Models;

public abstract class Item {
	private static int itemRefID = 111;
	private int iD;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public static int getItemRefID() {
		return itemRefID;
	}

}
