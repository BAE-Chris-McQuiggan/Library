package Models;

import java.util.ArrayList;

import Interfaces.Addable;
import Interfaces.CheckInable;
import Interfaces.CheckOutable;
import Interfaces.Removeable;

public class Library implements Addable, Removeable, CheckInable, CheckOutable {
	public ArrayList<Item> itemList = new ArrayList<Item>();

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
	public void addItem(String Location, int year) {
		Map newMap = new Map(Location, year);
		this.itemList.add(newMap);

	}

	@Override
	public void removeItem(int iD) {
		for (int i = 0; i < this.itemList.size(); i++) {
			if (itemList.get(i).getiD() == iD) {
				itemList.remove(i);
			}
		}

	}

	@Override
	public String toString() {
		return "Library- " + itemList;
	}

}
