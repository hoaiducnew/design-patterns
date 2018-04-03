package iterator.diner.version2;

import iterator.diner.version2.menu.DinerMenu;
import iterator.diner.version2.menu.Menu;
import iterator.diner.version2.menu.PancakeHouseMenu;

public class MenuTestDrive {
	public static void main(String args[]) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

		waitress.printMenu();
	}
}
