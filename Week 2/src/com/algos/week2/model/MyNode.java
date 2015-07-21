package com.algos.week2.model;

public class MyNode<Item> {
	private Item item;
	private MyNode next;

	public MyNode() {
		super();
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

}
