package Models;

import java.util.ArrayList;

import Interfaces.Addable;

public class Library implements Addable {
	public ArrayList<Item> itemList = new ArrayList<Item>();
	public ArrayList<Person> userList = new ArrayList<Person>();

	@Override
	public void addItem(String title) {
		int iD = this.getID();
		Book newBook = new Book(iD, title);
		this.itemList.add(newBook);

	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub

	}

}
