package com.algos.week2.queues;

// This is an array implementation
// O(1) - Enqueue , O(N) Dequeue
public class QueueOfStringsDequeueCost {
	public String[] myQueue;
	public int len;

	public QueueOfStringsDequeueCost(int size) {
		myQueue = new String[size];
		this.len = 0;
	}
	
	public void enqueue(String item) {
		myQueue[len++] = item;
	}

	public String dequeue() {
		if (isEmpty()) {
			return "NO DATA";
		}
		String item=myQueue[0];
		for(int i=0;i<len;i++){
			myQueue[i]=myQueue[i+1];
		}
		len--;
		return item;
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
		for (int i = 0; i < len; i++) {
			result += myQueue[i] + " ";
		}
		return result;
	}
}
