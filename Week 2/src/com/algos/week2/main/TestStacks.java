package com.algos.week2.main;


import java.util.Scanner;

import com.algos.week2.iterators.MyIterator;
import com.algos.week2.iterators.MyStack;
import com.algos.week2.stacks.LinkedListStackOfStrings;
import com.algos.week2.stacks.ResizingArrayStackOfStrings;
import com.algos.week2.stacks.StackOfStrings;

public class TestStacks {
	private static Scanner scan;

	public static void main(String[] args) {
	
		System.out.println("Select the program to be tested\n1. StackOfStrings(Array)\n2. StackOfStrings(LinkedList)");
		System.out
				.println("3. StackOfStrings(ResizedArray)\n4. Stack - Generic (Integer)\n5. Stack - Generic (String)");
		scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			testStackOfStrings();
			break;
		case 2:
			testMyStackOfStrings(); // Linked Lists
			break;
		case 3:
			testResizingArrayStackOfStrings();
			break;
		case 4:
			testGenericStacksInt();
			break;
		case 5:
			testGenericStacksString();
			break;
		default:
			System.out.println("Wrong choice dude!!\n");
	
		}
	}

	private static void testGenericStacksString() {
		MyStack<String> stack = new MyStack<>();
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(stack.pop() + " ");
			} else {
				stack.push(input);
			}
			input = scan.next();
		}
		System.out.println("\nRemaining Stack:");
		MyIterator<String> myIterator = stack.myIterator();
		while (myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}

		System.out.println("");
	}

	private static void testGenericStacksInt() {
		MyStack<Integer> myStack = new MyStack<>();
		scan = new Scanner(System.in);
		int input = scan.nextInt();
		while (input != -1) {
			if (input == 0) {
				System.out.print(myStack.pop() + " ");
			} else {
				myStack.push(new Integer(input));
			}
			input = scan.nextInt();
		}
		System.out.println("\nRemaining Stack");
		MyIterator<Integer> myIterator = myStack.myIterator();
		while (myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}

		System.out.println("");
	}

	private static void testResizingArrayStackOfStrings() {
		ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(stack.pop() + " ");
			} else {
				stack.push(input);
			}
			input = scan.next();
		}
		System.out.println("");
		System.out.println("Remaining Stack:" + stack.display());

	}

	private static void testMyStackOfStrings() {
		LinkedListStackOfStrings stack = new LinkedListStackOfStrings();
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(stack.pop() + " ");
			} else {
				stack.push(input);
			}
			input = scan.next();
		}
		System.out.println("");
		System.out.println("Remaining Stack:" + stack.display());
	}

	private static void testStackOfStrings() {
		StackOfStrings stack = new StackOfStrings(10);
		scan = new Scanner(System.in);
		String input = scan.next();
		while (!input.equals("-1")) {
			if (input.equals("-")) {
				System.out.print(stack.pop() + " ");
			} else {
				stack.push(input);
			}
			input = scan.next();
		}
		System.out.println("");
		System.out.println("Remaining Stack:" + stack.display());
	}
}
