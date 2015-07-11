package com.algos.week2.stacks;

// This is an array implementation
public class StackOfStrings {
	public String[] myStack;
	public int len;

	public StackOfStrings(int size) {
		myStack = new String[size];
		this.len = 0;
	}

	public void push(String item) {
		myStack[len++] = item;
	}

	public String pop() {
		if (isEmpty()) {
			return "NO DATA";
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
}
