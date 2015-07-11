package com.algos.week2.stacks;

import com.algos.week2.model.Node;

// This is an Linked List implementation
public class LinkedListStackOfStrings {
	public Node top=null;


	public void push(String item) {
		Node cur = top;
		top = new Node();
		top.setItem(item);
		top.setNext(cur);
	}

	public String pop() {
		if (isEmpty()) {
			return "NO DATA";
		}
		String out = top.getItem();
		top = top.getNext();
		return out;
	}

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
