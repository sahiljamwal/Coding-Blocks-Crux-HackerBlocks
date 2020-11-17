package Arrays;

import java.util.Scanner;

public class ArrayOperations {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = takeInput();

		display(arr);
		// int arr[] = { 88, 77, 66, 44 };
		// int arr1[] = { 10, 30, 50, 70, 89 };
		System.out.println(linearSearch(arr, 50));
		System.out.println(binarySearch(arr, 500));
		
		display(arr);
		bubbleSort(arr);
		display(arr);
		
		display(arr);
		selectionSort(arr);
		display(arr);
		
		display(arr);
		insertionSort(arr);
		display(arr);

	}

	private static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int counter = 1; counter < n; counter++) {
			int value = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = value;
		}
	}

	private static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int counter = 0; counter < n - 1; counter++) {
			int min = counter;

			for (int j = counter + 1; j < n; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;
		}
	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int counter = 0; counter < n - 1; counter++) {
			for (int j = 0; j < n - 1 - counter; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// Complexity O(logn) but array must be sorted
	private static int binarySearch(int[] arr1, int item) {
		int n = arr1.length;
		int low = 0;
		int high = n - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;

			if (arr1[mid] < item) {
				low = mid + 1;
			} else if (arr1[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

	// Complexity O(n)
	private static int linearSearch(int[] arr, int item) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == item)
				return i;
		}
		return -1;
	}

	private static void display(int[] arr) {
		int n = arr.length;
		System.out.println("Elements of Array are :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static int[] takeInput() {

		System.out.println("Enter size ?");
		int n = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + i + " element of array :");
			arr[i] = s.nextInt();
		}

		return arr;
	}

}
