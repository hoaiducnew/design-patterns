package behavior.iterator.diner.version3;

import java.util.Iterator;
import java.util.List;

import behavior.iterator.diner.MenuItem;
import behavior.iterator.diner.version3.menu.Menu;

public class Waitress2 {
	List<Menu> menus;

	public Waitress2(List<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			System.out.println("\n" + menu.toString());
			printMenu(menu.createIterator());
		}
	}

	void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
