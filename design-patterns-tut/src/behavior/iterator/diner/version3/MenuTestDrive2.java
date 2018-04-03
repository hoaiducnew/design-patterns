package behavior.iterator.diner.version3;
import java.util.ArrayList;
import java.util.List;

import behavior.iterator.diner.version3.menu.CafeMenu;
import behavior.iterator.diner.version3.menu.DinerMenu;
import behavior.iterator.diner.version3.menu.Menu;
import behavior.iterator.diner.version3.menu.PancakeHouseMenu;

public class MenuTestDrive2 {
	public static void main(String args[]) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		
		List<Menu> menus = new ArrayList<>();		
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);
		
		Waitress2 waitress = new Waitress2(menus);
		waitress.printMenu();
	}
}
