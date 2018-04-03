package iterator.diner.version1.menu;

import java.util.ArrayList;
import java.util.List;

import iterator.diner.MenuItem;
import iterator.diner.version1.iterator.Iterator;
import iterator.diner.version1.iterator.PancakeHouseMenuIterator;

public class PancakeHouseMenu {
	List menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList();

		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries, and blueberry syrup", true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

//	public List getItems() {
//		return menuItems;
//	}
//
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
}
