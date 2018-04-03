package behavior.iterator.diner.version3;

import behavior.iterator.diner.version3.menu.PancakeHouseMenu;
import behavior.iterator.diner.version3.menu.CafeMenu;
import behavior.iterator.diner.version3.menu.DinerMenu;
import behavior.iterator.diner.version3.menu.Menu;

public class MenuTestDrive {
	public static void main(String args[]) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

		waitress.printMenu();
	}
}
