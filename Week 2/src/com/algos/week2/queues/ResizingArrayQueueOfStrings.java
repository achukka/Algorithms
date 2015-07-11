package com.algos.week2.queues;

//This is an Resized Arrayarray implementation
// O(N) Enqueue, O(1) Dequeue
public class ResizingArrayQueueOfStrings {
	public String[] myQueue;
	public int len;

	public ResizingArrayQueueOfStrings() {
		myQueue = new String[1];
		this.len = 0;
	}

	public ResizingArrayQueueOfStrings(int capacity) {
		myQueue = new String[capacity];
		this.len = 0;
	}

	public void enqueue(String item) {
		if (len == myQueue.length) {
			reSize(2 * len);
		}
		for(int i=len;i>0;i--){
			myQueue[i]=myQueue[i-1];
		}
		myQueue[0]=item;
		len++;
	}

	public String dequeue() {
		if (isEmpty()) {
			return "NO DATA";
		}

		if (len > 0 && len < myQueue.length / 4) {
			reSize(myQueue.length / 2);
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

	private void reSize(int capacity) {
		String[] copy = new String[capacity];
		for (int i = 0; i < len; i++) {
			copy[i] = myQueue[i];
		}
		myQueue = copy;
	}

}
