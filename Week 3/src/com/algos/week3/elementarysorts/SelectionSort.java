package com.algos.week3.elementarysorts;

public class SelectionSort<T> {
	public void sort(Comparable<T>[] a) {
		int N = a.length;
		int min = 0;
		for (int i = 0; i < N; i++) {
			min = i;
			for (int j = i; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
		}
	}

	private void exch(Comparable<T>[] a, int i, int j) {
		Comparable<T> swp = a[i];
		a[i] = a[j];
		a[j] = swp;
	}

	private boolean less(Comparable<T> a, Comparable<T> b) {
		int val = a.compareTo((T) b);
		if (val < 0) {
			return true;
		}
		return false;
	}

	public void display(Comparable<T>[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}
