package com.algos.week2.stacks;

//This is an Resized Arrayarray implementation
public class ResizingArrayStackOfStrings {
	public String[] myStack;
	public int len;

	public ResizingArrayStackOfStrings() {
		myStack = new String[1];
		this.len = 0;
	}

	public ResizingArrayStackOfStrings(int capacity) {
		myStack = new String[capacity];
		this.len = 0;
	}

	public void push(String item) {
		if (len == myStack.length) {
			reSize(2 * len);
		}
		myStack[len++] = item;
	}

	public String pop() {
		if (isEmpty()) {
			return "NO DATA";
		}

		if (len > 0 && len < myStack.length / 4) {
			reSize(myStack.length / 2);
		}

		return myStack[--len];
	}

	private boolean isEmpty() {
		if (len == 0)
			return true;
		return false;
	}

	public int size() {
		return len;
	}

	public String display() {
		String result = "";
		for (int i = len - 1; i >= 0; i--) {
			result += myStack[i] + " ";
		}
		return result;
	}

	private void reSize(int capacity) {
		String[] copy = new String[capacity];
		for (int i = 0; i < len; i++) {
			copy[i] = myStack[i];
		}
		myStack = copy;
	}

}
