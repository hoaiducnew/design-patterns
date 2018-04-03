package behavior.iterator.diner.version3.menu;

import java.util.Iterator;

import behavior.iterator.diner.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
