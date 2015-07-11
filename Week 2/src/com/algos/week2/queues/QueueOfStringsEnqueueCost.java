package com.algos.week2.queues;

// This is an array implementation
//O(N) - Enqueue , O(1) Dequeue
public class QueueOfStringsEnqueueCost {
	public String[] myQueue;
	public int len;

	public QueueOfStringsEnqueueCost(int size) {
		myQueue = new String[size];
		this.len = 0;
	}

	public void enqueue(String item) {
		for (int i = len; i > 0; i--) {
			myQueue[i] = myQueue[i - 1];
		}
		len++;
		myQueue[0] = item;
	}

	public String dequeue() {
		if (isEmpty()) {
			return "NO DATA";
		}
		return myQueue[--len];
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
			result += myQueue[i] + " ";
		}
		return result;
	}
}
