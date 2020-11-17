package Arrays;

public class LowerAndUpperBound {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 5 };

		System.out.println(getLowerBound(arr, 2));
		System.out.println(getUpperBound(arr, 2));
	}

	private static int getUpperBound(int[] arr, int data) {
		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid]==data) {
				ans=mid;
				low=mid+1;
			}else if(arr[mid]>data) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}

		return ans;
	}

	private static int getLowerBound(int[] arr, int data) {
		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid]==data) {
				ans=mid;
				high=mid-1;
			}else if(arr[mid]>data) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}

		return ans;
	}

}
