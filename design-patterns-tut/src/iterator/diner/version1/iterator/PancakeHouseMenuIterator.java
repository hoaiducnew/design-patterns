package iterator.diner.version1.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
	List items;
	int position = 0;

	public PancakeHouseMenuIterator(List items) {
		this.items = items;
	}

	public Object next() {
		Object item = items.get(position);
		position = position + 1;
		return item;
	}

	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
