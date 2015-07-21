package com.algos.week2.assignment;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
	private Node<Item> first, last;
	private int size;

	public Deque() {
		// TODO Auto-generated constructor stub
		first = null;
		last = null;
		size = 0;
	}

	// is the dequeue Empty
	public boolean isEmpty() {
		return null == first;
	}

	// returns the number of items of the dequeue
	public int size() {
		return size;
	}

	// add the item to the front
	public void addFirst(Item item) {
		if (item == null)
			throw new NullPointerException();
		Node<Item> cur = first;
		first = createNewNode(item);
		first.item = item;
		first.next = cur;
		first.prev = null;
		if (cur != null) {
			cur.prev = first;
		} else {
			last = first;
		}
		size++;
	}

	// add the item to the end
	public void addLast(Item item) {
		if (item == null)
			throw new NullPointerException();
		Node<Item> cur = last;
		last = createNewNode(item);
		last.item = item;
		last.prev = cur;
		last.next = null;
		if (cur != null) {
			cur.next = last;
		} else {
			first = last;
		}
		size++;
	}

	// remove and return the item from the front
	public Item removeFirst() {
		if (isEmpty())
			throw new NoSuchElementException();
		Item item = first.item;
		if (first == last) {
			first = null;
			last = null;
		} else {
			Node cur = first.next;
			cur.prev = null;
			first = cur;
		}

		return item;
	}

	// remove and return the item from the end
	public Item removeLast() {
		if (isEmpty())
			throw new NoSuchElementException();
		Item item = last.item;
		if (first == last) {
			first = null;
			last = null;
		} else {
			Node cur = last.prev;
			cur.next = null;
			last = cur;
		}

		return null;
	}

	private Deque<Item>.Node<Item> createNewNode(Item item) {
		Node<Item> newNode = new Node<>();
		newNode.item = item;
		newNode.prev = null;
		newNode.next = null;
		return newNode;
	}

	// return an iterator over items in order from front to end
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item> {
		private Node<Item> head = first;

		@Override
		public boolean hasNext() {
			return head != null;
		}

		@Override
		public Item next() {
			Item item = (Item) head.item;
			if (null == item)
				throw new NoSuchElementException();
			head = head.next;
			return item;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}

	}

	private class Node<Item> {
		public Item item;
		public Node next;
		public Node prev;

	}

	public static void main(String[] args) {
	}
}
