package com.algos.week3.sorting;

// here we use h = 7,3,1 , f(h) = 2*f(h-1) + 1
public class ShellSort<T> {
	public void sort(Comparable<T>[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3)
			h = 3 * h + 1;

		while (h >= 1) {
			// h-sort the array
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h; j -= h) {
					if (less(a[j], a[j - h])) {
						exch(a, j, j - h);
					} else {
						break;
					}
				}
			}
			h = h / 3;
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
