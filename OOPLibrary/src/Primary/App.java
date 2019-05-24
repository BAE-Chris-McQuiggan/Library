package Primary;

import Models.Library;
import Models.UserManager;

public class App {
	public static void main(String[] args) {

		Library manchesterLib = new Library();
		manchesterLib.addItem("Lord of the Rings: The Fellowship of the Ring");
		manchesterLib.addItem("Lord of the Rings: The Two Towers");
		manchesterLib.addItem("Lord of the Rings: The Return of the King");
		manchesterLib.addItem("The Times", "24th May 2019");
		manchesterLib.addItem("The Telegraph", "24th May 2019");
		manchesterLib.addItem("The Independant", "24th May 2019");
		manchesterLib.addItem("The Sun", "21st June 2018");
		manchesterLib.addItem("London", 1990);
		manchesterLib.addItem("Manchester", 1998);
		manchesterLib.addItem("Chester", 1980);

		UserManager manchesterUsers = new UserManager();
		manchesterUsers.addUser("Bob", "Dillan", 87);
		manchesterUsers.addUser("Lucy", "Dillan", 79);
		manchesterUsers.addUser("Richard", "Dillan", 52);

		System.out.println(manchesterLib);
		System.out.println(manchesterUsers);
	}
}