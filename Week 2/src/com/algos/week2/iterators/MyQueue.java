package com.algos.week2.iterators;

import com.algos.week2.model.MyNode;
@SuppressWarnings("unchecked")
// This is an Linked List implementation
// O(N) - enqueue, O(1) dequeue. Dequue logic should be opposite.
public class MyQueue<Item> implements MyIterable<Item> {
	public MyNode<Item> top = null;

	public void enqueue(Item item) {
		MyNode<Item> cur, prev;
		cur = prev = top;

		while (null != cur) {
			prev = cur;
			cur = cur.getNext();
		}
		cur = new MyNode<Item>();
		cur.setItem(item);

		if (prev != null) {
			prev.setNext(cur);
		}
		cur.setNext(null);
		if (top == null) {
			top = cur;
		}
	}

	public Item dequeue() {
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
