package algorithm;

public class Sort {

	long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper
	 * methods. Store all the sorted data into one of the databases.
	 */

	public int[] selectionSort(int[] array) {
		final long startTime = System.currentTimeMillis();
		int[] list = array;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}

		}

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;
		return list;
	}

	public int[] insertionSort(int[] array) {
		final long startTime = System.currentTimeMillis();
		int[] list = array;
		// implement here
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;
		return list;
	}

	public int[] bubbleSort(int[] array) {
		final long startTime = System.currentTimeMillis();
		int[] list = array;
		// implement here
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;
		return list;
	}

	public int[] mergeSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public int[] quickSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public int[] heapSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public int[] bucketSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public int[] shellSort(int[] array) {
		final long startTime = System.currentTimeMillis();
		int[] list = array;
		// implement here
		int highest = 1;
		while (highest <= array.length / 3) {
			highest = 3 * highest + 1;
		}
		while (highest > 0) {
			for (int i = 0; i < array.length; i++) {

				int temp = array[i];
				int j;

				for (j = i; j > highest - 1 && array[j - highest] >= temp; j = j - highest) {
					array[j] = array[j - highest];
				}
				array[j] = temp;
			}
			highest = (highest - 1) / 3;
		}
		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;
		return list;
	}

	public static void printSortedArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
