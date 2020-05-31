package Daily_Code_Byte;

import java.util.Scanner;

public class Finding_Missing_Number_In_A_Sorted_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();

		findMissingNumber(arr);

		s.close();
	}

	private static void findMissingNumber(int[] arr) {
		int n = arr.length;
		int numbers[] = new int[n];

		for (int i = 0; i < n; i++) {
			if(arr[i]!=n+1)
				numbers[arr[i]-1]++;
			else
				numbers[arr[i]-2]++;
		}

		for (int i = 0; i < n; i++) {
			if(numbers[i] == 0)
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
