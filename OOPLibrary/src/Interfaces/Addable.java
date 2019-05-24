package Interfaces;

public interface Addable {

	// public void addItem();
	public void addItem(String paperName, String datePublished);
	// dateOfPrint)
	// {
	// if (itemType == "Newspaper") {
	// int iD = getID();
	// Newspaper newPaper = new Newspaper(iD, paperName, dateOfPrint);
	// }
	// }

	public void addItem(String title);

	public void addItem(String itemType, String Location, int year);
	// if (itemType == "Map") {
	// int iD = getID();
	// Map newMap = new Map(iD, Location, year);
	// }
	//
	// }
}
