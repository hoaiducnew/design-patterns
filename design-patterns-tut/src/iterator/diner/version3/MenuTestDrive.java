package iterator.diner.version3;

import iterator.diner.version3.menu.CafeMenu;
import iterator.diner.version3.menu.DinerMenu;
import iterator.diner.version3.menu.Menu;
import iterator.diner.version3.menu.PancakeHouseMenu;

public class MenuTestDrive {
	public static void main(String args[]) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

		waitress.printMenu();
	}
}
