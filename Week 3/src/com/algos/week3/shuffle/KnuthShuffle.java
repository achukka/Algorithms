package com.algos.week3.shuffle;

import java.util.Random;

public class KnuthShuffle<T> {
	Random random;

	public void shuffle(T[] a) {
		int N = a.length;
		int r = 0;
		random = new Random();
		for (int i = 0; i < N; i++) {
			r = random.nextInt(i + 1);
			exch(a, i, r);
		}
	}

	private void exch(T[] a, int i, int r) {
		T swap = a[r];
		a[r] = a[i];
		a[i] = swap;
	}

	public void display(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}
