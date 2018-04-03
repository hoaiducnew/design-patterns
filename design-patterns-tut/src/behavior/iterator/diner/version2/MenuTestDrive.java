package behavior.iterator.diner.version2;

import behavior.iterator.diner.version2.menu.PancakeHouseMenu;
import behavior.iterator.diner.version2.menu.DinerMenu;
import behavior.iterator.diner.version2.menu.Menu;

public class MenuTestDrive {
	public static void main(String args[]) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

		waitress.printMenu();
	}
}
