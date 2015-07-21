package com.algos.week3.sorting;

public class InsertionSort<T> {
	public void sort(Comparable<T>[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (less(a[j], a[j - 1])) {
					exch(a, j, j - 1);
				} else {
					break;
				}
			}
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
