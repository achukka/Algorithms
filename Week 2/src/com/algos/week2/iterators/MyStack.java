package com.algos.week2.iterators;

import com.algos.week2.model.MyNode;
@SuppressWarnings("unchecked")
// This is an Linked List implementation
public class MyStack<Item> implements MyIterable<Item> {
	public MyNode<Item> top = null;

	public void push(Item item) {
		MyNode<Item> cur = top;
		top = new MyNode<Item>();
		top.setItem(item);
		top.setNext(cur);
	}

	public Item pop() {
		if (isEmpty()) {
			return null;
		}
		Item out = top.getItem();
		top = top.getNext();
		return out;
	}

	private boolean isEmpty() {
		return null == top;
	}

	@Override
	public MyIterator<Item> myIterator() {
		return new MyListIterator();
	}

	private class MyListIterator implements MyIterator<Item> {

		private MyNode<Item> current = top;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.getItem();
			current = current.getNext();
			return item;
		}

	}
}
