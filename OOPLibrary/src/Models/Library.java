package Models;

import java.util.ArrayList;

import Interfaces.Addable;

public class Library implements Addable {
	public ArrayList<Item> itemList = new ArrayList<Item>();
	public ArrayList<Person> userList = new ArrayList<Person>();

	@Override
	public void addItem(String title) {
		Book newBook = new Book(title);
		this.itemList.add(newBook);

	}

	@Override
	public void addItem(String paperName, String datePublished) {
		Newspaper newPaper = new Newspaper(datePublished, datePublished);
		this.itemList.add(newPaper);
	}

	@Override
	public void addItem(String itemType, String Location, int year) {
		Map newMap = new Map(Location, year);
		this.itemList.add(newMap);

	}

}
