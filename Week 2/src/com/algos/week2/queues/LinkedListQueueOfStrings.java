package com.algos.week2.queues;

import com.algos.week2.model.Node;

// This is an Linked List implementation
// O(N) - enqueue, O(1) dequeue. Dequue logic should be opposite.
public class LinkedListQueueOfStrings {
	public Node top = null;

	public void enqueue(String item) {
		Node cur, prev;
		cur = prev = top;

		while (null != cur) {
			prev = cur;
			cur = cur.getNext();
		}
		cur = new Node();
		cur.setItem(item);

		if (prev != null) {
			prev.setNext(cur);
		}
		cur.setNext(null);
		if (top == null) {
			top = cur;
		}
	}

	public String dequeue() {
		if (isEmpty()) {
			return "NO DATA";
		}
		String out = top.getItem();
		top = top.getNext();
		return out;
	}

	// O(1) enqueue , O(N) dequeu
	//
	// public void enqueue(String item) { Node cur= top; top = new Node();
	// top.setItem(item); top.setNext(cur); }
	//
	// public String dequeue() { if (isEmpty()) { return "NO DATA"; } Node
	// cur,prev; cur=prev=top; while(null !=cur){ cur =cur.getNext(); prev= cur;
	// } return prev.getItem(); }
	//

	private boolean isEmpty() {
		return null == top;
	}

	public String display() {
		String result = "";
		Node cur = top;
		while (null != cur) {
			result += cur.getItem() + " ";
			cur = cur.getNext();
		}
		return result;
	}
}
