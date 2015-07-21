package com.algos.week2.main;

import java.util.Scanner;

import com.algos.week2.iterators.MyIterator;
import com.algos.week2.iterators.MyQueue;
import com.algos.week2.queues.LinkedListQueueOfStrings;
import com.algos.week2.queues.QueueOfStringsDequeueCost;
import com.algos.week2.queues.QueueOfStringsEnqueueCost;
import com.algos.week2.queues.ResizingArrayQueueOfStrings;

public class TestQueues {
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println(
				"Select the program to be tested\n1. QueueOfStrings(Array- O(N) Enqueue)\n2. QueueOfStrings(Array- O(N) Dequeue)");
		System.out.println("3. QueueOfStrings(ResizedArray)\n4. QueueOfStrings(LinkedList)\n5. Queue - Generic (String)\n6. Queue - Generic (Integer)");
		scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			testQueueOfStringsEnqueueCost();
			break;
		case 2:
			testQueueOfStringsDequeueCost();
			break;
		case 3:
			testResizingArrayQueueOfStrings();
			break;
		case 4:
			testMyQueueOfStrings(); // Linked Lists
			break;
		case 5:
			testMyQueueGeneric(); // Linked Lists
			break;
		case 6:
			testMyQueueGenericInt(); // Linked Lists
			break;
		default:
			System.out.println("Wrong choice dude!!\n");
		}
	}

	private static void testMyQueueGenericInt() {
		MyQueue<Integer> queue = new MyQueue<>();
		scan = new Scanner(System.in);
		Integer input = scan.nextInt();
		while (input != -1) {
			if (input == 0) {
				System.out.print(queue.dequeue() + " ");
			} else {
				queue.enqueue(input);
			}
			input = scan.nextInt();
		}
		System.out.println("");
		MyIterator<Integer> myIterator = queue.myIterator();
		while (myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		System.out.println("");
	}

	private static void testMyQueueGeneric() {
		MyQueue<String> queue = new MyQueue<>();
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(queue.dequeue() + " ");
			} else {
				queue.enqueue(input);
			}
			input = scan.next();
		}
		System.out.println("\nRemaining Queue");
		MyIterator<String> myIterator =  queue.myIterator();
		while (myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		System.out.println("");
	}

	private static void testMyQueueOfStrings() {
		LinkedListQueueOfStrings queue = new LinkedListQueueOfStrings();
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(queue.dequeue() + " ");
			} else {
				queue.enqueue(input);
			}
			input = scan.next();
		}
		System.out.println("");
		System.out.println("Remaining Queue:" + queue.display());
	}

	private static void testResizingArrayQueueOfStrings() {
		ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings();
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(queue.dequeue() + " ");
			} else {
				queue.enqueue(input);
			}
			input = scan.next();
		}
		System.out.println("");
		System.out.println("Remaining Queue:" + queue.display());

	}

	private static void testQueueOfStringsDequeueCost() {
		QueueOfStringsDequeueCost queue = new QueueOfStringsDequeueCost(10);
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(queue.dequeue() + " ");
			} else {
				queue.enqueue(input);
			}
			input = scan.next();
		}
		System.out.println("");
		System.out.println("Remaining Queue:" + queue.display());
	}

	private static void testQueueOfStringsEnqueueCost() {
		QueueOfStringsEnqueueCost queue = new QueueOfStringsEnqueueCost(10);
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(queue.dequeue() + " ");
			} else {
				queue.enqueue(input);
			}
			input = scan.next();
		}
		System.out.println("");
		System.out.println("Remaining Queue:" + queue.display());
	}
}
