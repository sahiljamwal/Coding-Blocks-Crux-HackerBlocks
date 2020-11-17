package Arrays;

public class GeneratingAllSubarrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		generateSubArrays(arr);
	}

	private static void generateSubArrays(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}

}
