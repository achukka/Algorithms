package com.algos.week2.main;

import java.util.Scanner;

import com.algos.week2.queues.LinkedListQueueOfStrings;
import com.algos.week2.queues.QueueOfStringsDequeueCost;
import com.algos.week2.queues.QueueOfStringsEnqueueCost;
import com.algos.week2.queues.ResizingArrayQueueOfStrings;

public class TestQueues {
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println(
				"Select the program to be tested\n1. QueueOfStrings(Array- O(N) Enqueue)\n2. QueueOfStrings(Array- O(N) Dequeue)");
		System.out.println("3. QueueOfStrings(ResizedArray)\n4. QueueOfStrings(LinkedList)");
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
		default:
			System.out.println("Wrong choice dude!!\n");
		}
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
		// TODO Auto-generated method stub
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
