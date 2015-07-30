package com.algos.week3.sorting;

public class MergeSort<T> {
	Comparable<T> aux[];

	@SuppressWarnings("unchecked")
	public void sort(Comparable<T> a[]) {
		aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}

	public void sort(Comparable<T> a[], Comparable<T> aux[], int low, int high) {
		if (high <= low)
			return;
		int mid = low + (high - low) / 2;
		sort(a, aux, low, mid);
		sort(a, aux, mid + 1, high);
		merge(a, aux, low, mid, high);
	}

	private void merge(Comparable<T>[] a, Comparable<T>[] aux, int low, int mid, int high) {
		assert isSorted(a, low, mid);
		assert isSorted(a, mid + 1, high);
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}
		int i = low, j = mid + 1;
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > high) {
				a[k] = aux[i++];
			} else if (less(aux[i], aux[j])) {
				a[k] = aux[i++];
			} else {
				a[k] = aux[j++];
			}
		}

		assert isSorted(a, low, high);
	}

	private boolean isSorted(Comparable<T>[] a, int low, int high) {
		for (int i = low; i < high; i++) {
			if (greater(a[i], a[i + 1]))
				return false;
		}
		return true;
	}

	private boolean greater(Comparable<T> a, Comparable<T> b) {
		return a.compareTo((T) b) > 0 ? true : false;
	}

	@SuppressWarnings("unchecked")
	private boolean less(Comparable<T> a, Comparable<T> b) {
		return a.compareTo((T) b) < 0 ? true : false;
	}

	public void display(Comparable<T> a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}
