package Challenges_Fundamentals;

import java.util.Scanner;

public class Conversion_Fahrenheit_To_Celsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		int step = s.nextInt();
		for (int farhen = min; farhen <= max; farhen += step) {
			double celcius = (5 / 9.0) * (farhen - 32);
			if (celcius < 0) {
				celcius *= -1;
				celcius = Math.floor(celcius);
				celcius*=-1;
			} else {
				celcius = Math.floor(celcius);
			}
			int ct=(int)celcius;
			System.out.println(farhen + "\t" + ct);
		}

		s.close();
	}

}
