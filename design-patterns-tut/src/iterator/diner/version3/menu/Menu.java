package iterator.diner.version3.menu;

import java.util.Iterator;

import iterator.diner.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
