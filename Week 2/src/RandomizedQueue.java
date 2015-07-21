import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RandomizedQueue<Item> implements Iterable<Item> {

	private List<Item> itemList;

	// construct an empty randomized queue
	public RandomizedQueue() {
		itemList = new ArrayList<>();
	}

	// is the queue empty?
	public boolean isEmpty() {
		return itemList.isEmpty();
	}

	// return the number of items on the queue
	public int size() {
		return itemList.size();
	}

	// add the item
	public void enqueue(Item item) {
		if (item == null)
			throw new NullPointerException();
		int index = 0;
		if (!isEmpty()) {
			index = StdRandom.uniform(itemList.size());
		}
		itemList.add(index, item);
	}

	// remove and return a random item
	public Item dequeue() {
		if (isEmpty())
			throw new NoSuchElementException();
		int index = itemList.size() - 1;
		Item item = itemList.remove(index);
		return item;
	}

	// return (but do not remove) a random item
	public Item sample() {
		if (isEmpty())
			throw new NoSuchElementException();
		int index = StdRandom.uniform(itemList.size());
		Item item = itemList.get(index);
		return item;
	}

	// return an independent iterator over items in random order
	public Iterator<Item> iterator() {
		return new ListIterator();

	}

	private class ListIterator implements Iterator<Item> {
		private List<Item> myList = itemList;

		@Override
		public boolean hasNext() {
			return myList.size() > 0;
		}

		@Override
		public Item next() {
			int index = StdRandom.uniform(myList.size());
			return myList.remove(index);
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	// unit testing
	public static void main(String[] args) {
		/*
		 * RandomizedQueue<String> myRandomizedQueue = new RandomizedQueue<>();
		 * Scanner scan = new Scanner(System.in); String input = scan.next();
		 * while (!input.equals("-1")) { if (input.equals("-")) {
		 * System.out.print(myRandomizedQueue.dequeue() + " "); } else {
		 * myRandomizedQueue.enqueue(input); } input = scan.next(); }
		 * System.out.println(""); System.out.println("Remaining Queue:");
		 * Iterator<String> myIterator = myRandomizedQueue.iterator(); while
		 * (myIterator.hasNext()) { System.out.print(myIterator.next() + " "); }
		 * System.out.println("");
		 */
	}

}
